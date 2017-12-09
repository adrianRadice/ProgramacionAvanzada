package grafo;

public class MatrizSimetricaNoPonderada {
	
	private boolean vec[];
	
	public MatrizSimetricaNoPonderada(int cantidadDeNodos){
		vec = new boolean[getSizeArray(cantidadDeNodos)];
	}

	public boolean getValue(int fila, int columna){
		return fila != columna && vec [ convertirFilaColumnaEnIndice(fila,columna) ];
	}
	
	public void setValue(int fila, int columna, boolean value){
		if ( fila != columna )
			vec [ convertirFilaColumnaEnIndice(fila,columna) ] = value;
	}
	
	private int convertirFilaColumnaEnIndice(int fila, int columna){;
		if(fila > columna){
			int aux = fila;
			fila = columna;
			columna = aux;
		}
		int cantidadDeNodos = getOrdenMatriz();
		return fila * cantidadDeNodos + columna - (fila * fila + 3 * fila + 2)/2;
	}
	
	public int getOrdenMatriz(){
		return (int)(1+Math.sqrt((1+8*vec.length))/2);
	}
	
	private int getSizeArray(int cantidadDeNodos) {
		// TODO Auto-generated method stub
		return cantidadDeNodos * (cantidadDeNodos - 1) / 2;
	}
	
	
	
}
