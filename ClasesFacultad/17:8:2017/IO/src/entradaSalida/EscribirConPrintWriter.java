package entradaSalida;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// esto es un ejemplo minimo para  grabar sus datos en un archivo  de texto
public class EscribirConPrintWriter {

	public static void main(String[] args)	throws IOException {

		String miPath = "/Users/adrian/Documents/workspace/";
		
		PrintWriter salida = new PrintWriter(new FileWriter(miPath+"salida.out"));  //  preparo el arch de salida
	     
	    int z=38696030;
	    String s="dni:";
	    salida.print(s);      
		salida.println(" "+z); 
		salida.close(); //esto escribe : dni: 50

	}

}
