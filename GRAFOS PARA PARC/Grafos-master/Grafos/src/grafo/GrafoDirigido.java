package grafo;

import java.util.Arrays;

public class GrafoDirigido implements IGrafo {
	private int[][] matriz;
	private int valorInfinito;
	
	public GrafoDirigido(final int cantidadDeNodos,final int valorInfinito) {
		matriz = new int[cantidadDeNodos][cantidadDeNodos];
		this.valorInfinito = valorInfinito;
		for (int i = 0; i < matriz.length; i++) {
			for(int j=0; j<  matriz[0].length; j++)
			{
				matriz[i][j]=valorInfinito;
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see grafo.IGrafo#setConexion(grafo.Arista)
	 */
	@Override
	public void setConexion(Arista arista) throws Exception {
		matriz[arista.getNodoInicial().getNumero()][arista.getNodoFinal().getNumero()]=arista.getPeso();
	}
	
	/* (non-Javadoc)
	 * @see grafo.IGrafo#getArista(grafo.Nodo, grafo.Nodo)
	 */
	@Override
	public Arista getArista(Nodo nodoInicial, Nodo nodoFinal) throws Exception {
		int distancia = matriz[nodoInicial.getNumero()][nodoFinal.getNumero()];
		if(distancia == valorInfinito)
			return null;
		else
			return new Arista(nodoInicial,nodoFinal,distancia);
	}
	
	/* (non-Javadoc)
	 * @see grafo.IGrafo#getCantidadDeNodos()
	 */
	@Override
	public int getCantidadDeNodos() {
		return matriz[0].length;
	}

	public void imprimir() {
		for (int i = 0; i < matriz.length; i++) {
			for(int j=0; j< matriz[0].length; j++)
			{
				if(matriz[i][j]==valorInfinito)
					System.out.print("-");
				else
					System.out.print(matriz[i][j]);
				
			}
			System.out.println();
		}
	}

	/* (non-Javadoc)
	 * @see grafo.IGrafo#getValorInfinito()
	 */
	@Override
	public int getValorInfinito()
	{
		return this.valorInfinito;
	}
}
