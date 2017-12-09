package personaje;
/**
 * @author adrian
 *
 */
public class Caballero  extends Unidad{
	private static final int SALUD = 200;
	private static final int ENERGIA = 3;
	private static final int ATAQUE = 50;
	private static final int DEFENSA = 0;
	
	
	/**
	 * Se crear un caballero con sus atributos correspondientes
	 * */
	public Caballero(int posicion){
		super(SALUD, posicion,ENERGIA);
	}
	
	/**
	 * Ataque del caballero
	 * */
	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	/**
	 * Defensa del caballero
	 * */
	@Override
	public double getDefensa(double valor) {
		return DEFENSA;
	}

	/**
	 * Indica si el caballero puede atacar respecto a la posición de su enemigo
	 * */
	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 1 && distancia <= 2 ;
	}

	
	/**
	 * Devuelve si el arquero puede restaurar su energía
	 * */
	@Override
	public boolean puedeRestauraEnergia() {
		return super.puedeRestauraEnergia();
	}

	@Override
	public void restaurarEnergia() {
		if(!puedeRestauraEnergia())
			return;
		
		double e = super.getEnergia()+3;
		if(e>ENERGIA)
			e= ENERGIA;
		super.setEnergia(e);
		
	}
	
	
	/**
	 * Ataque base del caballero
	 * */
	@Override
	public double getAtaqueBase() {
		return ATAQUE;
	}

	/**
	 * Defensa base del caballero
	 * */
	@Override
	public double getDefensaBase() {
		return DEFENSA;
	}

	/**
	 * Gasto energético producido por el caballero en el ataque
	 * */
	@Override
	public double getGastoEnergetico() {
		return 1;
	}

	
	/**
	 * Restaura la energía del caballero al máximo
	 * */
	@Override
	public int getEnergiaMaxima() {
		return ENERGIA;
	}

}
