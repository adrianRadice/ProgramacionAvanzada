package billetes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main extends EjercicioOIA {
	
	public Main(File entrada, File salida) {
		super(entrada, salida);
	}
	
	public void resolver(){
		try {
			Scanner sc = new Scanner(entrada);
			int posX=sc.nextInt();
			int posY=sc.nextInt();
			Tablero t = new Tablero(sc.nextInt(),sc.nextInt());
			t.agregarRobot(posX, posY);
			String ordenes= sc.next();
			for(int i=0;i<ordenes.length();i++)
				t.moverRobot( ordenes.charAt(i));
			sc.close();
			FileWriter fw=new FileWriter(salida);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(t.robot);
			pw.close();
			
			
			
		} catch (Exception e) {
			System.out.println("ERROR DIMENSION");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main(new File("entrada.in"), new File("salida.out")).resolver();
	} 
}
