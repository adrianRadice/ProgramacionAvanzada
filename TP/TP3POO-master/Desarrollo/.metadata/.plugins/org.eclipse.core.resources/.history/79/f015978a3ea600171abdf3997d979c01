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
	

	@Override
	public double getAtaqueBase() {
		return getPeleable().getAtaqueBase();
	}

	@Override
	public double getDefensaBase() {
		// TODO Auto-generated method stub
		return getPeleable().getDefensaBase();
	}
	@Override
	public double getGastoEnergetico() {
		return getPeleable().getGastoEnergetico();
	}
	@Override
	public int getEnergiaMaxima() {
		// TODO Auto-generated method stub
		return getPeleable().getEnergiaMaxima();
	}
}
