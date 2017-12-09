package test;

import grafo.GrafoNDNP;

public class DatosObtenidos {

	private final static int CANTIDAD_REPES=10000;
	
	public static Datos secuencialAleatorio(GrafoNDNP grafo) {

		int cantColoresMin;
		int cantColores;
		int rep=0;

		grafo.reordenarNodos();
		cantColoresMin = grafo.colorearSecuencialmente();

		for (int i = 0; i < CANTIDAD_REPES; i++) {

			grafo.reordenarNodos();
			grafo.reiniciarColoreo();

			cantColores=grafo.colorearSecuencialmente();
			//System.out.println("Entro: r="+i+" colores="+cantColores);
			
			if (cantColores< cantColoresMin) {
				cantColoresMin = cantColores;
				rep = i;
			}
		}
		Datos dat = new Datos(cantColoresMin, rep);

		return dat;
	}

	public static Datos welshPowell(GrafoNDNP grafo) {

		int cantColoresMin;
		int cantColores;
		int rep=0;

		grafo.reordenarNodos();
		cantColoresMin = grafo.WelshPowell();

		for (int i = 0; i < CANTIDAD_REPES; i++) {

			grafo.reordenarNodos();
			grafo.reiniciarColoreo();

			if ((cantColores=grafo.WelshPowell())< cantColoresMin) {
				cantColoresMin = cantColores;
				rep = i;
			}
		}
		Datos dat = new Datos(cantColoresMin, rep);

		return dat;
	}

	public static Datos matula(GrafoNDNP grafo) {

		int cantColoresMin;
		int cantColores;
		int rep=0;

		grafo.reordenarNodos();
		cantColoresMin = grafo.matula();

		for (int i = 0; i < CANTIDAD_REPES; i++) {

			grafo.reordenarNodos();
			grafo.reiniciarColoreo();

			if ((cantColores=grafo.matula())< cantColoresMin) {
				cantColoresMin = cantColores;
				rep = i;
			}
		}
		Datos dat = new Datos(cantColoresMin, rep);

		return dat;
	}
}
