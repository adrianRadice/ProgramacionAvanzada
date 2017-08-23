package pintandoBaldosas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Probador {
	private final static Character  SinPintar='*';
	private final static Character[]  Colores={'A','R','V'};
	
	public static boolean baldosaSinPintar(String s){
		return s.indexOf(Probador.SinPintar)!=-1;
	}
	
	public static boolean baldosaRepetdia(String s){
		return s.contains("AA")||s.contains("VV")||s.contains("RR") || s.charAt(0) == s.charAt(s.length()-1);
	}

	public static boolean faltaUnColor(String s){
		for(Character c : Probador.Colores)
			if(s.indexOf(c)==-1)
				return true;
		return false;
	}
	
	public static boolean baldosaOriginalCambiadaDeColor(String sin, String so){
		if( sin.length() > so.length() )
			return true;
		
		int index =-1, i =0;
		
		while(index == -1 && i < sin.length()) {
			index = sin.indexOf(Probador.Colores[i]);
			i++;
		}
		if(index == -1)
			return true;
		
		return sin.charAt(index) != so.charAt(index);		
	}
	
	public static boolean cambioCantidadDeBaldosas(String sin, String so){
		return sin.length() != so.length();
	}
	
	public static boolean DistintaCantidadDeColores(String so){
		
		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
		
		for(int i = 0; i< so.length(); i++)
		{
			ht.put(so.charAt(i),(ht.get(so.charAt(i))!=null?ht.get(so.charAt(i)):0)+1);
		}
		
		for(int i= 0; i<Probador.Colores.length-1; i++)
		{
			if(ht.get(Probador.Colores[i]) != ht.get(Probador.Colores[i+1]))
				return true;
		}
		
		return false;
	}
	
	public static void main(String args[]) throws IOException
	{
		Scanner scIn = new Scanner(new File("entrada.in"));
		String in = scIn.next();
		scIn.close();
		Scanner scOut = new Scanner(new File("salida.out"));
		String out = scOut.next();
		scOut.close();

		PrintWriter salida = new PrintWriter(new FileWriter("resultadoPrueba.out")); 
		salida.print((baldosaSinPintar(in)&baldosaRepetdia(in)&faltaUnColor(in)&cambioCantidadDeBaldosas(in,out)&baldosaOriginalCambiadaDeColor(in,out)&DistintaCantidadDeColores(in)));
		salida.close();
		
	}
}
