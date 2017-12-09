package personaje;

import item.Equipo;

public class Arquero extends Unidad {
	public Arquero(int posicion) {
		super(50, posicion,new Equipo(5,0,20));
	}


	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 2 && distancia <= 5 ;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return true;
	}

	@Override
	public void restaurarEnergia() {
		super.equipamiento().setEnergia(super.equipamiento().getEnergia()+3);
		
	}



}
