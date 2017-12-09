package Servidor; 
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket; 
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
 
public class Servidor { 
	private final static int CANT_CLIENTES = 100;
	private final static int PUERTO = 10002;
	private ArrayList<ServidorHilo> clientes; 
    private int contadorDeClientes = 0; 
    private int puerto;
    
	public Servidor(int puerto)
	{ 
	    clientes = new ArrayList<ServidorHilo>();
	    this.puerto = puerto;
	}

	private void atenderClientes() {
		try 
	    { 
		  ServerSocket servidor = new ServerSocket(puerto); 
	      while( contadorDeClientes < CANT_CLIENTES ) 
	      { 
	        Socket cliente = servidor.accept(); 
	        new ServidorHilo(cliente,this).start(); 
	        contadorDeClientes++; 
	        for(ServidorHilo hiloCliente : clientes) { 
		        hiloCliente.mostrarUsuariosEnLinea();
		    } 
	      } 
	      for(ServidorHilo hiloCliente : clientes) { 
	        hiloCliente.finalizar();
	      } 
	      servidor.close(); 	             
	    } 
	    catch (Exception e) 
		{ 
	    }
	} 

	public ArrayList<ServidorHilo> getClientes() { 
	   return clientes; 
	} 
	public void addCliente(ServidorHilo cliente) { 
	   clientes.add(cliente);
	} 
	
	public static void main(String[] args) throws UnknownHostException {
	  new Servidor(PUERTO).atenderClientes(); 
	}

	public void salir(ServidorHilo servidorHilo) throws IOException {
		clientes.remove(servidorHilo);
		for(ServidorHilo hiloCliente : clientes) { 
			new DataOutputStream(hiloCliente.getSocket().getOutputStream()).writeUTF("Se ha retirado -> "+servidorHilo.getName()); 
		} 
		
	} 
} 
