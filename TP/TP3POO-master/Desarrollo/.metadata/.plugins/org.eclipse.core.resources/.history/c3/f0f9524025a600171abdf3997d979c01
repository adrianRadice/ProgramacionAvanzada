package item;

import personaje.Unidad;

public class Escudo extends ItemDecorator {
	
	public Escudo(Unidad peleable){
		super(peleable);
	}
	public double getAtaque(){
		return getPeleable().getAtaque();
	}
	public int getEnergia(){
		return getPeleable().getEnergia();
	}
	public double getDefensa(){
		return getPeleable().getDefensa() +  getPeleable().getDefensa()*0.4;
	}
	public boolean puedeRestauraEnergia() {
		return getPeleable().puedeRestauraEnergia();
	}

}
