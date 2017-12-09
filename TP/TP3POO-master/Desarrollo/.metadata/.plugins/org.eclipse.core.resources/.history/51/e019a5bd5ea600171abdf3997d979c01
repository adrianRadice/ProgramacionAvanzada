package item;

import personaje.Unidad;

/**
 * @author adrian
 * <h1>Clse Escudo</h1>
 * <h4>Clase que permite agregar las funcionalidades que implica el poseer una escudo</h4>
 * <h5>DEFENSA: 40% mas </h5>
 * <h6>Metodos:</h6>
 *<ul>
 *		<li>getAtaque()</li>
 *		<li>getEnergia()</li>
 *		<li>getDefensa()</li>
 *		<li>puedeRestauraEnergia()</li>
 *		<li>getAtaqueBase()</li>
 *		<li>getDefensaBase()</li>
 *		<li>getGastoEnergetico()</li>
 *		<li>getEnergiaMaxima()</li>
 *</ul>
 *@see item.ItemDecorator
 *@see personaje.Unidad
 */
public class Escudo extends ItemDecorator {

	/**
	 * CONSTRUCTOR REQUERIDO POR EL PATRON
	 */
	public Escudo(Unidad peleable){
		super(peleable);
	}
	/**
	 * Devuelve la nueva defensa que se adquiere por portar un escudo
	 * */
	public double getDefensa(){
		return getUnidad().getDefensa() +  getUnidad().getDefensaBase()*0.4;
	}

}
