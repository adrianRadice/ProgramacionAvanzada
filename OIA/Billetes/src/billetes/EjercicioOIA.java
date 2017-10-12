package billetes;

import java.io.File;
import java.io.FileReader;

public abstract class EjercicioOIA {
	protected File entrada;
	protected File salida;
	
	public EjercicioOIA(File entrada2, File salida){
		this.entrada = entrada2;
		this.salida = salida;
		
	}
	
	public abstract void resolver();

}
