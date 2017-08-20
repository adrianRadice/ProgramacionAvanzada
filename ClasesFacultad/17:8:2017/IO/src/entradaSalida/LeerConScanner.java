package entradaSalida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class LeerConScanner{

	/* este programa lee un archivo con el siguiente formato:
	   primera linea un entero n que indica la cantidad de numeros siguientes  que debo leer
	   seguido por  n numeros tipo  double
	   Ver mas ejemplos de Scanner en 
	   http://www.redeszone.net/2012/02/20/curso-de-java-entrada-y-salida-con-ficheros-clase-scanner/
    */

	public static void main(String[] args) throws FileNotFoundException {
		//String miPath = "/Users/adrian/Documents/workspace/";
		String miPath = "";
		Scanner sc = new Scanner(new File(miPath+"datos.in"));//LEE EL ARCHIVO SCANNER. File requiere el nombre completo del archivo en disco
		sc.useLocale(Locale.ENGLISH);//usamos english para tratar numeros decimales con '.'
		double [] vec = new double[sc.nextInt()]; // vector para almacenar la lectura
		//ARREGLO
		//Tipo [] nombre = new Tipo [tamanio];
		
		//sc.nextInt() => lee el proximo entero
		
		for (int i = 0; i < vec.length ; i++) {
			vec[i] =sc.nextDouble() ;
			System.out.println( vec[i]);
		}
		
		sc.close();//commit

	}

}
