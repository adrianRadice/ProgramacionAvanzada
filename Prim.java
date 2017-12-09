package Algoritmo;

import java.util.ArrayList;
import java.util.PriorityQueue;

import grafo.Arista;
import grafo.Grafo;
import grafo.Nodo;

public class Prim {
	public static ArrayList<Arista> obtenerConRecorrido(Grafo grafo) throws Exception{
		
		int distancia[] = new int[grafo.getCantidadDeNodos()];
		ArrayList<Arista> padre = new ArrayList<Arista>();
		PriorityQueue<Nodo> cola = new PriorityQueue<>();
	
		
		for(int j = 0; j < grafo.getCantidadDeNodos(); j++) {
			distancia[j] = grafo.getRepresentacionInfinito();
			padre.add(null);
			cola.add(new Nodo(j, grafo.getNodos()[j].toString(),grafo.getRepresentacionInfinito()));
		}

		distancia[0]=0;
		
		while(!cola.isEmpty()){
			Nodo nodoActual = cola.poll();
			for(int ady = 0; ady < grafo.getCantidadDeNodos(); ady++)
			{
				if(nodoActual.getIndex() != grafo.getNodos()[ady].getIndex()) 
				{
					Arista a = grafo.getArista(nodoActual, grafo.getNodos()[ady]);
					if(a != null)
					{
						Nodo nodoInsertar = new Nodo(grafo.getNodos()[ady].getIndex(),grafo.getNodos()[ady].getNombre(),distancia[grafo.getNodos()[ady].getIndex()]);
						if(cola.contains(nodoInsertar)) 
						{
							int dist = a.getCosto();
							if(dist <distancia[grafo.getNodos()[ady].getIndex()]) {
								distancia[grafo.getNodos()[ady].getIndex()] = dist;
								nodoInsertar.setDistancia(dist);
								if(cola.contains(nodoInsertar))
									cola.remove(nodoInsertar);
								cola.add(nodoInsertar);
								padre.set(grafo.getNodos()[ady].getIndex(),new Arista(grafo.getNodos()[ady],nodoActual,distancia[grafo.getNodos()[ady].getIndex()]));
							}
						}
					}
				}
			}
		}

		return padre;
	}
}
