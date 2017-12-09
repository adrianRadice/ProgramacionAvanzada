package test;

import java.nio.channels.GatheringByteChannel;
import java.util.Arrays;

import Algoritmo.BFS;
import Algoritmo.Coloreo;
import Algoritmo.DFS;
import Algoritmo.Dijkstra;
import Algoritmo.Floyd;
import Algoritmo.Prim;
import grafo.Arista;
import grafo.Digrafo;
import grafo.Grafo;
import grafo.Nodo;

public class test {
	public static void main(String args[]) throws Exception
	{
		Nodo nA = new Nodo(0,"A");
		Nodo nB = new Nodo(1,"B");
		Nodo nC = new Nodo(2,"C");
		Nodo nD = new Nodo(3,"D");
		Nodo nE = new Nodo(4,"E");
		
		Grafo g = new Grafo(5,Integer.MAX_VALUE);
		g.setNodo(nA);
		g.setNodo(nB);
		g.setNodo(nC);
		g.setNodo(nD);
		g.setNodo(nE);
		
		g.setArista(nA, nB, 1);
		g.setArista(nA, nC, 2);
		g.setArista(nB, nD, 1);
		g.setArista(nC, nD, 1);
		g.setArista(nD, nE, 1);
		
		System.out.println("GRAFO=");
		for(Arista a : g.getAristas())
			System.out.println(a);		
		

		System.out.println();
		System.out.print("Dijkstra= ");
		int [] dist = Dijkstra.obtener(g, nA);
		for(Nodo n : g.getNodos())
			System.out.print(n.getNombre() + "(" + dist[n.getIndex()] + ") ");

	
		System.out.println();
		
		System.out.print("BFS= " + nA + " ");
		BFS.recorrer(g, nA);
		System.out.println();
		System.out.print("DFS= ");
		DFS.recorrer(g, nA);

		System.out.println();
		System.out.print("Coloreo Secuencial= ");
		Coloreo.coloreoSecuencial(g);
		for(Nodo n:  g.getNodos()){
			System.out.print(n +" ");
		}
	
		System.out.println();
		System.out.print("Coloreo Matula= ");
		Coloreo.coloreoMatula(g);
		for(Nodo n:  g.getNodos()){
			System.out.print(n +" ");
		}
	
		System.out.println();
		System.out.print("Coloreo Well= ");
		Coloreo.coloreoWell(g);
		for(Nodo n:  g.getNodos()){
			System.out.print(n +" ");
		}
		

		Digrafo d = new Digrafo(5,Integer.MAX_VALUE);
		d.setNodo(nA);
		d.setNodo(nB);
		d.setNodo(nC);
		d.setNodo(nD);
		d.setNodo(nE);
		
		d.setArista(new Arista(nA,nB,5));
		d.setArista(new Arista(nB,nD,3));
		d.setArista(new Arista(nD,nA,6));
		d.setArista(new Arista(nA,nC,1));
		d.setArista(new Arista(nC,nE,2));
		d.setArista(new Arista(nD,nE,4));
		
		System.out.println();
		System.out.print("FLOYD= ");
		int mat[][] = Floyd.obtener(d);
		for(int i=0; i< mat[0].length; i++){
			System.out.println();
			for(int j=0; j< mat[0].length; j++)
				if(mat[i][j]==Integer.MAX_VALUE)
					System.out.print(" - ");		
				else
					System.out.print(" " +mat[i][j]+" ");
		
		}
		
		
		testPrim();
		
		
	}

	private static void testPrim() throws Exception {
		// TODO Auto-generated method stub
		Grafo g2 = new Grafo(5, Integer.MAX_VALUE);

		Nodo nA = new Nodo(0,"A");
		Nodo nB = new Nodo(1,"B");
		Nodo nC = new Nodo(2,"C");
		Nodo nD = new Nodo(3,"D");
		Nodo nE = new Nodo(4,"E");
		
		g2.setNodo(nA);
		g2.setNodo(nB);
		g2.setNodo(nC);
		g2.setNodo(nD);
		g2.setNodo(nE);
		
		g2.setArista(nA,nC,10);
		g2.setArista(nA,nB,12);
		g2.setArista(nA,nD,15);
		g2.setArista(nA,nE,20);
		g2.setArista(nC,nD,1);
		g2.setArista(nC,nB,2);
		g2.setArista(nC,nE,4);
		g2.setArista(nE,nD,1);
		g2.setArista(nE,nB,6);
		g2.setArista(nD,nB,6);
	
		System.out.println();
		System.out.print("Prim= ");
		for(Arista n:  Prim.obtenerConRecorrido(g2)){
			System.out.println(n +" ");
		}
		
	}
}
