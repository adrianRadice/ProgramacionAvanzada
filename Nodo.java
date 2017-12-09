package grafo;

public class Nodo implements Comparable<Nodo>{
	/**
	 * Se emplea para mapear arreglos con nodos.
	 */
	private int index;
	/**
	 * Representacion simbolica del nodo.
	 */
	private String nombre;
	
	private int color;
	
	private int grado;

	private int distancia;
	
	/**
	 * 
	 * @param index valor empleado para mapear con los arreglos.
	 * @param nombre representacion simbolica de los nodos
	 */
	public Nodo(int index, String nombre) {
		super();
		this.index = index;
		this.nombre = nombre;
		this.color = -1;
		this.grado = 0;
		
		this.distancia = 0;
	}

	public Nodo(int index, String nombre, int distancia) {
		super();
		this.index = index;
		this.nombre = nombre;
		this.color = -1;
		this.grado = 0;
		
		this.distancia = distancia;
	}
	
	
	/**
	 * Consigue el indice representativo del nodo para mapear con los arreglos
	 * @return
	 */
	public int getIndex() {
		// TODO Auto-generated method stub
		return index;
	}

	/**
	 * Representacion simbolica del nodo.
	 */
	public String getNombre(){
		return nombre;
	}

	@Override
	public String toString() {
		return nombre +" c(" + color + ")";
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getGrado() {
		// TODO Auto-generated method stub
		return grado;
	}
	
	public void incrementarGrado(){
		grado++;
	}

	@Override
	public int compareTo(Nodo o) {
		if(this.distancia > o.distancia)
			return 1;
		if(this.distancia < o.distancia)
			return -1;
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distancia;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		if (distancia != other.distancia || this.getIndex() != this.getIndex())
			return false;
		return true;
	}
	
	
	
	public void setDistancia(int i) {
		// TODO Auto-generated method stub
		distancia = i;
	}

	public int getDistancia() {
		// TODO Auto-generated method stub
		return distancia;
	}

	
	
}
