package item;

import personaje.Unidad;

public class Personaje extends Unidad implements Peleable{	

	private Unidad unidad;
	
	
	public Personaje(Unidad unidad) {
		super(unidad);
		this.unidad = unidad;
	}

	@Override
	public double getAtaque() {
		return unidad.getAtaque();
	}

	@Override
	public int getEnergia() {
		return unidad.getEnergia();
	}

	@Override
	public double getDefensa() {
		return unidad.getDefensa();
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return unidad.puedeRestauraEnergia();
	}
	
}
