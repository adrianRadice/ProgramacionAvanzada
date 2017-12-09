package grafo;

public class Nodo  {
	private int numero;
	private int color;
	private int grado;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public Nodo(int numero, int color) {
		super();
		this.numero = numero;
		this.color = color;
	}
	public Nodo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Nodo [numero=" + numero + ", color=" + color + "]";
	}
	
	public void aumentarGrado(){
		this.setGrado(this.getGrado() + 1);
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
}
