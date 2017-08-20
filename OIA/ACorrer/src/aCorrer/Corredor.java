package aCorrer;

public class Corredor {
	
	public Corredor (int numero, short edad, char sexo){
		this.numero = numero;
		this.sexo = sexo;
		this.edad = edad;
		this.posicionGeneral = 0;
	}
	
	public short getEdad(){
		return edad;
	}

	public char getSexo(){
		return sexo;
	}
	
	
	public void setCategoria(Categoria categoria) {
		cat = categoria;
	}

	public Categoria getCategoria() {
		return cat;
	}

	public void setPosicionGeneral(int posicion) {
		posicionGeneral = posicion;
		cat.AsignarPremio(this);
	}

	public int getNumero() {
		return numero;
	}

	private int numero;
	private char sexo;
	private short edad;
	private Categoria cat;
	private int posicionGeneral;
}
