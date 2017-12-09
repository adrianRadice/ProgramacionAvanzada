package personaje;

public class Soldado extends Unidad{

	public Soldado(int posicion){
		super(200,posicion,100);
	}

	@Override
	public double getAtaque() {
		return 10;
	}

	@Override
	public double getDefensa() {
		return 1;
	}

	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia ==0;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return true;
	}

	@Override
	public void restaurarEnergia() {
		super.setEnergia(100);
	}

	@Override
	public double getAtaqueBase() {
		return 10;
	}

	@Override
	public double getDefensaBase() {
		// TODO Auto-generated method stub
		return 1;
	}
}
