package torneo;

public class Luchador {

	private double peso;
	private double altura;
	
	public Luchador(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public boolean domina(Luchador l){
		return !(this.altura< l.altura || this.peso<l.peso);
	}

}
