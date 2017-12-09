package grafo;

public class NodoGenerico implements Comparable<NodoGenerico>{
	
	private int index;
	
	private int distancia; 
	
	public NodoGenerico(int index){
		this.index = index;
		distancia = Integer.MAX_VALUE;
	}
	public NodoGenerico(int index, int dist) {
		this.index = index;
		distancia = dist;
	}
	public void setIndex(int value){
		this.index = value;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	@Override
	public int compareTo(NodoGenerico nodo) {
		if(this.distancia > nodo.distancia){
			return 1;
		}
		else if(this.distancia < nodo.distancia){
			return -1;
		}
		return 0;
	}
	

}
