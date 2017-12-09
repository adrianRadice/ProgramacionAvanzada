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

	
	/**
	 * Se crea un lancero con sus atributos correspondientes
	 * */
	public Lancero(int posicion){
		super(SALUD,posicion,ENERGIA);
	}
	
	/**
	 * Ataque del lancero
	 * */
	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	/**
	 * Defensa del lancero
	 * */
	@Override
	public double getDefensa(double valor) {
		return DEFENSA;
	}
	
	/**
	 * Indica si el lancero puede atacar evaluando la posición del enemigo respecto de la suya
	 * */
	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 1 && distancia <= 3 ;
	}



	@Override
	public void restaurarEnergia() {
	}

	/**
	 *  Indica si puede restaurar la energia del lancero
	 * */
	@Override
	public boolean puedeRestauraEnergia() {
		return false;
	}

	/**
	 * Ataque base del lancero
	 * */
	@Override
	public double getAtaqueBase() {
		return ATAQUE;
	}

	/**
	 * Defensa base del lancero
	 * */
	@Override
	public double getDefensaBase() {
		return DEFENSA;
	}

	/**
	 * Gasto energético del lancero
	 * */
	@Override
	public double getGastoEnergetico() {
		return 0;
	}

	/**
	 * Restaura la energía del arquero por completo
	 * */
	@Override
	public int getEnergiaMaxima() {
		// TODO Auto-generated method stub
		return ENERGIA;
	}

}
