package mesadasV2;


public class Mesada implements Comparable<Mesada> {
	
	private int x;
	private int y;
	
	public Mesada (final int x, final int y)
	{
		if(x >= y)
		{
			this.x = x;
			this.y = y;
		}
		else
		{
			this.x = y;
			this.y = x;
		}
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
		return  this.y >= o.y;
	}

}
