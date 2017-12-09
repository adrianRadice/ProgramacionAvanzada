package grafo;

public class Digrafo implements Igrafo{
	private int[][] aristas;
	private Nodo[] nodos;
	private int valorInfinito;
	
	public Digrafo(final int cantidadDeNodos,final int valorInfinito) {
		aristas = new int[cantidadDeNodos][cantidadDeNodos];
		nodos = new Nodo[cantidadDeNodos];
		this.valorInfinito = valorInfinito;
		for (int i = 0; i < aristas.length; i++) {
			for(int j=0; j<  aristas[0].length; j++)
			{
				aristas[i][j]=valorInfinito;
			}
		}
	}
	
	
	/* (non-Javadoc)
	 * @see grafo.IGrafo#getArista(grafo.Nodo, grafo.Nodo)
	 */
	@Override
	public Arista getArista(NodoGenerico nodoInicial, NodoGenerico nodoFinal) {
		int distancia = aristas[nodoInicial.getIndex()][nodoFinal.getIndex()];
		if(distancia == valorInfinito)
			return null;
		else
			return new Arista(nodoInicial,nodoFinal,distancia);
	}
	
	public void addNodo(Nodo n){
		nodos[n.getIndex()] = n;
	}
	
	public void addArista(Arista a){
		aristas[a.getNodoIzq().getIndex()][ a.getNodoDer().getIndex()] =a.getCosto();
	}
	
	/* (non-Javadoc)
	 * @see grafo.IGrafo#getCantidadDeNodos()
	 */
	@Override
	public int getCantidadDeNodos() {
		return nodos.length;
	}

	public void imprimirGrafo() {
		for (int i = 0; i < aristas.length; i++) {
			for(int j=0; j< aristas[0].length; j++)
			{
				if(aristas[i][j]==valorInfinito)
					System.out.print("-");
				else
					System.out.print(aristas[i][j]);
				
			}
			System.out.println();
		}
	}


	@Override
	public Nodo[] getNodos() {
		return nodos;
	}

}