package Algoritmo;

import java.util.PriorityQueue;

import grafo.Arista;
import grafo.Grafo;
import grafo.Nodo;

public class Dijkstra {

	public static int[] obtener(Grafo g, Nodo nodoInicial){
		int i;
		int[] distancia = new int[g.getCantidadDeNodos()];
		boolean[] visitado = new boolean[g.getCantidadDeNodos()];
		PriorityQueue<Nodo> cola = new PriorityQueue<Nodo>();
		Nodo[] nodos = new Nodo[g.getCantidadDeNodos()];
		for(i = 0; i<g.getCantidadDeNodos() ; i++){
			distancia[i] = g.getRepresentacionInfinito();
			visitado[i] = false;
		}
		
		distancia[nodoInicial.getIndex()] = 0;
		nodoInicial.setDistancia(0);
		cola.add(nodoInicial);
		
		while(!cola.isEmpty())
		{
			Nodo n = cola.poll();
			visitado[n.getIndex()] = true;
			
			for(i=0;i<g.getCantidadDeNodos();i++){
				if(i != n.getIndex()){
					Arista a = g.getArista(n, new Nodo(i,""));
					if(a.getCosto() != g.getRepresentacionInfinito()){
						int dist = a.getCosto() + n.getDistancia();
						if(!visitado[i] && dist < distancia[i]){
							distancia[i] = dist;
							Nodo nodoInsertar = new Nodo(i,g.getNodos()[i].getNombre());
							nodoInsertar.setDistancia(dist);
							cola.add(nodoInsertar);
							nodos[i] = n;
						}
					}
				}
			}
		}
		return distancia;
	}
}
