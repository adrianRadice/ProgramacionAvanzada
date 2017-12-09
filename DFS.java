package Algoritmo;

import java.util.Stack;

import grafo.Grafo;
import grafo.Nodo;

public class DFS {
	public static void recorrer(Grafo g, Nodo nodoInicial){
		boolean[] visitado =  new boolean[g.getCantidadDeNodos()];
		Stack<Nodo> pila = new Stack<Nodo>();
		
		pila.push(nodoInicial);
		visitado[nodoInicial.getIndex()] = true;
		
		while(!pila.isEmpty()){
			Nodo n = pila.pop();
			System.out.print(n + " ");
			for(Nodo ady : g.getAdyacentes(n)){
				if(!visitado[ady.getIndex()]){
					pila.push(ady);
					visitado[ady.getIndex()] = true;
				}
			}
		}
	}
}
