package Comun;

public class Aparicion implements Comparable<Aparicion> {

	private String objeto;
	private int cantidad;
	
	public Aparicion(final String nombre)
	{
		this.objeto = nombre;
		this.cantidad = 1;
	}
	
	public boolean esMismo(final String nombre)
	{
		if( this.objeto.toLowerCase().equals( nombre.toLowerCase() ) )
		{
			cantidad ++;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aparicion other = (Aparicion) obj;
		if (objeto == null) {
			if (other.objeto != null)
				return false;
		} else if (!other.esMismo(this.objeto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  objeto + " " + cantidad;
	}

	@Override
	public int compareTo(final Aparicion o) {
		return cantidad == o.cantidad ? 0 : cantidad < o.cantidad ? 1 : -1;
	}
}
