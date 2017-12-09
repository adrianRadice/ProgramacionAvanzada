package juegoConLetras;

public class Palabra {
	private char[] palabra;
	
	private static int SALTO;
	
	
	public static void setSalto(int value) {
		SALTO = value;
	}

	public Palabra(String palabra){
		this.palabra = palabra.toCharArray();
		indexLR = 0;
		indexRL = this.palabra.length-1;
		 
	}

	public char[] getLetras() {
		return palabra;
	}
	
	public int Tamanio(){
		return palabra.length-1;
	}
	
	private int indexLR ;
	private int indexRL ;
	
	public boolean evaluarCaracter(char c){
		
		if(palabra[indexLR]==c){
			indexLR++;
			if(indexLR == palabra.length){
				indexLR = 0;
				return true;
			}
		}
		else 
			indexLR = 0;
		
		if(palabra[indexRL]==c){
			indexRL--;
			if(indexRL == 0){
				indexRL =palabra.length-1;
				return true;
			}
		}
		else 
			indexRL = palabra.length-1;
		
		
		
		return false;
	}
	
	public void reiniciarLrRl(){
		indexLR = 0;
		indexRL = palabra.length - 1;
	}
	
	

}