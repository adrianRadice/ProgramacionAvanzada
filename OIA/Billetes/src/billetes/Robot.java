package billetes;

public class Robot {
	
	private int posX;
	private int posY;
	
	private Tablero tablero;
	
	public Robot(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}


	private final void subir(){ 
		posY++; 
	}
	private final void bajar(){ 
		posY--;
	}
	private final void moverIzquierda(){ 
		posX--;
	}
	private final void moverDerecha(){ 
		posX++;
	}

	public final void mover(final char c){		
		if ( c == 'N' && tablero.posicionValidaParaMoverse(posX, posY+1) )
			this.subir();
		else if ( c == 'S'&& tablero.posicionValidaParaMoverse(posX, posY-1) )
			this.bajar();
		else if ( c == 'E'&& tablero.posicionValidaParaMoverse(posX+1, posY) )
			this.moverDerecha();
		else if ( c == 'O' && tablero.posicionValidaParaMoverse(posX-1, posY))
			this.moverIzquierda();
	}

	@Override
	public String toString() {
		return posX + " " + posY;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;		
	}


	public int getPosX() {
		return posX;
	}


	public int getPosY() {
		return posY;
	}
	
		
}
