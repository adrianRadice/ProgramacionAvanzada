package aCorrer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Carrera {

	public Carrera( int cantCorredores,int cantCatFs, int cantCatMs )
	{
		catFs = new Categoria[cantCatFs];
		catMs = new Categoria[cantCatMs];
		corredores = new Corredor[cantCorredores];
	}
	
	public int getCantidadCorredores()
	{
		return corredores.length;
	}
	
	public void anotarCorredor(Corredor corredor)
	{
		int i = 0;
		if(corredor.getSexo() == 'F')
			while (i< catFs.length && !catFs[i++].valido(corredor)); //si es valido setearse en corredor
		else if(corredor.getSexo() == 'M')
			while (i< catFs.length && !catMs[i++].valido(corredor));
		corredores[corredor.getNumero()-1] = corredor;
	}
	
	public Corredor buscarCorredorPorNumero(int numero)
	{
		return corredores[numero-1];
	}
	
	public  void escribirSalida(String path) throws IOException{
		PrintWriter salida = new PrintWriter(new FileWriter(path)); 
		Categoria[] cat;
		for(int cantCat = 0; cantCat<2; cantCat++){
			cat = ( cantCat == 0 ? catFs : catMs );
			for (int i=0 ; i < cat.length ; i++){
				int j = 3;
				salida.print(i+1);
				salida.print(" ");	
				for(Corredor premiado : cat[i].getPremiados()){
					salida.print(premiado.getNumero());
					salida.print(" ");
					j--;
				}
				while (j-- > 0 ){
					salida.print(0);
					salida.print(" ");
				}
				salida.println();
			}
			salida.close();
		}
	}
	
	public void addCategoria(Categoria cat)
	{
		if(cat.getSexo() == Sexo.F)
			catFs[cat.getNumero() -1 ] = cat;

		if(cat.getSexo() == Sexo.M)
			catMs[cat.getNumero() -1 ] = cat;
	}

	public int getCantCategoriasFem()
	{
		return catFs.length;
	}
	
	public int getCantCategoriasMas()
	{
		return catMs.length;	
	}
	
	private Categoria[] catFs;
	private Categoria[] catMs;
	private Corredor[] corredores;


}
