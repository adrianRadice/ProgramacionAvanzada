package test;

public class Datos {
	private int cantColores;
	private int repeticion;
	
	public Datos(int c, int r)
	{
		this.cantColores=c;
		this.repeticion=r;
	}
	
	public Datos()
	{
	}
	
	public int getCantColores() {
		return cantColores;
	}
	public void setCantColores(int cantColores) {
		this.cantColores = cantColores;
	}
	public int getRepeticion() {
		return repeticion;
	}
	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

}
