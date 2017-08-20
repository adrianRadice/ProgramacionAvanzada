import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
public class Palindromo {
	
	public static void main(String args[]) throws IOException
	{
		//RECUPERA LA CADENA
		Scanner sc = new Scanner(new File("entrada.in"));
		String cadenaIn = sc.next();
		sc.close();
		//RECUPERA LA CADENA
		
		Hashtable<String, Distinguida> distinguidas = Distinguida.obtenerDistinguidas(cadenaIn);
		
		//ESCRIBIR RESULTADOS
		PrintWriter salida = new PrintWriter(new FileWriter("salida.out")); 
		if(distinguidas == null)
			salida.println("La cadena no pudo analizarse.");
		else
		{
			Enumeration<String> claves = distinguidas.keys();
			while( claves.hasMoreElements() )
	        {
		        String clave = (String) claves.nextElement();
		        Distinguida valor = distinguidas.get(clave);
		        salida.print(clave+":  ");
		        salida.println(valor.toString());
	        }
		}
		//ESCRIBIR RESULTADOS
		salida.close();
	}
}

