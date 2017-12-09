 
public  abstract class Padre extends Abuelo { 
  private String nombrePadre; 
   
  public Padre(){ 
    System.out.println("CREANDO PADRE"); 
  } 
 
  public Padre(String nombrePadre) { 
    super(); 
    this.nombrePadre = nombrePadre; 
  } 
 
 
  public void testLlamado() { 
    super.testLlamado(); 
    System.out.println("padre"); 
  } 
} 