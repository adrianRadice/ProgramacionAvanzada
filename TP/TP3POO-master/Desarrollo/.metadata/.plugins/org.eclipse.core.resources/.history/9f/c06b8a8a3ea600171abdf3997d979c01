package item;

import personaje.Unidad;

public class Capa extends ItemDecorator {
	
	
	public Capa(Unidad peleable){
		super(peleable);
	}
	public double getAtaque(){
		return getPeleable().getAtaque() - getPeleable().getAtaqueBase() * 0.1  ;
	}
	public int getEnergia(){
		return getPeleable().getEnergia() * 2;
	}
	public double getDefensa(){
		return getPeleable().getDefensa();
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
