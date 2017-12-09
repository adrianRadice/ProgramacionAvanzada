package Algoritmo;

import java.util.LinkedList;
import java.util.Queue;

import grafo.Grafo;
import grafo.Nodo;

public class BFS {

	public static void recorrer(Grafo g, Nodo nodoInicial){
		boolean[] visitado = new boolean[g.getCantidadDeNodos()];
		Queue<Nodo> cola = new LinkedList<Nodo>();
		
		visitado[nodoInicial.getIndex()] = true;
		cola.add(nodoInicial);
		
		while(!cola.isEmpty()){
			Nodo n = cola.poll();
			for(Nodo ady : g.getAdyacentes(n)){
				if(!visitado[ady.getIndex()]){
					cola.add(ady);
					visitado[ady.getIndex()] = true;
					
					System.out.print(ady + " ");
					
				}
			}
		}
		
	}
}
