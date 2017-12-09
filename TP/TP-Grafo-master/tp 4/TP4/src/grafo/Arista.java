package grafo;

public class Arista implements Comparable<Arista> {

	private int origen;
	private int destino;
	private int valor;
	
	public Arista(int origen, int destino, int valor) {
		// TODO Auto-generated constructor stub
		this.origen = origen;
		this.destino = destino;
		this.valor = valor;
	}

	public int getOrigen() {
		// TODO Auto-generated method stub
		return origen;
	}

	public int getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}

	@Override
	public int compareTo(Arista o) {
		// TODO Auto-generated method stub
		return valor > o.valor ? 1 : valor == o.valor ? 0 : -1;
	}

}
