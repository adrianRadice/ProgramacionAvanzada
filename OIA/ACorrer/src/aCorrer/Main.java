package aCorrer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("carrera.in"));
		
		Carrera carrera = new Carrera(sc.nextInt(),sc.nextShort(),sc.nextShort());
		int cantCorredoresQueFinalizan =sc.nextInt();
		
		for (int i=0 ; i < carrera.getCantCategoriasFem() ; i++)
			carrera.addCategoria(new Categoria(i+1,sc.nextShort(),sc.nextShort(),Sexo.F));
		for (int i=0 ; i < carrera.getCantCategoriasMas(); i++)
			carrera.addCategoria(new Categoria(i+1,sc.nextShort(),sc.nextShort(),Sexo.M));
		for(int i=0 ; i< carrera.getCantidadCorredores(); i++)
			carrera.anotarCorredor(new Corredor(i+1,sc.nextShort(),sc.next().charAt(0)));
		for(int i=0; i<cantCorredoresQueFinalizan; i++)
			carrera.buscarCorredorPorNumero(sc.nextInt()).setPosicionGeneral(i+1);
		
		sc.close();
	
		carrera.escribirSalida("carrera.out");
		
	}
}
