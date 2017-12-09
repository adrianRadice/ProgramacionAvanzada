package grafo;

public class NodoNombrado extends Nodo {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public NodoNombrado(int numero, String nombre) {
		super(numero);
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}

}
