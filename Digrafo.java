package grafo;

public class Digrafo {
	private int[][] aristas;
	private int infinito;
	private Nodo[] nodos;
	
	public Digrafo(int cantidadNodos, int infinito){
		this.aristas = new int[cantidadNodos][cantidadNodos];
		this.infinito = infinito;
		this.nodos = new Nodo[cantidadNodos];
		inicializarMatriz();
	}

	public void setNodo(Nodo n){
		nodos[n.getIndex()] = n;
	}
	
	public void setArista(Arista a)
	{
		aristas[a.getN1().getIndex()][a.getN2().getIndex()] = a.getCosto();
	}
	
	public int getRepresentacionInfinito(){
		return infinito;
	}
	
	public int[][] getMatriz(){
		return aristas;
	}
	
	private void inicializarMatriz() {
		for(int i=0; i< this.aristas[0].length; i++){
			for(int j=0; j< this.aristas[0].length; j++){
				this.aristas[i][j] = this.infinito;
			}	
		}
	}
}
