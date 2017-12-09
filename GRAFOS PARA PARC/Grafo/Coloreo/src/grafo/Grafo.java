package grafo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Grafo{

	private MatrizSimetrica aristas;
	private Nodo[] nodos;
	private int cantColores;
	
	public Grafo(int cantidadDeNodos){
		aristas= new MatrizSimetrica(cantidadDeNodos);
		nodos = new Nodo[cantidadDeNodos];
	}

	public int getCantidadDeNodos() {
		// TODO Auto-generated method stub
		return aristas.getOrdenMatriz();
	}

	public Nodo[] getNodos() {
		// TODO Auto-generated method stub
		return nodos;
	}

	public void addNodo(Nodo n){
		nodos[n.getIndex()] = n;
	}
	
	public void addArista(Arista a){
		aristas.setValue(a.getNodoIzq().getIndex(), a.getNodoDer().getIndex(), a.getCosto());
		a.getNodoDer().aumentarGrado();
		a.getNodoIzq().aumentarGrado();
	}

	private int colorear() {
		int color=1;   
		int columna;
		int cantidadDeNodosEntrada =nodos.length;
		nodos[0].setColor(color);
		for (int nodoAcolorear = 1; nodoAcolorear < cantidadDeNodosEntrada; nodoAcolorear++)
		{
			nodos[nodoAcolorear].setColor(color);
			columna = 0;
			while ( columna < cantidadDeNodosEntrada){
				//VERIFICO SI ES ADYACENTE Y SI EL COLOR EN EL QUE ESTOY ACTUALMENTE PARADO ES EL MISMO DE SER ASI DEBERIA CAMBIARLO
				if(	aristas.getValue(nodos[nodoAcolorear].getIndex(), nodos[columna].getIndex())  && //ES ADYACENTE AL PIVOT
					nodos[nodoAcolorear].getColor() == nodos[columna].getColor()//EL ADYACENTE ES DEL MISMO COLOR
				){
					color++;
					if(color > cantColores) //CREE UN NUEVO COLOR
						cantColores = color; 
					else
						columna= -1;
					nodos[nodoAcolorear].setColor(color);
				}
				columna++;
			}
			color = 1;
		}
		return cantColores;
	}
	private void ordenarPorGradoASC() {
		Arrays.sort(nodos, new Comparator<Nodo>(){
			@Override
			public int compare(Nodo n1, Nodo n2) {
				return n1.getGrado() - n2.getGrado();
			}
		});	
}

	private void ordenarPorGradoADESC() {
		Arrays.sort(nodos, new Comparator<Nodo>(){
				@Override
				public int compare(Nodo n1, Nodo n2) {
					return n2.getGrado() - n1.getGrado();
				}
			});
	}	
	
	public int matula(){
		this.ordenarPorGradoASC();
		return colorear();
	}
	
	public int WelshPowell(){
		this.ordenarPorGradoADESC();
		return colorear();
	}

	public int colorearSecuencialmente(){
		return colorear();
	}

	public void reiniciarColores() {
		for (int i = 0; i < nodos.length; i++) {
			nodos[i].setColor(-1);
		}
	}
	
}