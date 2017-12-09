package grafo.generadores;

import grafo.Grafo;

public class GeneradorRegularConGrado {

	public static Grafo generar(int cantidadDeNodos, int grado) {

		if((cantidadDeNodos%2== 1 && grado%2 == 1) || grado >=cantidadDeNodos || cantidadDeNodos == 1 || grado <=0){
			System.out.println("ERROR: No se puede generar un grafo de " + cantidadDeNodos + " nodos y grado " + grado + ".");
			return null;
		} 
		Grafo g = new Grafo(cantidadDeNodos);
		
		for (int i = 0; i < cantidadDeNodos; i++) {
			for(int j = 1; j <= grado/2; j++){
				g.addArista(i, (i+j)%cantidadDeNodos, true);
				}
			if(i < (cantidadDeNodos/2) && grado%2==1){
				g.addArista(i, i+(cantidadDeNodos/2), true);
				}
			}

		return g;
	}

}
