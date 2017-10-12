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
			
			Robot robot = new Robot(sc.nextInt(), sc.nextInt());
			Tablero tablero = new Tablero(sc.nextInt(),sc.nextInt());
			tablero.agregarRobot(robot);
			String ordenes= sc.next();
			sc.close();
			
			if(ordenes.length() > 250){
				throw new Exception("CANTIDAD DE ORDENES INVALIDA");
			}
			
			for(int i=0;i<ordenes.length();i++)
				robot.mover( ordenes.charAt(i) );
			
			
			FileWriter fw=new FileWriter(salida);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(robot);
			pw.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main(new File("entrada.in"), new File("salida.out")).resolver();
	} 
}
