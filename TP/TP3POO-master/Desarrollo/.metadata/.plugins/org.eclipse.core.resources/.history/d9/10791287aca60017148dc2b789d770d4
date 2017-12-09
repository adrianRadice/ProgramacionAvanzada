package personaje;
/**
 * @author adrian
 *
 */
public class Lancero  extends Unidad{
	private static final int SALUD = 150;
	private static final int ENERGIA = 1;
	private static final int ATAQUE = 25;
	private static final int DEFENSA = 0;

	public Lancero(int posicion){
		super(SALUD,posicion,ENERGIA);
	}
	
	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	@Override
	public double getDefensa(double valor) {
		return DEFENSA;
	}
	
	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 1 && distancia <= 3 ;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return false;
	}

	@Override
	public double getAtaqueBase() {
		// TODO Auto-generated method stub
		return ATAQUE;
	}

	@Override
	public double getDefensaBase() {
		// TODO Auto-generated method stub
		return DEFENSA;
	}

	@Override
	public double getGastoEnergetico() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getEnergiaMaxima() {
		// TODO Auto-generated method stub
		return ENERGIA;
	}

}
