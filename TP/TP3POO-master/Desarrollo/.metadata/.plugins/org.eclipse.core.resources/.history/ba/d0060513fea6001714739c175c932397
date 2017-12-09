package item;

import personaje.Unidad;

/**
 * @author adrian
 * <h1>Clase Capa</h1>
 * <h4>Clase que permite agregar las funcionalidades que implica el poseer una capa</h4>
 * <h5>ENERGIA: x2</h5>
 * <h5>ATAQUE: -40% </h5>
 * <h6>Metodos:</h6>
 *<ul>
 *		<li>getAtaque()</li>
 *		<li>getEnergia()</li>
 *		<li>getGastoEnergetico()</li>
 *		<li>getEnergiaMaxima()</li>
 *		<li>consumirEnergia()</li>
 *		<li>toString()</li>
 *</ul>
 *@see item.ItemDecorator
 *@see personaje.Unidad
 */
public class Capa extends ItemDecorator {

	private static final int MULTIPLICADOR_ENERGIA = 2;
	
	/**
	 * CONSTRUCTOR REQUERIDO POR EL PATRON DECORATOR
	 */
	public Capa(Unidad unidad){
		super(unidad);
	}
	
	/**
	 * Devuelve el danio producido por el ataque portando una capa
	 * */
	public double getAtaque(){
		return getUnidad().getAtaque() - getUnidad().getAtaqueBase() * 0.1  ;
	}
	/**
	 * Devuelve la energia que se tiene portando una capa
	 * */
	public double getEnergia(){
		return getUnidad().getEnergia() * MULTIPLICADOR_ENERGIA;
	}
	
	/**
	 * Devuelve el gasto que implica  atacar 
	 * */
	@Override
	public double getGastoEnergetico() {
		return getUnidad().getGastoEnergetico() / MULTIPLICADOR_ENERGIA ;
	}

	/**
	 * Devuelve la energia maxima que se puede adquirir
	 * */
	public int getEnergiaMaxima() {
		return getUnidad().getEnergiaMaxima() * MULTIPLICADOR_ENERGIA;
	}
	

	/**
	 * Modifica la enegia de la unidad tras realizar una accion que le consume energia
	 * */
	public void consumirEnergia(){
		this.setEnergia(getUnidad().getEnergia() - (double)getGastoEnergetico()) ;
	}
	

	/**
	 * Imprime el estado del personaje con sus item
	 * */
	@Override
	public String toString() {
		return getUnidad() + ", Capa";
	}
	
}
