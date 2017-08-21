package envasadora;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Secuencia maxPrimerLugar = null;
		Secuencia maxSegundoLugar = null;
		Secuencia secuenciaActual = null;
		
		Scanner sc = new Scanner(new FileReader("entrada.in"));
		String etiquetas = sc.nextLine();
		sc.close();
		
		int cantLatas = -1;
		for(int i = 0 ; i< etiquetas.length(); i++){
			Character c = etiquetas.charAt(i);
			if(c != ' ')
			{
				cantLatas ++;
				if(c == 'G')
				{
					if(secuenciaActual == null)
						secuenciaActual = new Secuencia(cantLatas);
					else
						secuenciaActual.incrementarTamanio();
				}
				else if(c != ' ' && secuenciaActual != null)
				{
					if( null == maxPrimerLugar )
						maxPrimerLugar = secuenciaActual.clone();
					else if( null == maxSegundoLugar )
					{
						if(secuenciaActual.getTamanio()> maxPrimerLugar.getTamanio())
						{
							maxSegundoLugar = maxPrimerLugar.clone();
							maxPrimerLugar = secuenciaActual.clone();
						}
						else
							maxSegundoLugar = secuenciaActual.clone();
					}
					else if(secuenciaActual.getTamanio()> maxSegundoLugar.getTamanio())
					{
							if(secuenciaActual.getTamanio() > maxPrimerLugar.getTamanio())
							{
								maxSegundoLugar = maxPrimerLugar.clone();
								maxPrimerLugar = secuenciaActual.clone();
							}
							else
								maxSegundoLugar = secuenciaActual.clone();
					}
					secuenciaActual = null;
				}
			}
		}
		
		PrintWriter salida = new PrintWriter(new File("salida.out"));
		salida.println(cantLatas);
		salida.println(maxPrimerLugar.getTamanio());
		salida.println(maxSegundoLugar.getTamanio());
		salida.println(Secuencia.getDistancia(maxPrimerLugar,maxSegundoLugar));
		salida.close();
		
	}

}
