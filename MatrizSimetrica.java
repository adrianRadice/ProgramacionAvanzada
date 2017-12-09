package grafo;

public class MatrizSimetrica {
	/**
	 * representa unidimencionalmente a la matriz.
	 */
	private int[] vec;
	/**
	 * almacena el valor con el que fue inicializado la matriz y qe sera usado para las pos m(i,i)
	 */
	private int valorInicial;
	
	/**
	 * Construye la matriz.
	 * @param orden. En el uso de grafo es la cantidad de nodos.
	 * @param infinito valor numerico que representa al infinto.
	 */
	public MatrizSimetrica(int orden, int valorInicial) {
		super();
		this.vec = new int[getSizeVec(orden)];
		this.valorInicial = valorInicial;
		inicializarMatriz(valorInicial);
	}
	
	/**
	 * Inicializa la matriz con el valor indicado.
	 * @param valorInicial
	 */
	private void inicializarMatriz(int valorInicial) {
		for (int i = 0; i < vec.length; i++) {
			vec[i] = valorInicial;
		}
	}

	/**
	 * Dado el orden de la matriz, nos devuelve la dimension del arreglo unidimensional equivalente.
	 * @param orden
	 * @return 
	 */
	private int getSizeVec(int orden) {
		return orden*(orden-1)/2;
	}

	/**
	 * Encapsula el acceso al arreglo como si se tratara de una matriz.
	 * @param fila
	 * @param columna
	 * @return
	 */
	public int getValue(int fila, int columna){
		return fila != columna ? vec[convert2D(fila,columna)]  : valorInicial; 
	}

	/**
	 * Encapsula el acceso al arreglo como si se tratara de una matriz.
	 * @param fila
	 * @param columna
	 * @return
	 */
	public void setValue(int fila, int columna, int value)
	{
		if(fila != columna)
			vec[convert2D(fila,columna)] = value; 
	}

	/**
	 * Retorna el equivalente unidimencional.
	 * @param fila
	 * @param columna
	 * @return
	 */
	private int convert2D(int fila, int columna) {
		if(fila > columna){
			int aux = fila;
			fila = columna;
			columna = aux;
		}
		return fila * getOrdenMatriz() + columna - (fila*fila + 3*fila + 2)/2;
	}
	
	/**
	 * Retorna el orden de la matriz. En grafo equivale a la cantidad de nodos.
	 * @return
	 */
	public int getOrdenMatriz() {
		return (int)(1 + Math.sqrt(1+8*vec.length)/2);
	}

	public int getValorInicial() {
		return valorInicial;
		
	}

}
