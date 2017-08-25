package torneo;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Torneo t = new Torneo("entrada.in");
		t.resolver();
		t.imprimir();
	}

}
