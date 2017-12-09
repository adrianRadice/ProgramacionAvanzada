package personaje;

/**
 * @author adrian
 *
 */
public class Arquero extends Unidad {
	private static final int SALUD = 50;
	private static final int ENERGIA = 20;
	private static final int ATAQUE = 5;
	private static final int DEFENSA = 0;
	
	
	/**
	 * Crea un arquero con sus atributos correspondientes
	 * */
	public Arquero(int posicion) {
		super(SALUD, posicion,ENERGIA);
	}

	/**
	 * Ataque del arquero
	 * */
	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	
	/**
	 * Defensa del arquero
	 * */
	@Override
	public double getDefensa(double valor) {
		return DEFENSA;
	}
	
	
	/**
	 * Indica si el arquero puedo atacar desde su posición respecto a la del enemigo
	 * */
	@Override
	public boolean puedoAtacar(Unidad u) {
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 2 && distancia <= 5 ;
	}

	
	/**
	 * Devuelve si el arquero puede restaurar la energia
	 * */
	@Override
	public boolean puedeRestauraEnergia() {
		return super.puedeRestauraEnergia();
	}

	@Override
	public void restaurarEnergia() {
		if(!puedeRestauraEnergia())
			return;
		
		double e = super.getEnergia() + 6;
		if(e > ENERGIA)
			e = ENERGIA;
		super.setEnergia(e);
		
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
	 * Gasto energético causado por el ataque
	 * */
	@Override
	public double getGastoEnergetico() {
		return 1;
	}
	
	/**
	 * El arquero recupera toda su energia
	 * */
	@Override
	public int getEnergiaMaxima() {
		// TODO Auto-generated method stub
		return ENERGIA;
	}
	
}
