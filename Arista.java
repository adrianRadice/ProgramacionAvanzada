package grafo;

public class Arista {

	private Nodo n1;
	private Nodo n2;
	private int costo;
	
	public Arista(Nodo n1, Nodo n2, int costo) {
		this.n1 = n1;
		this.n2 = n2;
		this.costo = costo;
	}

	public Nodo getN1() {
		return n1;
	}

	public void setN1(Nodo n1) {
		this.n1 = n1;
	}

	public Nodo getN2() {
		return n2;
	}

	public void setN2(Nodo n2) {
		this.n2 = n2;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Arista [n1=" + n1 + ", n2=" + n2 + ", costo=" + costo + "]";
	}
	
	

}
