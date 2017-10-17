package imagenesEspaciales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solve extends EjercicioOIA {
	
	private String imagenComprimida;
	private String imagenDescomprimida;
	
	public Solve(File entrada, File salida) {
		super(entrada, salida);
		Scanner sc;
		try {
			sc = new Scanner(entrada);
			imagenDescomprimida = sc.nextLine();
			imagenComprimida = sc.nextLine();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void procesarImagenes() {
		String resultadoProceso = comprimirImagen();
		imagenDescomprimida = imagenComprimida;
		imagenComprimida = resultadoProceso.toString();
		imagenDescomprimida = descomprimirImagen();
		
	}

	private String comprimirImagen() {
		int i;
		int cont=1;
		StringBuilder resultadoProceso = new StringBuilder();
		char ltr[] = imagenDescomprimida.toCharArray();
		for(i = 0; i< imagenDescomprimida.length()-1; i++)
		{
			if(ltr[i]==ltr[i+1])
				cont++;
			else{
				reducirSerie( cont,ltr[i], resultadoProceso);
				cont=1;
			}
		}
		reducirSerie( cont,ltr[i], resultadoProceso);
		return resultadoProceso.toString();
	}


	private String descomprimirImagen() {
		int i;
		StringBuilder resultadoProceso = new StringBuilder();
		char ltr[] = imagenDescomprimida.toCharArray();
		for(i = 0; i< imagenDescomprimida.length(); i++)
		{
			if(ltr[i]=='('){
				ampliarSerie(ltr[++i],ltr[++i]-'0',resultadoProceso);
				i++;
			}
			else{
				resultadoProceso.append(ltr[i]);
			}
			
		}
		return resultadoProceso.toString();
	}
	
	private void reducirSerie(int cont,char ltr, StringBuilder cadenaComprimida) {
		if(cont >4)
			cadenaComprimida.append('(').append(ltr).append(cont).append(')');
		else if(cont < 4)
			while( cont > 0 )
			{
				cadenaComprimida.append(ltr);
				cont--;
			}
	}

	private void ampliarSerie(char ltr, int cont,StringBuilder r) {
		while( cont > 0 )
		{
				r.append(ltr);
				cont--;
		}
	}
	

	@Override
	public void resolve() {
		procesarImagenes();
		PrintWriter pw;
		try {
			pw = new PrintWriter(salida);
			pw.println(imagenComprimida);
			pw.println(imagenDescomprimida);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public static void main(String args[]){
		new Solve(new File("entrada.in"),new File("salida.out")).resolve();
	}
}
