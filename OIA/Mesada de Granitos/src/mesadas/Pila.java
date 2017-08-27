package mesadas;

import java.util.ArrayList;

public class Pila {
	private ArrayList<Mesada> mesadas;
	
	public Pila() {
		mesadas = new  ArrayList<Mesada>();
	}
	
	public boolean apilable(Mesada m){
		return mesadas.size() == 0 || m.entraEn(mesadas.get(mesadas.size()-1));
	}
	
	public void apilar(Mesada m){
		mesadas.add(m);
	}

}
