package mesadasV2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class generadorFatiga {
	
	public static void main(String args[]) throws FileNotFoundException
	{	
		PrintWriter pw = new PrintWriter(new File("entrada.in"));
		int cont=2;
		pw.println(200000);
		pw.println(200000+" "+1);
		for(int i=199999; i>0; i--){
			pw.println(i+" "+cont);
			cont++;
		}
		pw.close();
	}


}
