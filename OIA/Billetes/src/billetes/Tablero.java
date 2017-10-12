package billetes;

public class Tablero {
	
	public final static int ALTURA_MAX = 200;
	public final static int ANCHO_MAX = 200;
	public final static int ALTURA_MIN = 1;
	public final static int ANCHO_MIN = 1;
	
	public final int ancho;
	public final int alto;
	
	public Robot robot;
	
	public Tablero(int ancho, int alto) throws Exception {
		if( ancho > ANCHO_MAX || ancho < ANCHO_MIN || alto > ALTURA_MAX || alto < ALTURA_MIN)
			throw new Exception("ERROR DIMENSION TABLERO");
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public void agregarRobot(int posX, int posY){
		robot = new Robot(posX, posY);
	}

	public final void moverRobot(final char c){		
		if ( c == 'N'  && robot.getPosY() < alto )
			robot.subir();
		else if ( c == 'S' && robot.getPosY() > 1 )
			robot.bajar();
		else if ( c == 'E' && robot.getPosX() < ancho )
			robot.moverDerecha();
		else if ( c == 'O' && robot.getPosX() > 1 )
			robot.moverIzquierda();
	}
	
	
	public final int getAncho() {
		return ancho;
	}

	public final int getAlto() {
		return alto;
	}

	public final Robot getRobot() {
		return robot;
	}
	
}
