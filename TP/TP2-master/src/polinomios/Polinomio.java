package polinomios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polinomio {

	private int grado;
	private double[] coeficientes;
	
	public Polinomio( double[] coeficientes){
		this.grado = coeficientes.length -1 ;
		this.coeficientes = coeficientes;
	}
	
	public Polinomio(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		
		grado = sc.nextInt();
		coeficientes = new double[grado+1];
		for(int i=0; i<=grado; i++)
			coeficientes[i] = sc.nextDouble();
	}
	//MSucesivas-> O(n^2) si implemento mi metodo pow //ESTO ES SI USO MATH POW -> n*log (n) segun adri si uso pow de java
	
	public double evaluarMSucesivas (double x){ 
		double result=0;// this.coeficientes[grado],mult=1;
		for (int i=0;i<=this.grado;i++){
			//result+=(Math.pow(x, i)*this.coeficientes[this.grado-i]);
			result+=(miPotencia(x, i)*this.coeficientes[this.grado-i]);
		}
		return result;
	}
	//miPotencia-> O(n)
	public static double miPotencia(double x,double n){
		double aux=0;
		for(int i=0; i<n; i++)
			aux*=x;
		return aux;
	}
	
	//evaluarPow -> O(n^2)
	public double evaluarPow (double x){
		double result=0;// this.coeficientes[grado],mult=1;
		for (int i=0;i<=this.grado;i++){
			result+=(Math.pow(x, i)*this.coeficientes[this.grado-i]);
		}
		return result;
	}
	
	public double evaluarRecursiva (double x){ return 0; }
	public double evaluarRecursivaPar (double x) { return 0; }
	
	/**
	 * Dinamica=> O(n)
	 */
	public double evaluarProgDinamica (double x) { 
		double resultado = coeficientes[grado], potencia=1;
		for(int i=grado-1; i>=0; i--){
			potencia*=x;
			resultado += potencia * coeficientes[i];
		}
		return resultado;
	
	}
	
	/**
	 * Mejorada=> O(n)
	 */
	public double evaluarMejorada (double x){
		double res = coeficientes[grado], potencia=1;
		for(int i=grado-1; i>=0; i--)
		{
			potencia*=x;
			if(coeficientes[i] != 0)
				res += potencia * coeficientes[i];
		}
		return res;	
	}
	
	/**
	 * HORNER=> O(n)
	 */
	public double evaluarHorner ( double x ) { 
		double res = 0;
		for (int i=0; i <= grado; res = res*x + coeficientes [i], i++ );
		return res;	
	}
	
}
