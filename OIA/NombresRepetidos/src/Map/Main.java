package Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		Scanner sc = new Scanner(new FileReader("entrada.in"));
		int cantNombres = sc.nextInt();
		int cantResultado = sc.nextInt();
		
		for(int i = 0; i< cantNombres; i++)
		{
			String nombre = sc.next();
			if(map.containsKey(nombre))
				map.put(nombre,map.get(nombre) +1 );
			else
				map.put(nombre, 1 );
		}
		
		
		sc.close();
		
		PrintWriter pw = new PrintWriter(new File("salida.out"));
		
		Iterator it = ((HashMap<String, Integer>) Main.sortByValue(map)).entrySet().iterator();
		while (it.hasNext() && (cantResultado--) > 0) {
		    Map.Entry e = (Map.Entry)it.next();
		    pw.println(e.getKey() + " " + e.getValue());
		  //  cantResultado--;
		}

		pw.close();
	}
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
	    return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toMap(
	                Map.Entry::getKey,Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}

}
