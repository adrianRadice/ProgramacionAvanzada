package test;

import java.io.IOException;
import java.util.ArrayList;

import grafo.GrafoNDNP;
import grafo.generadores.GeneradorAleatorioConPorcentaje;

public class main {

	public static void main(String[] args) throws IOException {
		/*GeneradorAleatorioProbabilistico.generar(5,60).escribirComoEntrada("test1.in");
		GeneradorAleatorioConPorcentaje.generar(5,90).escribirComoEntrada("test2.in");

		GeneradorGrafoNPartitos.generar(5,2).escribirComoEntrada("test3.in");
		
		Grafo g = new Grafo(5);
		g.addArista(0, 1, true);
		g.addArista(1, 3, true);
		g.addArista(0, 2, true);
		g.addArista(2, 3, true);
		g.addArista(3, 4, true);
		g.escribirComoEntrada("test.in");
		
		System.out.println("Test generador regular con grado: ");
		GeneradorRegularConGrado.generar(5, 4).escribirComoEntrada("testRegular.in");
		
		System.out.println("Test generador regular con porcentaje: ");
		GeneradorRegularConPorcentaje.generar(5, 40).escribirComoEntrada("testRegularPorcentaje.in");
		
		GrafoNDNP ndnp = new GrafoNDNP("test.in");
		ndnp.reiniciarColoreo();
		ndnp.grabarArchivoSalida("salidaSecuencial.out", 	ndnp.colorearSecuencialmente());
		ndnp.reiniciarColoreo();
		ndnp.grabarArchivoSalida("salidaMatula.out", ndnp.matula());	
		ndnp.reiniciarColoreo();
		ndnp.grabarArchivoSalida("salidaWelsh-Powell.out", ndnp.WelshPowell());*/
		GeneradorAleatorioConPorcentaje.generar(600, 40).escribirComoEntrada("grafoc1.in");;
		GeneradorAleatorioConPorcentaje.generar(600, 60).escribirComoEntrada("grafoc2.in");;
		GeneradorAleatorioConPorcentaje.generar(600, 90).escribirComoEntrada("grafoc3.in");;
		GeneradorAleatorioConPorcentaje.generar(1000, 50).escribirComoEntrada("grafoc4.in");;
		GeneradorAleatorioConPorcentaje.generar(1000, 75).escribirComoEntrada("grafoc5.in");;

		GrafoNDNP caso_1_nodos_600_ady_40 = new GrafoNDNP("grafoc1.in");
		GrafoNDNP caso_2_nodos_600_ady_60 = new GrafoNDNP("grafoc2.in");
		GrafoNDNP caso_3_nodos_600_ady_90 = new GrafoNDNP("grafoc3.in");
		GrafoNDNP caso_4_nodos_1000_ady_50 = new GrafoNDNP("grafoc4.in");
		GrafoNDNP caso_5_nodos_1000_ady_75 = new GrafoNDNP("grafoc5.in");
		
		Datos caso1SA  = DatosObtenidos.secuencialAleatorio(caso_1_nodos_600_ady_40);
		Datos caso1WP  = DatosObtenidos.welshPowell(caso_1_nodos_600_ady_40);
		Datos caso1M  = DatosObtenidos.matula(caso_1_nodos_600_ady_40);
		
		Datos caso2SA  = DatosObtenidos.secuencialAleatorio(caso_2_nodos_600_ady_60);
		Datos caso2WP  = DatosObtenidos.welshPowell(caso_2_nodos_600_ady_60);
		Datos caso2M  = DatosObtenidos.matula(caso_2_nodos_600_ady_60);
		
		Datos caso3SA  = DatosObtenidos.secuencialAleatorio(caso_3_nodos_600_ady_90);
		Datos caso3WP  = DatosObtenidos.welshPowell(caso_3_nodos_600_ady_90);
		Datos caso3M  = DatosObtenidos.matula(caso_3_nodos_600_ady_90);
		
		Datos caso4SA  = DatosObtenidos.secuencialAleatorio(caso_4_nodos_1000_ady_50);
		Datos caso4WP  = DatosObtenidos.welshPowell(caso_4_nodos_1000_ady_50);
		Datos caso4M  = DatosObtenidos.matula(caso_4_nodos_1000_ady_50);
		
		Datos caso5SA  = DatosObtenidos.secuencialAleatorio(caso_5_nodos_1000_ady_75);
		Datos caso5WP  = DatosObtenidos.welshPowell(caso_5_nodos_1000_ady_75);
		Datos caso5M  = DatosObtenidos.matula(caso_5_nodos_1000_ady_75);

		System.out.println("Caso1SA");
		System.out.println(caso1SA.getCantColores() + " " + caso1SA.getRepeticion());
		
		System.out.println();
		System.out.println("Caso1WP");
		System.out.println(caso1WP.getCantColores() + " " + caso1WP.getRepeticion());

		
		System.out.println();
		System.out.println("Caso1M");
		System.out.println(caso1M.getCantColores() + " " + caso1M.getRepeticion());

		
		System.out.println();
		System.out.println("Caso2SA");
		System.out.println(caso2SA.getCantColores() + " " + caso2SA.getRepeticion());

		
		System.out.println();
		System.out.println("Caso2WP");
		System.out.println(caso2WP.getCantColores() + " " + caso2WP.getRepeticion());

		
		System.out.println();
		System.out.println("Caso2M");
		System.out.println(caso2M.getCantColores() + " " + caso2M.getRepeticion());

		
		System.out.println();
		System.out.println("Caso3SA");
		System.out.println(caso3SA.getCantColores() + " " + caso3SA.getRepeticion());

		
		System.out.println();
		System.out.println("Caso3WP");
		System.out.println(caso3WP.getCantColores() + " " + caso3WP.getRepeticion());

		
		System.out.println();
		System.out.println("Caso3M");
		System.out.println(caso3M.getCantColores() + " " + caso3M.getRepeticion());
;
		
		
		System.out.println();
		System.out.println("Caso4SA");
		System.out.println(caso4SA.getCantColores() + " " + caso4SA.getRepeticion());

		
		System.out.println();
		System.out.println("Caso4WP");
		System.out.println(caso4WP.getCantColores() + " " + caso4WP.getRepeticion());

		
		System.out.println();
		System.out.println("Caso4M");
		System.out.println(caso4M.getCantColores() + " " + caso4M.getRepeticion());

		
		
		System.out.println();
		System.out.println("Caso5SA");
		System.out.println(caso5SA.getCantColores() + " " + caso5SA.getRepeticion());

		
		System.out.println();
		System.out.println("Caso5WP");
		System.out.println(caso5WP.getCantColores() + " " + caso5WP.getRepeticion());

		
		System.out.println();
		System.out.println("Caso5M");
		System.out.println(caso5M.getCantColores() + " " + caso5M.getRepeticion());

	}

}
