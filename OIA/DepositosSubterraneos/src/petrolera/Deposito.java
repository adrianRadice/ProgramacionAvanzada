package petrolera;

public class Deposito {

	private int profundidad;
	private int superficie;

	public Deposito(int superficie, int profundidad) {
		// TODO Auto-generated constructor stub
		this.superficie = superficie;
		this.profundidad = profundidad;
	}

	public int getProfundidad() {
		// TODO Auto-generated method stub
		
		return profundidad;
	}

	public int getVolumen() {
		// TODO Auto-generated method stub
		return superficie*profundidad;
	}

	public int getSuperficie() {
		// TODO Auto-generated method stub
		return superficie;
	}

}
