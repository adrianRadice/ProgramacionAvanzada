package aCorrer;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	public Categoria ( int numero, short edadMin, short edadMax, Sexo sexo ){
		this.numero  = numero;
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		this.sexo = sexo;
		this.premiados = new ArrayList<Corredor>();
	}
	
	public boolean valido(Corredor corredor) {
		if(corredor.getEdad()>edadMax || corredor.getEdad() < edadMin)
			return false;
		corredor.setCategoria(this);
		return true;
	}

	public void AsignarPremio(Corredor corredor) {
		if(premiados.size() < 3)
			premiados.add(corredor);
	}

	public List<Corredor> getPremiados() {
		return premiados;
	}

	public int getNumero(){
		return numero;
	}

	public Sexo getSexo() {
		return sexo;
	}
	
	private int numero;
	private short edadMin;
	private short edadMax;
	private Sexo sexo;
	private List<Corredor> premiados;
	
	
}