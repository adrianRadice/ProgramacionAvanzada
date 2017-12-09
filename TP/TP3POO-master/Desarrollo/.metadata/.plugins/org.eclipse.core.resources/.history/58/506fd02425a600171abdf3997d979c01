package item;

import personaje.Unidad;

public class Puñal extends ItemDecorator {
	
	public Puñal(Unidad peleable){
		super(peleable);
	}
	public double getAtaque(){
		return getPeleable().getAtaque()+3;
	}
	public int getEnergia(){
		return getPeleable().getEnergia();
	}
	public double getDefensa(){
		return getPeleable().getDefensa()-3;
	}
	public boolean puedeRestauraEnergia() {
		return getPeleable().puedeRestauraEnergia();
	}
}
