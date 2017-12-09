package grafo;

import java.util.ArrayList;

public class Grafo {

	private MatrizSimetrica aristas;
	private Nodo[] nodos;
	
	public Grafo(int cantidadDeNodos, int infinito){
		aristas = new MatrizSimetrica(cantidadDeNodos, infinito);
		nodos = new Nodo[cantidadDeNodos];
	}
	
	public int getRepresentacionInfinito()
	{
		return aristas.getValorInicial();
	}
	
	public Arista getArista(Nodo n1, Nodo n2){
		return new Arista(n1,n2,aristas.getValue(n1.getIndex(), n2.getIndex()));
	}
	
	public void setArista(Nodo n1, Nodo n2, int valor){
		n1.incrementarGrado();
		n2.incrementarGrado();
		aristas.setValue(n1.getIndex(), n2.getIndex(), valor);
	}
	
	public int getCantidadDeNodos(){
		return nodos.length;
	}
	
	public void setNodo(Nodo n){
		nodos[n.getIndex()] = n;
	}

	public ArrayList<Arista> getAristas() {
		
		ArrayList<Arista> aristas = new ArrayList<Arista>();
		
		int i,j,costo;
		for(i = 0; i<nodos.length -1; i++)
		{
			for( j=i+1; j<nodos.length; j++){
				costo = this.aristas.getValue(i, j);
				if(costo != this.aristas.getValorInicial())
					aristas.add(new Arista(nodos[i],nodos[j],costo));
			}
		}
		
		return aristas;
	}

	public ArrayList<Nodo> getAdyacentes(Nodo n) {
		ArrayList<Nodo> adyacentes = new ArrayList<Nodo>();
		
		for(Nodo ady : nodos)
		{
			if(ady.getIndex() != n.getIndex()){
				if(aristas.getValue(n.getIndex(), ady.getIndex()) != aristas.getValorInicial())
					adyacentes.add(ady);
			}
		}
		
		return adyacentes;
	}

	public Nodo[] getNodos() {
		// TODO Auto-generated method stub
		return nodos;
	}
}
