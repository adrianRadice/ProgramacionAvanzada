package vagones;

import java.io.File;

public abstract class EjercicioOIA {
	protected File entrada;
	protected File salida;
	
	
	public EjercicioOIA(File entrada, File salida) {
		super();
		this.entrada = entrada;
		this.salida = salida;
	}


	public abstract void resolve();
}
