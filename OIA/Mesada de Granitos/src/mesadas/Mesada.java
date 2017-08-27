package mesadas;

public class Mesada implements Comparable<Mesada> {
	
	private int x;
	private int y;
	
	public Mesada (final int x, final int y)
	{
		//CAMBIO LO COMENTADO PARA NO HACER LA CLASE DEPENDIENTE DE LA SOLUCION Y PERMITIR INSTANCIAR OBJETOS EN UN SENTIDO PARTICULAR
		/*if(x >= y)
		{
			this.x = x;
			this.y = y;
		}
		else
		{
			this.x = y;
			this.y = x;
		}*/
		this.x = x;
		this.y = y;
	}
	
	public void rotar()
	{
		int aux = x;
		this.x = y;
		this.y = aux;
	}
	

	@Override
	public int compareTo(Mesada o) {
		if(this.x > o.x)
			return -1;
		if(this.x < o.x)
			return 1;
		if(this.y > o.y)
			return -1;
		if(this.y < o.y)
			return 1;
		return 0;
	}
	
	public boolean entraEn(Mesada o){
		//LA PRIMERA COMPARACION NO SERIA NECESARIA EN EL DOMINIO DE LA SOLUCION DEL PROBLEMA PERO INDEPENDIZO  A LA CLASE
		return this.x <= o.x && this.y <= o.y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
}
