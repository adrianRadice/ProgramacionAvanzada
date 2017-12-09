package grafo;

import java.util.Arrays;

public class MatrizSimetrica {
	private int[] matriz;
	private int valorInfinito;
	
	public MatrizSimetrica(final int cantidadDeNodos, final int valorInfinito)
	{
		this.matriz = new int[calcularTamanio(cantidadDeNodos)];
		this.valorInfinito = valorInfinito;
		inicializarMatriz();
	}
	
	public int getValorInfinito() {
		return valorInfinito;
	}

	public void setValorInfinito(int valorInfinito) {
		this.valorInfinito = valorInfinito;
	}

	public int getPosicion(int fila, int columna) throws Exception {
		if(fila == columna)
			throw new Exception("No se admiten ciclos");
		
		int cantidadDeNodos = getOrdenMatriz();
		if(fila>columna) {
			int aux = fila;
			fila = columna;
			columna = aux;
		}
		return matriz[fila*cantidadDeNodos+columna-(fila*fila+3*fila+2)/2];
	}
	
	public void setPosicion(int fila,int columna, final int value) throws Exception {
		if(fila == columna)
			throw new Exception("No se admiten ciclos");
		
		int cantidadDeNodos = getOrdenMatriz();
		if(fila>columna) {
			int aux = fila;
			fila = columna;
			columna = aux;
		}
		matriz[fila*cantidadDeNodos+columna-(fila*fila+3*fila+2)/2] = value;
		
	}
	
	public void inicializarMatriz()
	{
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = valorInfinito;
		}
	}
	
	public int getOrdenMatriz() {
		return (int)(1+Math.sqrt((1+8*matriz.length))/2);
	}
	
	public int calcularTamanio(final int cantidadDeNodos) {
		return cantidadDeNodos*(cantidadDeNodos-1)/2;
	}


	@Override
	public String toString() {
		return "MatrizSimetrica [matriz=" + Arrays.toString(matriz) + ", valorInfinito=" + valorInfinito + "]";
	}
}