import java.util.Hashtable;

public class Distinguida {

	private Distinguida()
	{
		palindromo = false;
		iPalindromo = false;
		dPalindromo = false;
	}
	
	public String toString()
	{
		String ret = "";
		if(palindromo)
			ret = ret.concat("Palindromo ");
		if(iPalindromo)
			ret = ret.concat("i-Palindromo ");
		if(dPalindromo)
			ret = ret.concat("d-Palindromo");
		return ret;
	}
	
	public static boolean esPalindromo(String cadena)
	{
		return cadena.matches("(?x) | (?:(.) (?<=(?=^.*? (\\1 \\2?)$).*))+ (?<=(?=^\\2$).*)");
	}
	
	/**
	 * Método devuelve todas las palabras distinguidas que pueden encontrarse al segmentar la cadena en todas sus formas.
	 * @param cadenaIn cadena a analizar
	 * @return Restorna un hashtable que tiene como clave las palabras distinguidas encontradas y como valor tienen el tipo de distinguidas
	 */
	public static Hashtable<String, Distinguida> obtenerDistinguidas(String cadenaIn) {
		int largoCadena = cadenaIn.length();
		
		if(largoCadena < 2)
			return null;
		
		Hashtable<String, Distinguida> distinguidas = new Hashtable<String, Distinguida>();

		if(largoCadena == 2 && cadenaIn.substring(0, 1)==cadenaIn.substring(1, 1)){
			Distinguida d = new Distinguida();
			d.palindromo = true;
			distinguidas.put(cadenaIn,d);
			return distinguidas;
		}
		
		String cadAux = cadenaIn;
		for(int extremoIzq=0; extremoIzq<largoCadena; extremoIzq++)
		{
			for(int extremoDer = largoCadena; extremoDer > 1+extremoIzq ; extremoDer-- )
			{
				cadAux =cadenaIn.substring(extremoIzq,extremoDer);
				if(Distinguida.esPalindromo(cadAux))
				{
					Distinguida distinguida = distinguidas.get(cadAux);
					if(distinguida==null)
						distinguida = new Distinguida();
					distinguida.palindromo = true;
					distinguidas.put(cadAux, distinguida);
					
					//ES I-PALINDROMO
					if(extremoIzq-1> 0){
						distinguida = distinguidas.get(cadenaIn.substring(extremoIzq-1,extremoDer));
						if(distinguida==null)
							distinguida = new Distinguida();
						distinguida.iPalindromo =true;
						distinguidas.put(cadenaIn.substring(extremoIzq-1,extremoDer),distinguida );
					}
					//ES D-PALINDRROMO
					if(extremoDer+1<= cadenaIn.length()){
						distinguida = distinguidas.get(cadenaIn.substring(extremoIzq,extremoDer+1));
						if(distinguida==null)
							distinguida = new Distinguida();
						distinguida.dPalindromo = true;
						distinguidas.put(cadenaIn.substring(extremoIzq,extremoDer+1),distinguida );
					}
				}
			}
		}
		return distinguidas;
	}
	
	private boolean palindromo;
	private boolean iPalindromo;
	private boolean dPalindromo;
}
