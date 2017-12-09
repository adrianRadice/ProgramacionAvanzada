package item;

import personaje.Unidad;

public class Capa extends EquipoDecorator {
	
	public Capa(Unidad peleable){
		super(peleable);
	}
	public double getAtaque(){
		return getPeleable().getAtaque() - getPeleable().getAtaque() * 0.1  ;
	}
	public int getEnergia(){
		return getPeleable().getEnergia() * 2;
	}
	public double getDefensa(){
		return getPeleable().getDefensa();
	}
	public boolean puedeRestauraEnergia() {
		// TODO Auto-generated method stub
		return getPeleable().puedeRestauraEnergia();
	}
}
