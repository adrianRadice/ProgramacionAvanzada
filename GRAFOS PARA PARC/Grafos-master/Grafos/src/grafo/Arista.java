package grafo;

public class Arista {

	private Nodo nodoInicial;
	private Nodo nodoFinal;
	private int peso;

	public Arista(Nodo nodoInicial, Nodo nodoFinal, int peso) {
		super();
		this.nodoInicial = nodoInicial;
		this.nodoFinal = nodoFinal;
		this.peso = peso;
	}

	public Nodo getNodoInicial() {
		// TODO Auto-generated method stub
		return this.nodoInicial;
	}

	public Nodo getNodoFinal() {
		// TODO Auto-generated method stub
		return this.nodoFinal;
	}

	public int getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}
}
