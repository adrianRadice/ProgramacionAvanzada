package test;

import grafo.Arista;
import grafo.Digrafo;
import grafo.Dijkstra;
import grafo.Grafo;
import grafo.Igrafo;
import grafo.Nodo;

public class main {

	public static void main(String agrs[]) throws Exception{
		System.out.println("No DIRIGIDO");
		testNoDirigido();
		System.out.println("DIRIGIDO");
		testDirigido();
	}

	private static void testNoDirigido() throws Exception {
		Igrafo g = new Grafo(5,Integer.MAX_VALUE);
		
		Nodo a = new Nodo(0,"a");
		Nodo b = new Nodo(1,"b");
		Nodo c = new Nodo(2,"c");
		Nodo d = new Nodo(3,"d");
		Nodo e = new Nodo(4,"e");
		
		Arista a1 = new Arista(a,b,170);
		Arista a2 = new Arista(a,c,1);
		Arista a3 = new Arista(b,d,12);
		Arista a4 = new Arista(c,d,1);
		Arista a5 = new Arista(d,e,1);
		
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
		
		int[] dist = Dijkstra.obtener(g, a);
		
		for(Nodo n : g.getNodos())
			System.out.println(a.getNombre()+" "+ n.getNombre() + " " + dist[n.getIndex()]);
	}
	
	private static void testDirigido() throws Exception {
		Igrafo g = new Digrafo(5,Integer.MAX_VALUE);
		
		Nodo a = new Nodo(0,"a");
		Nodo b = new Nodo(1,"b");
		Nodo c = new Nodo(2,"c");
		Nodo d = new Nodo(3,"d");
		Nodo e = new Nodo(4,"e");
		
		Arista a1 = new Arista(a,b,170);
		Arista a2 = new Arista(a,c,1);
		Arista a3 = new Arista(b,d,12);
		Arista a4 = new Arista(c,d,1);
		Arista a5 = new Arista(d,e,1);
		
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
		
		int[] dist = Dijkstra.obtener(g, a);
		
		for(Nodo n : g.getNodos())
			System.out.println(a.getNombre()+" "+ n.getNombre() + " " + dist[n.getIndex()]);
	}
}
