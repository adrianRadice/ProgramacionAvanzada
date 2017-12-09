package grafo;

public class NodoGenerico {
	
	private int index;
	private int grado;
	
	public NodoGenerico(int index){
		this.index = index;
		grado = 0 ;
	}
	public void setIndex(int value){
		this.index = value;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public int getGrado(){
		return this.grado;
	}
	
	public void aumentarGrado(){
		this.grado++;
	}
	
	public void disminuirGrado(){
		this.grado--;
	}
	
	public void reinciarGrado(){
		this.grado=0;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	
}