package envasadora;

public class Secuencia implements Cloneable {

	public Secuencia(int posInicial)
	{
		this.posInicial = posInicial;
		this.tamanio = 1;
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
        }
        return clone;
    }
	

	public static int getDistancia(Secuencia max1, Secuencia max2) {
		return max1.posInicial - max2.posInicial - (max1.posInicial>max2.posInicial ? max2.tamanio: max1.tamanio);
	}
		
	
	private int posInicial;
	private int tamanio;
	
}
