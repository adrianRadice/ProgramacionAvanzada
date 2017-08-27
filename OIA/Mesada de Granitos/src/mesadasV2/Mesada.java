package mesadasV2;


public class Mesada implements Comparable<Mesada> {
	
	private int x;
	private int y;
	
	public Mesada (final int x, final int y)
	{
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

	public boolean apilable(Mesada o) {
		return  this.x >= o.x && this.y >= o.y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
