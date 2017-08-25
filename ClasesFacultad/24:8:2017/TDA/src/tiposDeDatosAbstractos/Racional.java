package tiposDeDatosAbstractos;

//INTERFAZ => DEFINE COMPORTAMIENTO
public class Racional implements Comparable<Racional> {

	//ATRIBUTOS
	private long numerador;
	private long denominador;
	//ATRIBUTOS
	
	//CONSTRUCTORES
	public Racional(long numerador, long denominador) {
		if(denominador == 0)
			throw new IllegalArgumentException("El denominador no puede ser cero");
		this.numerador = numerador;
		this.denominador = denominador;
	}
	//CONSTRUCTORES
	
	//METODOS
	public Racional sumar(Racional r){
		return new Racional(numerador*r.denominador+ r.numerador*denominador,
								denominador*r.denominador);
	}
	public Racional restar(Racional r){
		return new Racional(numerador*r.denominador- r.numerador*denominador,
								denominador*r.denominador);
	}	
	public Racional multiplicar(Racional r){
		return new Racional(  numerador*r.numerador,
							denominador*r.denominador);
	}	
	public Racional dividir(Racional r){
		return new Racional(  numerador*r.denominador,
							denominador*r.numerador);
	}	

	public static Racional sumar(Racional r1,Racional r2){
		return new Racional(r1.numerador*r2.denominador+ r2.numerador*r1.denominador,
								r1.denominador*r2.denominador);
	}
	public static Racional restar(Racional r1,Racional r2){
		return new Racional(r1.numerador*r2.denominador- r2.numerador*r1.denominador,
								r1.denominador*r2.denominador);
	}	
	public static Racional multiplicar(Racional r1,Racional r2){
		return new Racional(  r1.numerador*r2.numerador,
							r1.denominador*r2.denominador);
	}	
	public static Racional dividir(Racional r1,Racional r2){

		return new Racional(  r1.numerador*r2.denominador,
							r1.denominador*r2.numerador);
	}
		
	public Racional Clone(Racional r)
	{
		return new Racional(r.denominador,r.numerador);
	}
	
	@Override
	public String toString()
	{
		String ret;
		if(denominador == 1)
			return numerador + "";
		return numerador +"/" + denominador;
	}
	public double toReal(){
		return numerador / denominador;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Racional other = (Racional) obj;
		if (denominador != other.denominador)
			return false;
		if (numerador != other.numerador)
			return false;
		return true;
	}
	@Override
	public int compareTo(Racional o) {
		double dif = this.toReal()-this.toReal();
		if(dif>0)
			return 1;
		if(dif<0)
			return -1;
		return 0;
	}
	//METODOS
}
