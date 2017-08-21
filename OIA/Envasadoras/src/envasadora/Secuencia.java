package envasadora;

public class Secuencia implements Cloneable {

	public Secuencia()
	{
		this.posInicial = -1;
		this.tamanio = 0;
	}
	
	
	public int getPosInicial()
	{
		return posInicial;
	}
	
	public int getTamanio()
	{
		return tamanio;
	}
	
	public void setPosInicial(int value){
		posInicial = value;
	}
	
	public int incrementarTamanio()
	{
		return ++tamanio;
	}
	
	  public Secuencia clone()
	    {
	        Secuencia clone = null;
	        try
	        {
	            clone = (Secuencia) super.clone();
	        } 
	        catch(CloneNotSupportedException e)
	        {
	            // No deberia ocurrir
	        }
	        return clone;
	    }
	
	
	private int posInicial;
	private int tamanio;
		
}
