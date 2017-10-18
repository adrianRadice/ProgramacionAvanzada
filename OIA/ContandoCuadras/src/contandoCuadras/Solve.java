package contandoCuadras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solve extends EjercicioOIA {

	private int cantidadDeCuadras;
	private int maximaDifAdmi;
	private int maximaCantHabNeutrales;
	private Cuadra[] cuadras;
	
	public Solve(File entrada, File salida) throws FileNotFoundException {
		super(entrada, salida);
		// TODO Auto-generated constructor stub
		
		Scanner sc = new Scanner(entrada);
		cuadras = new Cuadra[sc.nextInt()];
		maximaDifAdmi = sc.nextInt();
		maximaCantHabNeutrales = sc.nextInt();
		
		for(int i=0; i< cuadras.length; i++)
			cuadras[i] = new Cuadra(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		sc.close();
	}

	public void determinarCalles() {
		
		for(Cuadra c : cuadras)
		{
			if(c.getCantidadNeutrales()<= maximaCantHabNeutrales && c.getDiferencia() <= maximaDifAdmi)
				cantidadDeCuadras++;
		}
		
	}
	
	@Override
	public void resolver() {

		determinarCalles();
		
		PrintWriter pw;
		try {
			pw = new PrintWriter(salida);
			pw.println(cantidadDeCuadras);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String args[]) throws FileNotFoundException {
		new Solve(new File("entrada.in"),new File("salida.out")).resolver();
	}
}
