package tiposDeDatosAbstractos;

import java.util.Arrays;

//EN ESTA CLASE QUEREMOS INDICAR QUE OBJETOS DE LA CLASE PODRAN COMPARARSE ENTONCES IMPLEMENTAMOS Comparable<TIPO>.
public class Complejo implements Comparable<Complejo> {

	//ATRIBUTOS
	private double imaginario;
	private double real;
	//ATRIBUTOS

	//CONSTRUCTORS
	//SOBRECARGAMOS LOS CONTRUCTORES Y HACEMOS DOS TIPOS
	//POR DEFECTO.
	public Complejo() {
		this(0,0); //invoca al constructor parametrizado
		//this.imaginario = 0;
		//this.real = 0;
	}
	//PARAMETRIZADO
	public Complejo(double real, double imaginario) {
		this.imaginario = imaginario;
		this.real = real;
	}
	//NOTA: Si no se crea un constructor se hereda el que es por defecto de Object
	//CONSTRUCTORS
	
	//METODOS

	public double getImaginario() {
		return imaginario;
	}
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	
	public Complejo sumar(Complejo c){
		return new Complejo(this.real+c.real,this.imaginario+c.imaginario);
	}
	//SOBRECARGA ESTATICA
	public static Complejo sumar(Complejo c1, Complejo c2){
		return new Complejo(c1.real+c2.real,c1.imaginario+c2.imaginario);
	}

	public Complejo restar(Complejo c){
		return new Complejo(this.real-c.real,this.imaginario-c.imaginario);
	}
	//SOBRECARGA ESTATICA
	public static Complejo restar(Complejo c1, Complejo c2){
		return new Complejo(c1.real-c2.real,c1.imaginario-c2.imaginario);
	}
	
	public Complejo multiplicar(Complejo c)
	{
		return new Complejo(this.real * c.real - this.imaginario * c.imaginario,
							this.real * c.imaginario + this.imaginario * c.real);
	}
	public Double modulo(){
		return Math.sqrt(Math.pow(this.real, 2)+Math.pow(this.imaginario, 2));
	}
	
	@Override
	public int compareTo(Complejo o) {
		return this.modulo().compareTo(o.modulo());

		//double dif = this.modulo()-o.modulo() ;
		//return dif==0?0:(dif>0?0:-1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //Compara referencia
			return true;
		if (obj == null) //NULL == NULL EN ALGUNOS CASOS ANDA EN OTROS NO
			return false;
		if (getClass() != obj.getClass()) //COMPARA SI SON DE DISTINTAS CLASES
			return false;
		Complejo other = (Complejo) obj;//CASTEA AL TIPO
		//doubleToLongBits => Mejora la precision de la comparacion
		if (Double.doubleToLongBits(imaginario) != Double.doubleToLongBits(other.imaginario))//Double => Clase de envoltura (Se comportan como el tipo primitivo pero le agregan funcionalidad)
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}
	
	//SOBRE ESCRIBIMOS EL METODO DEFENIDO EN SU CLASE PADRE OBJECT
	@Override
	public String toString() {
		return  "("+this.real+","+this.imaginario+")";
	}

	public Complejo clone()
	{
		return new Complejo(this.real,this.imaginario);
	}
	
	//METODOS
	public static void main(String[] args) {
		Complejo z1 = new Complejo(2,3);
		Complejo z2 = new Complejo(0,0);
		
		System.out.println("Z1 = "+z1);
		System.out.println("Z2 = "+z2);
		System.out.println("Z1 + Z2 = "+z1.sumar(z2));
		System.out.println("Z1 - Z2 = "+z1.restar(z2));
		System.out.println("Z1 * Z2 = "+z1.multiplicar(z2));
		System.out.println("Z1 + Z2 = "+Complejo.sumar(z1,z2));
		System.out.println("Z1 - Z2 = "+Complejo.restar(z1,z2));
		System.out.println("|Z1| = "+z1.modulo());
		System.out.println("Z1' = "+z1.clone());
		System.out.println("Z1 == Z1' = "+z1.equals(z1.clone()));
		System.out.println("Z1 == Z2 = "+z1.equals(z2));
		
		Complejo[] complejos = new Complejo[3];
		complejos[0]= new Complejo(3,3);
		complejos[1]= new Complejo(1,1);
		complejos[2]= new Complejo(4,4);
		
		System.out.println("SIN ORDENAR");
		for(Complejo c : complejos)
			System.out.println(c);
		
		System.out.println("ORDENADO");
		Arrays.sort(complejos);
		for(Complejo c : complejos)
			System.out.println(c);
		
		

	}

	

}
