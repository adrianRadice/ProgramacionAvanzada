package polinomios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinomioDeNewton {
	
	double a;
	double b;
	int n;
	

	double [][] triangulo;
	
	public BinomioDeNewton(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		n = sc.nextInt();
		
		sc.close();
	}
	
	public void generarTrianguloPascal(){

		triangulo = new double[n+1][n+1];
		
		int finFila = 1;
		for (int i = 0; i < n+1; i++) {
			for (int j = 0; j < finFila; j++) {
				if(j==0 || j==finFila-1)
					triangulo[i][j]=1;
				else
					triangulo[i][j]=triangulo[i-1][j]+triangulo[i-1][j-1];
				
			}

			
			finFila++;
		}
	}
	public double obtenerCoeficienteTerminoKConPascal(double k){
		if(k<=n)
			return triangulo[n][(int) (k)] * Math.pow(a, n-k) * Math.pow(b, k);
		else
			return 0;
	}
	
	
	public Polinomio newtonFormaPolinomicaConPascal() {
		double [] coeficientes = new double[n + 1];
		for(int i = 0; i < coeficientes.length; i++ )
			coeficientes[i] = obtenerCoeficienteTerminoKConPascal(i);
		return new Polinomio(coeficientes);
	}
	
	public double factorialRecursivo(double num){
		if(num==1)
			return 1;
		return factorialRecursivo(num-1);
	}
	
	
	public double combinatoriaFactorialRecursivo(double m, double n) {
		double combinatoria;
		combinatoria = factorialRecursivo(m) / (factorialRecursivo(n) * factorialRecursivo(m-n));
		return combinatoria;
	}
	
	public double obtenerCoeficienteTerminoKConFactorialRecu(int k) {
		return (int) (combinatoriaRecursiva(n, k) * Math.pow(a, k) * Math.pow(b, n - k) );
	}
	
	
	public Polinomio newtonFormaPolinomicaConFactorialRecu() {
		double [] coeficientes = new double[n + 1];
		for(int i = 0; i < coeficientes.length; i++ )
			coeficientes[i] = obtenerCoeficienteTerminoKConFactorialRecu(i);
		return new Polinomio(coeficientes);
	}
	
	public double factorialNoRecursivo(double num){
		double fac=1;
		for (int i = 2; i <= num; i++) {
			fac*=i;
		}
		
		return fac;
	}
	
	public double combinatoriaFactorialNoRecursivo(double m, double n) {
		double combinatoria;
		combinatoria = factorialNoRecursivo(m) / (factorialNoRecursivo(n) * factorialNoRecursivo(m-n));
		return combinatoria;
	}
	
	
	public double obtenerCoeficienteTerminoKFactorialSinRecu(int k) {
		return (int) (combinatoriaFactorialNoRecursivo(n, k) * Math.pow(a, k) * Math.pow(b, n - k) );
	}
	
	public Polinomio newtonFormaPolinomicaConFactorialSinRecu() {
		double [] coeficientes = new double[n + 1];
		for(int i = 0; i < coeficientes.length; i++ )
			coeficientes[i] = obtenerCoeficienteTerminoKFactorialSinRecu(i);
		return new Polinomio(coeficientes);
	}
	public double combinatoriaRecursiva( double n , double r )
	{
	       if( r == 0 || r == n)
	            return 1;
	       if( r > n)
	            return 0;
	       return combinatoriaRecursiva ( n - 1 , r -1 ) + combinatoriaRecursiva ( n - 1 , r );
	}
	
	public double obtenerCoeficienteTerminoKCombinatoriaRecu(int k) {
		return (int) (combinatoriaFactorialNoRecursivo(n, k) * Math.pow(a, k) * Math.pow(b, n - k) );
	}
	
	public Polinomio newtonFormaPolinomicaCombinatoriaRecu() {
		double [] coeficientes = new double[n + 1];
		for(int i = 0; i < coeficientes.length; i++ )
			coeficientes[i] = obtenerCoeficienteTerminoKCombinatoriaRecu(i);
		return new Polinomio(coeficientes);
	}
}
