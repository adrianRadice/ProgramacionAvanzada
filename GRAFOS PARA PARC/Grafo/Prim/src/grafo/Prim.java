package grafo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

import grafo.Arista;
import grafo.Grafo;
import grafo.NodoGenerico;


public class Prim {
	

	
	public static ArrayList<Arista> obtenerConRecorrido(Grafo grafo) throws Exception{
		
		int[] distancia = new int[grafo.getCantidadDeNodos()];
		ArrayList<Arista> padre = new ArrayList<Arista>();
		PriorityQueue<NodoGenerico> cola = new PriorityQueue<>();
		
		for(NodoGenerico n : grafo.getNodos()) {
			distancia[n.getIndex()] = grafo.getValorInfinito();
			padre.add(null);
			cola.add(n);
		}

		distancia[0] = 0;
		while(!cola.isEmpty()){
			NodoGenerico nodoActual = cola.poll();
			for(NodoGenerico n : grafo.getNodos()){
				if(nodoActual.getIndex() != n.getIndex()) {
					Arista a = grafo.getArista(nodoActual, new NodoGenerico(n.getIndex(),0));
					if(a != null){
						if(cola.contains(new NodoGenerico(n.getIndex(),distancia[n.getIndex()]))) {
							int dist = a.getCosto();
							if(dist < distancia[n.getIndex()]) {
								distancia[n.getIndex()] = dist;
								NodoGenerico nodoInsertar = new NodoGenerico(n.getIndex(),distancia[n.getIndex()]);
								if(cola.contains(nodoInsertar))
									cola.remove(nodoInsertar);
								cola.add(nodoInsertar);
								padre.set(n.getIndex(),new Arista(new NodoGenerico(n.getIndex()),new NodoGenerico(nodoActual.getIndex()),distancia[n.getIndex()]));
							}
						}
					}
				}
			}
		}

		return padre;
	}
	
	public static void main(String args[]) throws Exception{
			Grafo g = new Grafo(5,Integer.MAX_VALUE);
			
			Nodo nA = new Nodo(0,"A");
			Nodo nB = new Nodo(1,"B");
			Nodo nC = new Nodo(2,"C");
			Nodo nD = new Nodo(3,"D");
			Nodo nE = new Nodo(4,"E");
			
			g.addNodo(nA);
			g.addNodo(nB);
			g.addNodo(nC);
			g.addNodo(nD);
			g.addNodo(nE);
			
			g.addArista(new Arista(nA,nC,10));
			g.addArista(new Arista(nC,nD,1));
			g.addArista(new Arista(nB,nD,6));
			g.addArista(new Arista(nB,nA,12));
			g.addArista(new Arista(nA,nD,15));
			g.addArista(new Arista(nC,nB,2));
			g.addArista(new Arista(nB,nE,6));
			g.addArista(new Arista(nA,nE,20));
			
			System.out.println((Prim.obtenerConRecorrido(g)));
	}
	
}
