package grafo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class GrafoNDNP {

	MatrizSimetrica matriz;
	private double porcentajeDeAdyacenciaEntrada;
	private int gradoMaximoEntrada;
	private int gradoMinimoEntrada;
	private int cantidadDeAristasEntrada;
	private int cantidadDeNodosEntrada;
	private ArrayList<Nodo> nodos;
	private int cantidadDeColores;
	
	public GrafoNDNP(String pathIn) throws IOException {
		Scanner scanner = new Scanner(new File(pathIn)).useLocale(Locale.US);
		cantidadDeNodosEntrada = scanner.nextInt();
		matriz = new MatrizSimetrica(cantidadDeNodosEntrada);
		cantidadDeAristasEntrada = scanner.nextInt();
		porcentajeDeAdyacenciaEntrada = scanner.nextDouble();
		gradoMaximoEntrada = scanner.nextInt();
		gradoMinimoEntrada = scanner.nextInt();
		int n1,n2;
		nodos = new ArrayList<Nodo>();
		for(int i=0;i<cantidadDeNodosEntrada;i++)
			nodos.add(new Nodo(i,-1));
		
		for(int i=0; i<cantidadDeAristasEntrada; i++){
			n1=scanner.nextInt();
			n2=scanner.nextInt();
			nodos.get(n1).aumentarGrado();
			nodos.get(n2).aumentarGrado();
			matriz.setValor(n1, n2,true);
		}
		
	
		cantidadDeColores = cantidadDeNodosEntrada > 0 ? 1 : 0;
				
		scanner.close();
	}

	public GrafoNDNP(int cantidadDeNodosEntrada2) {
		// TODO Auto-generated constructor stub
	}

	public void setValor(int nextInt, int nextInt2, boolean b) {
		// TODO Auto-generated method stub
		
	}

	public boolean containsKey(Integer clave) {
		// TODO Auto-generated method stub
		return false;
	}

	public void add(Integer clave, Integer color) {
		// TODO Auto-generated method stub
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean getValor(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void reordenarNodos()
	{
		Collections.shuffle(nodos);
	}
	public void reiniciarColoreo(){
		cantidadDeColores = 1;
		for(Nodo n : nodos){
			n.setColor(-1);
		}
	}
	
	private int colorear() {
		// TODO Auto-generated method stub
		
		//nota: nodosColoreados es un vector paralelo a la matriz de adyacencia.
		
		
		/*
		 * EJEMPLO
		 * 	 A B C D E
		 * A 0 1 1 0 0
		 * B 1 0 0 1 0
		 * C 1 0 0 1 0
		 * D 0 1 1 0 1
		 * E 0 0 0 1 0
		 * 
		 * PARALELIZO EL VECTOR DE COLORES
		 *  -1-1-1-1-1
		 * PINTO ALGUNO DE UN COLOR ALGUNO PORQUE ESTA DESORDENADO PERO SUPONGAMOS PARA EL EJEMPLO EL ORDEN DE LA MATRIZ
		 *   1-1-1-1-1
		 * ME fIJO LOS ADYACENTES OSEA ME PARO EN LA FILA A Y BUSCO EN LA COLUMNAS LOS 1 B Y C
		 * ME POSICIONO EN EL VECTOR DE COLORES EN LA POS B SI EL COLOR DE B Y DE A ES EL MISMO AUMENTO EN UNO EL COLOR DE A 
		 * SI EL COLOR ES NUEVO SIGO ANALIZANDO CON C PERO SI NO ES NUEVO TENGO QUE ANALIZAR LOS ADYACENTES QUE YA ANALICE
		 * 
		 * EN ESTA PASADA A QUEDARA UNICAMENTE PINTADO CON 1
		 * AHORA SIGO CON B Y LO PINTO DE UNO BUSCO LOS ADY A Y D
		 * COMO A Y B VALEN 1 AUMENTO en uno el color de b y al ser un nuevo color continuo con d 
		 * y asi sucesivamente
		 *
		 * 
		 */
		

		int color=1; //paleta de colores.  
		int columna;
		
		nodos.get(0).setColor(color);
		for (int nodoAcolorear = 1; nodoAcolorear < cantidadDeNodosEntrada; nodoAcolorear++)
		{
			//coloreo el nodo que tomo  
			nodos.get(nodoAcolorear).setColor(color);

			columna = 0;
			while ( columna < cantidadDeNodosEntrada){
				//VERIFICO SI ES ADYACENTE Y SI EL COLOR EN EL QUE ESTOY ACTUALMENTE PARADO ES EL MISMO DE SER ASI DEBERIA CAMBIARLO
				if(	nodos.get(nodoAcolorear).getNumero() != nodos.get(columna).getNumero() && //NO ES EL NODO PIVOT
					matriz.getValor(nodos.get(nodoAcolorear).getNumero(), nodos.get(columna).getNumero())  && //ES ADYACENTE AL PIVOT
					nodos.get(nodoAcolorear).getColor() == nodos.get(columna).getColor()//EL ADYACENTE ES DEL MISMO COLOR
				){
					color++;
					if(color > cantidadDeColores) //CREE UN NUEVO COLOR
						cantidadDeColores = color; 
					else
						columna= -1;
					nodos.get(nodoAcolorear).setColor(color);
				}
				columna++;
			}
			color = 1;
		}
		return cantidadDeColores;
	}
	
	private void ordenarPorGradoASC() {
			Collections.sort(nodos, new Comparator<Nodo>(){
				@Override
				public int compare(Nodo n1, Nodo n2) {
					return n1.getGrado() - n2.getGrado();
				}
			});	
	}
	
	private void ordenarPorGradoADESC() {
			Collections.sort(nodos, new Comparator<Nodo>(){
				@Override
				public int compare(Nodo n1, Nodo n2) {
					return n2.getGrado() - n1.getGrado();
				}
			});
	}	

	
	public int colorearSecuencialmente(){
		return colorear();
	}


	public int matula(){
		this.ordenarPorGradoASC();
		return colorear();
	}
	
	public int WelshPowell(){
		this.ordenarPorGradoADESC();
		return colorear();
	}
	
	
	public void grabarArchivoSalida(String archivoSalida, int cantColores) throws FileNotFoundException{
		
		PrintWriter salida = new PrintWriter(new File(archivoSalida));
		String ady = String.valueOf(porcentajeDeAdyacenciaEntrada);
		
		salida.println(cantidadDeNodosEntrada + " " + cantColores + " " + cantidadDeAristasEntrada + " " + ady.replace('.', ',') + " " + gradoMaximoEntrada + " " + gradoMinimoEntrada);
		
		for(int i=0; i<cantidadDeNodosEntrada; i++)
			salida.println(nodos.get(i).getNumero() + " "+ nodos.get(i).getGrado()+ " "+ nodos.get(i).getColor());
		
		salida.close();
	}
}
