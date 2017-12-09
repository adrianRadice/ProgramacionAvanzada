package test;

import java.util.Arrays;

import grafo.Arista;
import grafo.Grafo;
import grafo.Nodo;

public class main {

	public static void main(String args[]){
		Grafo g = new Grafo(5);
		
		Nodo a = new Nodo(0,"a");
		Nodo b = new Nodo(1,"b");
		Nodo c = new Nodo(2,"c");
		Nodo d = new Nodo(3,"d");
		Nodo e = new Nodo(4,"e");
		
		Arista a1 = new Arista(a,b,true);
		Arista a2 = new Arista(a,c,true);
		Arista a3 = new Arista(b,d,true);
		Arista a4 = new Arista(c,d,true);
		Arista a5 = new Arista(d,e,true);
		
		g.addNodo(a);
		g.addNodo(b);
		g.addNodo(c);
		g.addNodo(d);
		g.addNodo(e);
		
		g.addArista(a1);
		g.addArista(a2);
		g.addArista(a3);
		g.addArista(a4);
		g.addArista(a5);
		
		System.out.println("SECUENCIAL");
		g.colorearSecuencialmente();
		for(Nodo n : g.getNodos())
			System.out.println(n);
		
		g.reiniciarColores();
		System.out.println("MATuLA");
		g.matula();
		for(Nodo n : g.getNodos())
			System.out.println(n);

		g.reiniciarColores();
		System.out.println("WELL");
		g.WelshPowell();
		for(Nodo n : g.getNodos())
			System.out.println(n);
	}

	
}
