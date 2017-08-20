package secuenciaMaxima;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecuenciaMaxima {

	public static void main(String args[]) throws IOException{

		//RECUPERA LA CADENA
		Scanner sc = new Scanner(new File("entrada.in"));
		int secuenciaMaxima = 0;
		int cantValidos = 0;
		for(int i =0, secuenciaActual = 0, cantValores = sc.nextInt() ; i< cantValores; i++)
		{
			int num = sc.nextInt();
			if (num%2 == 0 || num %3 == 0 || num % 5 == 0)
			{
				if (secuenciaActual > secuenciaMaxima)
					secuenciaMaxima = secuenciaActual;
				secuenciaActual=0;
			}
			else
			{
				cantValidos++;
				secuenciaActual++;
			}
		}
		
		sc.close();

		PrintWriter salida = new PrintWriter(new FileWriter("salida.out")); 
		salida.println(cantValidos);
		salida.println(secuenciaMaxima);
		salida.close();
	}
}
