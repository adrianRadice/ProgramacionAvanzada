package grafo;

public class Nodo  extends NodoGenerico{

	private String nombre;
	private int color;
	
	public Nodo(int index, String nombre) {
		super(index);
		this.nombre = nombre;
		this.color = -1;
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Nodo [nombre=" + nombre + ", color=" + color + "]";
	}
	
	
}