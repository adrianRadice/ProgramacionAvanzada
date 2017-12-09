package grafo;

public class Nodo {

	private int numero;
	
	public Nodo(int numero) {
		super();
		this.numero = numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Nodo [numero=" + numero + "]";
	}


}