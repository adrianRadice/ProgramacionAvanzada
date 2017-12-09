package grafo;

public class Arista {
	private NodoGenerico nodoIzq;
	private NodoGenerico nodoDer;
	private int costo;
	
	public Arista(NodoGenerico nodoIzq, NodoGenerico nodoDer, int costo) {
		super();
		this.nodoIzq = nodoIzq;
		this.nodoDer = nodoDer;
		this.costo = costo;
	}
	
	public NodoGenerico getNodoIzq() {
		return nodoIzq;
	}
	public void setNodoIzq(NodoGenerico nodoIzq) {
		this.nodoIzq = nodoIzq;
	}
	public NodoGenerico getNodoDer() {
		return nodoDer;
	}
	public void setNodoDer(NodoGenerico nodoDer) {
		this.nodoDer = nodoDer;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
}
