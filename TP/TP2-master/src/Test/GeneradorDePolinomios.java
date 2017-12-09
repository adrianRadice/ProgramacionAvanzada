package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneradorDePolinomios {
	public static final int N = 1000;

	public static void main(String args[]) throws FileNotFoundException {
		PrintWriter salida = new PrintWriter(new File("entrada.in"));
		salida.println(N);
		for (int i = 0; i <= N; i++)
			salida.println(i);
		salida.close();
	}
}
