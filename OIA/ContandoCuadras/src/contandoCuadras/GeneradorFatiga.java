package contandoCuadras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneradorFatiga {
	public static void generarFatiga() {
		
		PrintWriter pw = null ;
		try {
			pw = new PrintWriter(new File("entrada.in"));
			
			///*ACA IRIA LO QUE SE ESCRIBE EN EL ARCHIVO**/
			pw.println(1000+" "+500+" "+100);
			for(int i=0;i<1000;i++){
				pw.println(1000+" "+1000+" "+2000);
			}
			////
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(pw != null)
				pw.close();
		}
		
	}
	public static void main(String args[]) {
		GeneradorFatiga.generarFatiga();
	}
	
}
