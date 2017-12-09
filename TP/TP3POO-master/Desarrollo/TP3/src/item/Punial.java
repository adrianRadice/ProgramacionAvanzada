package item;

import personaje.Unidad;

/**
 * @author adrian
 * <h1>Clase Punial</h1>
 * <h4>Permite agregar las funcionalidades que implica el poseer una punial</h4>
 * <h5>DEFENSA: 40% mas </h5>
 * <h6>Metodos:</h6>
 *<ul>
 *		<li>getAtaque()</li>
 *		<li>getDefensa()</li>
 *		<li>toString()</li>
 *</ul>
 *@see item.ItemDecorator
 *@see personaje.Unidad
 */
public class Punial extends ItemDecorator {

	/**
	 * CONSTRUCTOR REQUERIDO POR EL PATRON
	 * @throws Exception 
	 */
	public Punial(Unidad unidad) throws Exception{
		super(unidad);
		if(unidad.getCharItem().contains("P"))
			throw new Exception("Ya posee uno");
	}
	
	/**
	 * Devuelve el danio producido por el ataque portando una punial
	 * */
	public double getAtaque(){
		return getUnidad().getAtaque()+3;
	}
	/**
	 * Devuelve la nueva defensa que se adquiere por portar un punial
	 * */
	public double getDefensa(double valor){
		return getUnidad().getDefensa(valor)-3;
	}
	/**
	 * Imprime el estado del personaje con sus item
	 * */
	public String toString() {
		return getUnidad() + ", Punial";
	}
	
	
	public String getCharItem(){
		return  getUnidad().getCharItem() + "P";
	}
	
	
}
