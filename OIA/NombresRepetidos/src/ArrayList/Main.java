package ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Aparicion> apariciones = new ArrayList<Aparicion>();
		
		Scanner sc = new Scanner(new FileReader("entrada.in"));
		int cantNombres = sc.nextInt();
		int cantResultado = sc.nextInt();
		
		for(int i = 0; i< cantNombres; i++)
		{
			Aparicion nombre = new Aparicion(sc.next());
			if(apariciones.indexOf(nombre)== -1)
				apariciones.add(nombre);
		}
		
		sc.close();
		
		Collections.sort(apariciones);
		
		PrintWriter pw = new PrintWriter(new File("salida.out"));
		
		for(int i = 0 ; i< cantResultado && i < apariciones.size(); i++)
			pw.println(apariciones.get(i));
		
		pw.close();
	}

}
