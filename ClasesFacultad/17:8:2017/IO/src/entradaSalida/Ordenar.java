package entradaSalida;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) throws IOException {
		String miPath = "/Users/adrian/Documents/workspace/";
		Scanner sc = new Scanner(new File(miPath+"enteros.in"));
		sc.useLocale(Locale.ENGLISH);
		int [] vec = new int[sc.nextInt()]; 
		
		for (int i = 0; i < vec.length ; i++) 
			vec[i] =sc.nextInt() ;
		
		sc.close();//commit
		Arrays.sort(vec);
		
		PrintWriter salida = new PrintWriter(new FileWriter(miPath+"ordenados.out"));  
		for (int i = 0; i < vec.length ; i++) 
			salida.println(" "+vec[i]); 
		salida.close(); 
	}

}
