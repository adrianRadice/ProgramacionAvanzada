package grafo;

public class NodoGenerico implements Comparable<NodoGenerico>{
	
	private int index;
	private int grado;
	
	private int distancia; //atributo utilizado para realizar dijkstra
	
	
	public NodoGenerico(int index){
		this.index = index;
		grado = 0 ;
		distancia = Integer.MAX_VALUE;
	}
	public void setIndex(int value){
		this.index = value;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public int getGrado(){
		return this.grado;
	}
	
	public void aumentarGrado(){
		this.grado++;
	}
	
	public void disminuirGrado(){
		this.grado--;
	}
	
	public void reinciarGrado(){
		this.grado=0;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
///por dij
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
