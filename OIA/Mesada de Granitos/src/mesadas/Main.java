package mesadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws FileNotFoundException
	{
		ArrayList<Pila> pilas = new ArrayList<Pila>();
		Mesada mesadas [] = leerArchivo("entrada.in");
		Arrays.sort(mesadas);
		for ( Mesada m : mesadas )
		{
			boolean f = true;
			for ( Pila p : pilas )
			{
				if(p.apilable(m)){
					p.apilar(m);
					f=false;
				}
			}
			if(f)
			{
				Pila p = new Pila();
				p.apilar(m);
				pilas.add(p);
			}
		}
		imprimirResultado(pilas.size());
		
	}
	
	/**
	 * RECUPERO LAS MESADAS DEL ARCHIVO, ROTANDOLAS PARA QUE QUEDEN ORDENADAS DEL LADO MAYOR AL MENOR
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Mesada[] leerArchivo(final String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader(path));
		int cant = sc.nextInt();
		Mesada[]  mesadas = new Mesada[cant];
		
		//CON EL CONSTRUCTOR COMENTADO
		//while(cant>0)
		//	mesadas[--cant] = new Mesada(sc.nextInt(),sc.nextInt());
		
		while(cant>0){
			mesadas[--cant] = new Mesada(sc.nextInt(),sc.nextInt());
			if(mesadas[cant].getX()<mesadas[cant].getY())
				mesadas[cant].rotar();
		}
		
		sc.close();
		return mesadas;
	}
	
	public static void imprimirResultado(final int resultado) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File("salida.out"));
		pw.println(resultado);
		pw.close();
	}
	
}
