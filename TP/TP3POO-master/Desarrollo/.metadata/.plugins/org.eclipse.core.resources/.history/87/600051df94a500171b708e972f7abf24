package item;

import personaje.Unidad;

public class Puñal extends EquipoDecorator {
	
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
		// TODO Auto-generated method stub
		return getPeleable().puedeRestauraEnergia();
	}
}
