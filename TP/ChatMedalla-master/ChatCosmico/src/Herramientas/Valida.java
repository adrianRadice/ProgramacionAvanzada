package Herramientas;

public class Valida {

	public static boolean validateIP(final String ip) {
	    String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
	    return ip.matches(PATTERN);
	}
	
	public static boolean validaPuerto(final String puerto) {
		try{
			Integer p = Integer.parseInt(puerto);
			if(p> 0 && p< 65535 )
				return true;
			
		}
		catch(Exception ex){
			return false;
		}
		return false;
	}
	
}
