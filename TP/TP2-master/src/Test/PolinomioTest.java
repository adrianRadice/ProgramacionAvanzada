package Test;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

import polinomios.BinomioDeNewton;
import polinomios.Polinomio;

public class PolinomioTest {

	public static final String PATH = "Entradas/";
	public static final double COTA = 0.10;
	public static final String PATH_G0 = PATH + "Grado 0/";
	public static final String PATH_G1 = PATH + "Grado 1/";
	public static final String PATH_G2 = PATH + "Grado 2/";
	public static final String PATH_G3 = PATH + "Grado 3 con coeficientes negativos y flotantes/";
	public static final String PATH_C0 = PATH + "Todos los terminos con coeficiente 0/";
	public static final String FILE = "entrada.in";
	
	
	@Test
	public void hornerGrado0Test() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_G0 + FILE);
		Assert.assertEquals(p.evaluarHorner(7), 2, COTA);
	}

	@Test
	public void hornerGrado1Test() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_G1 + FILE);
		Assert.assertEquals(p.evaluarHorner(7), 18, COTA);
	}

	@Test
	public void hornerGrado2Test() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_G2 + FILE);
		Assert.assertEquals(p.evaluarHorner(2),28 , COTA);
	}

	@Test
	public void hornerCoeficiente0() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_C0 + FILE);
		Assert.assertEquals(p.evaluarHorner(2), 0, COTA);
	}

	@Test
	public void DinamicaGrado0Test() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_G0 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(7), 2, COTA);
	}

	@Test
	public void DinamicaGrado1Test() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_G1 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(7), 18, COTA);
	}

	@Test
	public void DinamicaGrado2Test() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_G2 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(2), 28, COTA);
	}

	@Test
	public void DinamicaCoeficiente0() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_C0 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(2), 0, COTA);
	}

	@Test
	public void MejoradaGrado0Test() throws FileNotFoundException {
		Polinomio p = new Polinomio( PATH_G0 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(7), 2, COTA);
	}

	@Test
	public void MejoradaGrado1Test() throws FileNotFoundException {
		Polinomio p = new Polinomio( PATH_G1 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(7), 18, COTA);
	}

	@Test
	public void MejoradaGrado2Test() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_G2 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(2), 28, COTA);
	}

	@Test
	public void MejoradaCoeficiente0() throws FileNotFoundException {
		Polinomio p = new Polinomio(PATH_C0 + FILE);
		Assert.assertEquals(p.evaluarProgDinamica(2), 0, COTA);
	}



	@Test
	public void CoeficienteKPascalTest() throws FileNotFoundException{
		BinomioDeNewton b = new BinomioDeNewton(PATH + "Binomio/Binomio.in");
		b.generarTrianguloPascal();
		Assert.assertEquals(b.obtenerCoeficienteTerminoKConPascal(10),286,COTA);
		
	}
	
	@Test
	public void CoeficienteKFactorialRecu() throws FileNotFoundException{
		BinomioDeNewton b = new BinomioDeNewton(PATH + "Binomio/Binomio.in");
		Assert.assertEquals(b.obtenerCoeficienteTerminoKConFactorialRecu(10),286,COTA);
		
	}
	
	@Test
	public void CoeficienteKFactorialSinRecu() throws FileNotFoundException{
		BinomioDeNewton b = new BinomioDeNewton(PATH + "Binomio/Binomio.in");
		Assert.assertEquals(b.obtenerCoeficienteTerminoKFactorialSinRecu(10),286,COTA);
		
	}
	@Test
	public void CoeficienteKCombinatoriaRecu() throws FileNotFoundException{
		BinomioDeNewton b = new BinomioDeNewton(PATH + "Binomio/Binomio.in");
		Assert.assertEquals(b.obtenerCoeficienteTerminoKCombinatoriaRecu(10),286,COTA);
		
	}
	
	
	@Test
	public void MSucesivasGrado2Test() throws FileNotFoundException{
		Polinomio p = new Polinomio(PATH_G2 + FILE);
		Assert.assertEquals(p.evaluarMSucesivas(2),28,COTA);
	}
	

}
