package grafo;
;

public class Grafo{

	private MatrizSimetrica aristas;
	private Nodo[] nodos;
	
	public Grafo(int cantidadDeNodos,int infinito){
		aristas= new MatrizSimetrica(cantidadDeNodos,infinito);
		nodos = new Nodo[cantidadDeNodos];
	}
	
	public void addNodo(Nodo n){
		nodos[n.getIndex()] = n;
	}
	
	public void addArista(Arista a){
		aristas.setValue(a.getNodoIzq().getIndex(), a.getNodoDer().getIndex(), a.getCosto());
	}

	public int getCantidadDeNodos() {
		// TODO Auto-generated method stub
		return aristas.getOrdenMatriz();
	}

	public Arista getArista(NodoGenerico nodoInicial, NodoGenerico nodoFinal) {
		
		int distancia = aristas.getValue(nodoInicial.getIndex(), nodoFinal.getIndex());
		if(distancia == aristas.getValorInifinito())
			return null;
		else
			return new Arista(nodoInicial,nodoFinal,distancia);
	}
	

	public Nodo[] getNodos() {
		// TODO Auto-generated method stub
		return nodos;
	}

	public int getValorInfinito() {
		// TODO Auto-generated method stub
		return aristas.getValorInifinito();
	}
	
	
}
