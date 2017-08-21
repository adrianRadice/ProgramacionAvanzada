package envasadora;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Secuencia max1 = null;
		Secuencia max2 = null;
		Secuencia max = new Secuencia();
		Scanner sc = new Scanner(new FileReader("entrada.in"));
		String etiquetas = sc.nextLine();
		sc.close();
		
		int cant = -1;
		for(int i = 0 ; i< etiquetas.length(); i++){
			Character c = etiquetas.charAt(i);
			if(c != ' ')
				cant ++;
			
			if(c == 'G')
			{
				if(max.getPosInicial() == -1)
					max.setPosInicial(cant);
				max.incrementarTamanio();
			}
			else if(c != ' ' && max.getPosInicial()!=-1)
			{
				if( null == max1 )
				{
					max1 = max.clone();
				}
				else if( null == max2 )
				{
					if(max.getTamanio()> max1.getTamanio())
					{
						max2 = max1.clone();
						max1 = max.clone();
					}
					else
						max2 = max.clone();
				}
				else
				{
					if(max.getTamanio()> max2.getTamanio())
					{
						if(max.getTamanio() > max1.getTamanio())
						{
							max2 = max1.clone();
							max1 = max.clone();
						}
						else
						{
							max2 = max.clone();
						}
					}
				}
				max = new Secuencia();
			}
		}
		
		PrintWriter salida = new PrintWriter(new File("salida.out"));
		salida.println(cant);
		salida.println(max1.getTamanio());
		salida.println(max2.getTamanio());
		salida.println(max1.getPosInicial() - max2.getPosInicial() - (max1.getPosInicial()>max2.getPosInicial() ? max2.getTamanio(): max1.getTamanio()));
		salida.close();
		
	}

}
