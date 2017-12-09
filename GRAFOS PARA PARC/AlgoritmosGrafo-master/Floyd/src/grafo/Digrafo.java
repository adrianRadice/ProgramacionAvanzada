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
	
	
	public int[][] floyd()
	{
		int mat[][] = aristas;	
	    for(int i = 0; i < nodos.length; i++)
	        mat[i][i] = 0;
		 for(int k = 0; k < nodos.length; k++)
		        for(int i = 0; i < nodos.length; i++)
		            for(int j = 0; j < nodos.length; j++){
		            	if(mat[i][k] != Integer.MAX_VALUE && mat[k][j] != Integer.MAX_VALUE){
		                int dt = mat[i][k] + mat[k][j];
		                if(mat[i][j] > dt)
		                    mat[i][j] = dt;
		            	}
		            }
		 return mat;
	}
	
	public static void main(String args[]){
		Nodo n1 = new Nodo(0,"1");
		Nodo n2 = new Nodo(1,"2");
		Nodo n3 = new Nodo(2,"3");
		Digrafo g= new Digrafo(3,Integer.MAX_VALUE);
		g.addArista(new Arista(n1,n2,8));
		g.addArista(new Arista(n3,n2,2));
		g.addArista(new Arista(n1,n3,5));
		int mat[][] =g.floyd();
		for(int i =0;i<mat[0].length;i++){
			System.out.println();
			for(int j =0;j<mat[0].length;j++){
				if(mat[i][j]!=g.valorInfinito)
					System.out.print(mat[i][j]+ "   ");
				else
					System.out.print("inf ");
					
			}
		}
	}

}