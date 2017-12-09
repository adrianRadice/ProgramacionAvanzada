package grafo;

import java.util.ArrayList;
import java.util.PriorityQueue;

import grafo.Arista;
import grafo.Nodo;
import grafo.NodoGenerico;

public class Dijkstra {

public static int[] obtener(Igrafo grafo, NodoGenerico nodoInicial) throws Exception{
		
		int[] distancia  = new int[grafo.getCantidadDeNodos()];
		boolean[] visitado  = new boolean[grafo.getCantidadDeNodos()];
		
		for(int i=0; i<grafo.getCantidadDeNodos(); i++){
			distancia[i] = Integer.MAX_VALUE;
			visitado[i] = false;
		}
		
		distancia[nodoInicial.getIndex()] = 0;
		nodoInicial.setDistancia(0);
		
		PriorityQueue<NodoGenerico> cola = new PriorityQueue<>();
		cola.add(nodoInicial);
		
		while(!cola.isEmpty()){
			NodoGenerico nodoActual = cola.poll();
			visitado[nodoActual.getIndex()] = true;
			for(int ady = 0; ady < grafo.getCantidadDeNodos(); ady++){
				if(nodoActual.getIndex() != ady) {
					Arista a = grafo.getArista(nodoActual, new NodoGenerico(ady));
					if(a != null){
						int dist = a.getCosto()+nodoActual.getDistancia();
						if(!visitado[ady] && dist <distancia[ady]) {
							distancia[ady] = dist;
							NodoGenerico nodoInsertar = new NodoGenerico(ady);
							nodoInsertar.setDistancia(dist);
							if(cola.contains(nodoInsertar))
								cola.remove(nodoInsertar);
							cola.add(nodoInsertar);
						}
					}
				}
			}
		}
		
 		return distancia;
	}
}
