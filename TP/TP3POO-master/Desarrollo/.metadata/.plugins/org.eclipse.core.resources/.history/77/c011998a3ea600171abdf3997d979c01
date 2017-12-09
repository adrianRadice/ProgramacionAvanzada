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
		return getPeleable().getDefensa() +  getPeleable().getDefensaBase()*0.4;
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
