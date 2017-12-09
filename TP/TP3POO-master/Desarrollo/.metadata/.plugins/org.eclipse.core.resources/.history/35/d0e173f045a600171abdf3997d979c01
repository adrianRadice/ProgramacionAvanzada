package personaje;
/**
 * @author adrian
 *
 */
public class Soldado extends Unidad{

	private static final int SALUD = 200;
	private static final int ENERGIA = 100;
	private static final int ATAQUE = 10;
	private static final int DEFENSA = 1;
	
	public Soldado(int posicion){
		super(SALUD,posicion,ENERGIA);
	}

	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	@Override
	public double getDefensa() {
		return DEFENSA;
	}

	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia ==0;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return super.puedeRestauraEnergia();
	}

	@Override
	public void restaurarEnergia() {
		if(puedeRestauraEnergia())
			super.setEnergia(ENERGIA);
	}

	@Override
	public double getAtaqueBase() {
		return ATAQUE;
	}

	@Override
	public double getDefensaBase() {
		// TODO Auto-generated method stub
		return DEFENSA;
	}
	
	@Override
	public int getEnergiaMaxima() {
		// TODO Auto-generated method stub
		return ENERGIA;
	}

	@Override
	public double getGastoEnergetico() {
		return 10;
	}

	
}
