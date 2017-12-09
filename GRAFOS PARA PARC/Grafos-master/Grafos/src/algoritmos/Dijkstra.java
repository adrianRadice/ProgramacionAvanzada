package algoritmos;

import java.util.ArrayList;
import java.util.PriorityQueue;

import grafo.Arista;
import grafo.IGrafo;
import grafo.Nodo;
import grafo.NodoConCosto;

public class Dijkstra {
	public static ArrayList<NodoConCosto> obtenerConRecorrido(IGrafo grafo, Nodo nodoInicial) throws Exception{
		
		ArrayList<NodoConCosto> distancia = new ArrayList<NodoConCosto>();
		ArrayList<Boolean> visitado = new ArrayList<Boolean>();
		PriorityQueue<NodoConCosto> cola = new PriorityQueue<>();
		
		for(int j = 0; j < grafo.getCantidadDeNodos(); j++) {
			distancia.add(new NodoConCosto(0,grafo.getValorInfinito()));
			visitado.add(false);
		}
		
		distancia.set(nodoInicial.getNumero(), new NodoConCosto(nodoInicial.getNumero(),0));
		cola.add(new NodoConCosto(nodoInicial.getNumero(),0));
		
		while(!cola.isEmpty()){
			NodoConCosto nodoActual = cola.poll();
			visitado.set(nodoActual.getNumero(), true);
			for(int ady = 0; ady < grafo.getCantidadDeNodos(); ady++){
				if(nodoActual.getNumero() != ady) {
					Arista a = grafo.getArista(nodoActual, new Nodo(ady));
					if(a != null){
						int dist = a.getPeso()+nodoActual.getPeso();
						if(!visitado.get(ady) && dist <distancia.get(ady).getPeso()) {
							distancia.set(ady,new NodoConCosto(ady,dist));
							NodoConCosto nodoInsertar = new NodoConCosto(ady,distancia.get(ady).getPeso());
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