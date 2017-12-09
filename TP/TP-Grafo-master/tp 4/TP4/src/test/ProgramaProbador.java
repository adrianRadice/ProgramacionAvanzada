package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


import grafo.GrafoNDNP;

public class ProgramaProbador {

	private GrafoNDNP grafo;
	private int cantidadDeColores;
	private int cantidadDeNodosEntrada;
	private int cantidadDeNodosSalida;
	private int cantidadDeAristasEntrada;
	private int cantidadDeAristasSalida;
	private int gradoMaximoEntrada;
	private int gradoMaximoSalida;
	private int gradoMinimoEntrada;
	private int gradoMinimoSalida;
	private double porcentajeDeAdyacenciaEntrada;
	private double porcentajeDeAdyacenciaSalida;
	private boolean nodosRepetidos;
	
	public ProgramaProbador(String pathIn, String pathOut) throws IOException{
		leerArchivoEntrada(pathIn);
		leerArchivoSalida(pathOut);
	}

	private void leerArchivoEntrada(String pathIn) throws IOException {
		Scanner scanner = new Scanner(new File(pathIn)).useLocale(Locale.US);
		cantidadDeNodosEntrada = scanner.nextInt();
		grafo = new GrafoNDNP(cantidadDeNodosEntrada);
		cantidadDeAristasEntrada = scanner.nextInt();
		porcentajeDeAdyacenciaEntrada = scanner.nextDouble();
		gradoMaximoEntrada = scanner.nextInt();
		gradoMinimoEntrada = scanner.nextInt();
		for(int i=0; i<cantidadDeAristasEntrada; i++){
			grafo.setValor(scanner.nextInt(), scanner.nextInt(),true);
		}
		scanner.close();
	}

	private void leerArchivoSalida(String pathOut) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(pathOut)).useLocale(Locale.US);
		cantidadDeNodosSalida = scanner.nextInt();
		cantidadDeColores = scanner.nextInt();
		cantidadDeAristasSalida = scanner.nextInt();
		porcentajeDeAdyacenciaSalida = scanner.nextDouble();
		gradoMaximoSalida = scanner.nextInt();
		gradoMinimoSalida = scanner.nextInt();
		for(int i=0; i<cantidadDeNodosSalida; i++){
			Integer clave = scanner.nextInt();
			Integer color = scanner.nextInt();
			if (grafo.containsKey(clave)) {
				nodosRepetidos = true;
				scanner.close();
				return;
			} 
			else {
				grafo.add(clave, color);
			}
		}
		scanner.close();
	}
	
	public boolean siLosDatosDeEntradaCoincidenConLosDeSalida(){
		return cantidadDeNodosEntrada==cantidadDeNodosSalida && cantidadDeAristasEntrada==cantidadDeAristasSalida && porcentajeDeAdyacenciaEntrada==porcentajeDeAdyacenciaSalida && gradoMaximoEntrada==gradoMaximoSalida && gradoMinimoEntrada==gradoMinimoSalida;
	}
	
	public boolean probarSiLaSalidaEsCorrecta(){
		return siLosDatosDeEntradaCoincidenConLosDeSalida() && !nodosRepetidos && siNoHayNodosAdyacentesDelMismoColor();
	}
	
	public boolean siNoHayNodosAdyacentesDelMismoColor(){
		for(int i=0; i<grafo.size()-1; i++){
			for(int j=i+1; j<grafo.size(); j++){
				if(grafo.getValor(i, j) && grafo.get(i)==grafo.get(j)){
					return false;
				}
			}
		}
		return true;
	}
}