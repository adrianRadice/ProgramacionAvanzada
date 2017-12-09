package grafo;

import java.util.Arrays;

import algoritmos.Dijkstra;

public class GrafoNoDirigido {

	public MatrizSimetrica aristas;
	public Nodo[] nodos;
	
	public GrafoNoDirigido(int cantidadDeNodos){
		aristas= new MatrizSimetrica(cantidadDeNodos,Integer.MAX_VALUE);
		nodos = new Nodo[cantidadDeNodos];
	}
	
	public void addNodo(Nodo n){
		nodos[n.getIndex()] = n;
	}
	
	public void addArista(Arista a){
		aristas.setValue(a.getNodoIzq().getIndex(), a.getNodoDer().getIndex(), a.getCosto());
	}
	
	public void imprimirGrafo(){
		for(Nodo n : nodos){
			for(int i=0; i< nodos.length; i++){
				if(n.getIndex() != nodos[i].getIndex()){
					int costo = aristas.getValue(n.getIndex(),  nodos[i].getIndex());
					if(costo != aristas.getValorInifinito()){
						System.out.print(n.getNombre());
						System.out.print(" ");
						System.out.print(costo);
						System.out.print(" ");
						System.out.print(nodos[i].getNombre());	
						System.out.println();
					}
				}
			}
		}
	}
	
	public static void main(String agrs[]) throws Exception{
		GrafoNoDirigido g = new GrafoNoDirigido(5);
		
		Nodo a = new Nodo(0,"a");
		Nodo b = new Nodo(1,"b");
		Nodo c = new Nodo(2,"c");
		Nodo d = new Nodo(3,"d");
		Nodo e = new Nodo(4,"e");
		
		Arista a1 = new Arista(a,b,10);
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
		
		int[] dist = Dijkstra.obtenerConRecorrido(g, a);
		
		for(Nodo n : g.nodos)
			System.out.println(a.getNombre()+" "+ n.getNombre() + " " + dist[n.getIndex()]);
	}

	public int getCantidadDeNodos() {
		// TODO Auto-generated method stub
		return aristas.getOrdenMatriz();
	}

	public Arista getArista(NodoGenerico nodoInicial, NodoGenerico nodoFinal) throws Exception {
		
		int distancia = aristas.getValue(nodoInicial.getIndex(), nodoFinal.getIndex());
		if(distancia == aristas.getValorInifinito())
			return null;
		else
			return new Arista(nodoInicial,nodoFinal,distancia);
	}
}
