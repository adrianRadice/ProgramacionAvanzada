package pintandoBaldosas;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PintandoBaldosas {

	public static void main(String[] args) throws Exception {
		String patron="ARV";
		Scanner sc = new Scanner(new File("entrada.in"));
		String hilera = sc.next();
		sc.close();
		int index = hilera.indexOf("V");
		if(index ==-1) {
			patron = "RVA";
			if((index = hilera.indexOf("A")) ==-1){
				patron = "AVR";
				if(-1 == (index=hilera.indexOf("R")))
					throw new Exception("Error cadena");
			}
		}

		char[] baldosas = hilera.toCharArray();
		int color=0;
		for(int i = index +1; i < hilera.length(); i++,color = color==2?0:color+1)
			baldosas[i]= patron.charAt(color);
		for(int i = 0; i<index; i++,color = color==2?0:color+1)
			baldosas[i]= patron.charAt(color);
		
		PrintWriter salida = new PrintWriter(new FileWriter("salida.out")); 
		salida.print(baldosas);
		salida.close();
	}

}
