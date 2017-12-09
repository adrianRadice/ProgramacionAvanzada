package personaje;
/**
 * @author adrian
 *
 */
public class Soldado extends Unidad{

	private static final int SALUD = 200;
	private static final int ENERGIA = 100;
	private static final int ATAQUE = 10;
	private static final int DEFENSA = 0;
	
	/**
	 * Crea un soldado con sus atributos correspondientes
	 * */
	public Soldado(int posicion){
		super(SALUD,posicion,ENERGIA);
	}

	/**
	 * El soldado realiza un ataque
	 * */
	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	/**
	 * Indica la defensa del soldado
	 * */
	@Override
	public double getDefensa(double valor ) {
		return DEFENSA;
	}

	/**
	 * Devuelve si el soldado puede atacar respecto a la posición de su enemigo con la suya
	 * */
	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia ==0;
	}

	/**
	 * Indica si puede restaurar la eneregia el soldado
	 * */
	@Override
	public boolean puedeRestauraEnergia() {
		return super.puedeRestauraEnergia();
	}

	
	@Override
	public void restaurarEnergia() {
		if(puedeRestauraEnergia())
			super.setEnergia(ENERGIA);
	}

	/**
	 * Ataque base del arquero
	 * */
	@Override
	public double getAtaqueBase() {
		return ATAQUE;
	}

	
	/**
	 * Defensa base del arquero
	 * */
	@Override
	public double getDefensaBase() {
		return DEFENSA;
	}
	
	/**
	 * Restaura la energía máxima del arquero
	 * */
	@Override
	public int getEnergiaMaxima() {
		return ENERGIA;
	}

	/**
	 * Gasto energético del arquero
	 * */
	@Override
	public double getGastoEnergetico() {
		return 10;
	}


	
}
