package Algoritmo;

import java.util.Arrays;
import java.util.Comparator;

import grafo.Grafo;
import grafo.Nodo;

public class Coloreo {
	/**
	 * ESTE METODO VA EN CLASE GRAFO Y  NO COMO ESTATICO Y SIN EL PARAMETRO GRAFO
	 * @param g
	 */
	private static void colorear(Grafo g){
		int cantColores = 1;
		int color = 1;
		int nodo;
		
		Nodo[] nodos = g.getNodos();
		for(Nodo n : nodos){
			n.setColor(-1);
		}
		
		nodos[0].setColor(color);
		
		for( int indexNodoAcolorear = 1 ; indexNodoAcolorear < g.getCantidadDeNodos() ; indexNodoAcolorear++ ){
			nodos[indexNodoAcolorear].setColor(color);
			nodo = 0;
			while( nodo < g.getCantidadDeNodos() ){
				if( g.getArista(nodos[nodo], nodos[indexNodoAcolorear]).getCosto() != g.getRepresentacionInfinito() &&
						nodos[nodo].getColor() == nodos[indexNodoAcolorear].getColor() )
				{
					color++;
					if(color > cantColores)
						cantColores = color;
					else
						nodo = -1;
					nodos[indexNodoAcolorear].setColor(color);
				}
				nodo++;
			}
			color = 1;
		}
	}
	
	public static void coloreoSecuencial(Grafo g){
		colorear(g);
	}
	
	public static void coloreoMatula(Grafo g){
		ordenarGradoASC(g);
		colorear(g);
	}
	
	public static void coloreoWell(Grafo g){
		ordenarGradoDESC(g);
		colorear(g);
	}

	private static void ordenarGradoASC(Grafo g) {
		Arrays.sort(g.getNodos(),new Comparator<Nodo>() {
			@Override
			public int compare(Nodo n, Nodo o){
				return n.getGrado() - o.getGrado();
			}
		});
	}
	private static void ordenarGradoDESC(Grafo g) {	
		Arrays.sort(g.getNodos(),new Comparator<Nodo>() {
			@Override
			public int compare(Nodo n, Nodo o){
				return o.getGrado() - n.getGrado();
			}
		});
	}

}
