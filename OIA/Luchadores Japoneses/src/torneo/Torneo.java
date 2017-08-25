package torneo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Torneo {

	private Luchador[] luchadores;
	private int[] dominados; 
	
	public Torneo(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader(path));
		luchadores = new Luchador[sc.nextInt()];
		dominados = new int[luchadores.length];
		for(int i = 0 ; i< luchadores.length ; i++ )
			luchadores[i] = new Luchador(sc.nextDouble(),sc.nextDouble());
		sc.close();
	}
	
	public void resolver(){
		for(int i = 0 ; i < luchadores.length ; i++){
			for (int j = i+1; j < luchadores.length; j++){
				if (luchadores[i].domina(luchadores[j]))
					dominados[i]++;
				if (luchadores[j].domina(luchadores[i]))
					dominados[j]++;
			}
		}
	}
	
	public void imprimir() throws FileNotFoundException{
		PrintWriter salida = new PrintWriter(new File("salida.out"));
		for (int i : dominados)
			salida.println(i);
		salida.close();
	}

}
