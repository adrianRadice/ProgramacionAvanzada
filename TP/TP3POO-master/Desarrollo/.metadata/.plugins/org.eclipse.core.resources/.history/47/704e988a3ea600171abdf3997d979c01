package item;

import personaje.Unidad;

public abstract class ItemDecorator extends Unidad {
	private Unidad peleable;

	public ItemDecorator(Unidad peleable) {
		super(peleable);
		this.peleable = peleable;
	}

	public Unidad getPeleable() {
		return peleable;
	}

	public void setPeleable(Unidad peleable) {
		this.peleable = peleable;
	}
	
	//no se si pueden ser abstract
	public abstract double getAtaque();
	public abstract int getEnergia() ;
	public abstract double getDefensa() ;

	

}
