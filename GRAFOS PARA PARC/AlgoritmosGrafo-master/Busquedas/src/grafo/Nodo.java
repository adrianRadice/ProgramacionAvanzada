package grafo;

public class Nodo  extends NodoGenerico{

	private String nombre;
	
	public Nodo(int index, String nombre) {
		super(index);
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nodo [nombre=" + nombre + "]";
	}
	
	
}
