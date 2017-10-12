package billetes;

import java.util.ArrayList;

public class Tablero {
	
	public final static int ALTURA_MAX = 200;
	public final static int ANCHO_MAX = 200;
	public final static int ALTURA_MIN = 1;
	public final static int ANCHO_MIN = 1;
	
	public final int ancho;
	public final int alto;
	
	public ArrayList<Robot> robots;
	
	public Tablero(int ancho, int alto) throws Exception {
		if( ancho > ANCHO_MAX || ancho < ANCHO_MIN || alto > ALTURA_MAX || alto < ALTURA_MIN)
			throw new Exception("ERROR DIMENSION TABLERO");
		this.ancho = ancho;
		this.alto = alto;
		robots = new ArrayList<Robot>();
	}
	
	public void agregarRobot(Robot robot) throws Exception{
		if(!posicionValidaParaMoverse(robot.getPosX(),robot.getPosY()))
			throw new Exception("ERROR POSICION INVALIDA");
		robot.setTablero(this);
		robots.add(robot);
	}
	
	public boolean posicionValidaParaMoverse(int x, int y){
		return x<=ancho && y<=alto && x>0 && y>0;
	}
}
