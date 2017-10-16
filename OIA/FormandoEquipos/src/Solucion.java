import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Solucion extends EjercicioOIA {

	private String[] respuestasColoboradores;
	private String respuestasCoincidentes;
	private int cantColaboradoresCoincidentes;
	private int cantMaxRespuestasCoincidentes;
	
	public Solucion(File entrada, File salida) throws FileNotFoundException {
		super(entrada, salida);
		
		Scanner sc = new Scanner(entrada);
		sc.nextInt();
		int cantColaboradores = sc.nextInt();
		respuestasColoboradores = new String[cantColaboradores];
		cantMaxRespuestasCoincidentes = 0;
		sc.nextLine();
		cantColaboradoresCoincidentes = 0;
		for(int i= 0; i<cantColaboradores; i++)
			respuestasColoboradores[i] = sc.nextLine();
		sc.close();

	}

	public int contarCoincidencias(String respuestasC1, String respuestasC2){
		int respuesta=0;
		while(respuesta< respuestasC1.length()  && respuestasC1.charAt(respuesta) == respuestasC2.charAt(respuesta)) 
			respuesta++;
		return respuesta;
	}

	public int calcularAfinidad(){
		return cantColaboradoresCoincidentes * cantMaxRespuestasCoincidentes * cantMaxRespuestasCoincidentes;
	}
	
	public void resolverSinGuardar() {
		Arrays.sort(respuestasColoboradores);
		int cantColaboradores = respuestasColoboradores.length - 1;
		int cantidadDeCoincidencias;
		for(int i=0 ; i<cantColaboradores; i++){
			cantidadDeCoincidencias = contarCoincidencias(respuestasColoboradores[i], respuestasColoboradores[i+1]);
			if(cantidadDeCoincidencias != 0){
				if(cantMaxRespuestasCoincidentes < cantidadDeCoincidencias){
					cantMaxRespuestasCoincidentes = cantidadDeCoincidencias;
					respuestasCoincidentes =respuestasColoboradores[i].substring(0, cantMaxRespuestasCoincidentes);
					cantColaboradoresCoincidentes=2;
				}
				else if(cantMaxRespuestasCoincidentes == cantidadDeCoincidencias && respuestasColoboradores[i].substring(0, cantMaxRespuestasCoincidentes).equals(respuestasCoincidentes))
					cantColaboradoresCoincidentes++;
			}
		}
	}
	
	public void resolver(){
		PrintWriter pw;
		try {
			pw = new PrintWriter(salida);
			resolverSinGuardar();
			
			pw.println(calcularAfinidad());
			pw.println(respuestasCoincidentes);
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[]args) throws FileNotFoundException{
		new Solucion(new File("entrada.in"), new File("salida.out")).resolver();
	}
}
