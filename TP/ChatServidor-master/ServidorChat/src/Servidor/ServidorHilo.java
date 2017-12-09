package Servidor; 
 
import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.Socket;
import java.util.ArrayList;

public class ServidorHilo extends Thread implements IMensajes { 
	private Socket socketCliente; 
	private Servidor servidor; 
	private DataInputStream entrada; 
	private boolean corriendo = false;
	
	public ServidorHilo(Socket cliente, Servidor servidor) throws IOException { 
		this.servidor = servidor; 
		this.socketCliente = cliente; 
		this.entrada = new DataInputStream(cliente.getInputStream()); 
		setNick();
		servidor.addCliente(this);
	} 

	public void setNick() throws IOException {
	    boolean cambiarNick = true;  
	    String nick="" ;
	    while(cambiarNick) {
		  	enviarMensaje(socketCliente,"nick:>");
		    nick = entrada.readUTF();
		    cambiarNick=false;
        	ArrayList<ServidorHilo> clientes = servidor.getClientes();
		    for(int i=0; i<clientes.size()&&!cambiarNick;i++)
        	{
        		if(clientes.get(i).getName().equals(nick))
        		{
        			enviarMensaje(socketCliente,"<<<YA EXISTE UNA CONEXION CON ESTE NOMBRE>>>");
        			cambiarNick = true;
        		}
        	}	
	    }
	    this.setName(nick); 
	}
	
	public void mostrarUsuariosEnLinea() throws IOException {
	    DataOutputStream d =new DataOutputStream(socketCliente.getOutputStream()); 
	    d.writeUTF("Usuarios en linea: "); 
	    for(ServidorHilo cliente : servidor.getClientes())
	    	d.writeUTF(cliente.getName());
	}

	public void enviarMensaje(Socket para, String mensaje) throws IOException {
	   new DataOutputStream(para.getOutputStream()).writeUTF(mensaje); 
	}
	
	public void finalizar() throws IOException {
		socketCliente.close();
		//entrada.close();
		corriendo = false;		
	} 
	
	public void run() {
		String mensaje = ""; 
	    corriendo = true;
	    try 
	    { 
	      mensaje = entrada.readUTF(); 
	      while(corriendo && !mensaje.equals(FINALIZAR)) 
	      {
	    	  if( mensaje.charAt(0) == DESTINO_PUNTUAL )
	    	  {
	    		  String nickDestino = mensaje.split(" ")[0].substring(1);   
	    		  ArrayList<ServidorHilo> clientes = servidor.getClientes();
		          int i;
		          for(i=0; i<clientes.size();i++)
		          {
		        	  if(clientes.get(i).getName().equals( nickDestino))
		        	  {
		        		  String mensajeFInal = "\n"+this.getName()+": " +mensaje.substring(nickDestino.length()+2);
		        		  enviarMensaje(clientes.get(i).socketCliente,mensajeFInal); 
		        		  i =clientes.size();
		        	  }
		          }		
		          if(i==clientes.size())	
		        	  enviarMensaje(socketCliente,"DestinoInvalido");
	          } 
		      else
		      { 
			          for(ServidorHilo c : servidor.getClientes())
			          {
			        	  if(this != c)
			        		  enviarMensaje(c.socketCliente,"\n"+this.getName()+": " +mensaje);  
			          }
		      } 
	          mensaje = entrada.readUTF(); 
	      }
    	  if(mensaje.equals(FINALIZAR))
    	  {
        	  enviarMensaje(socketCliente,FIN_CONEXION);
        	  servidor.salir(this);
    	  }
	     }  
	     catch (Exception e) { 
	    	 System.out.println("El cliente se ha desconectado"); 
	     }

  }

	public Socket getSocket() {
		
		return socketCliente;
	}
	
}