package grafo;

public class NodoConCosto extends Nodo implements Comparable<NodoConCosto> {

	private int peso;
	
	public NodoConCosto(int numero, int peso) {
		super(numero);
		this.peso = peso;
		// TODO Auto-generated constructor stub
	}
	public int getPeso() {
		return peso;
	}
	public void setCosto(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "(nodo = "+super.getNumero() + "; distancia=" +peso + ")" ;
	}
	
	@Override
	public int compareTo(NodoConCosto nodo) {
		if(this.peso > nodo.peso){
			return 1;
		}
		else if(this.peso < nodo.peso){
			return -1;
		}
		return 0;
	}
}
