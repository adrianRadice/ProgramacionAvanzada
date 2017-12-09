
public class Hija extends Padre implements ITest { 
  private String nombreHija="hola"; 
  private String nombre; 
   
  private final int atributoFinalSinInicializar; 
  private final int atributoFinalInicializado=2; 
  private int t; 
   
  public Hija(){ 
    System.out.println("CREANDO HIJA POR CONSTRUCTOR DEFAULT"); 
    atributoFinalSinInicializar=2; 
  } 
   
   
  public Hija(String nombreHija, String nombrePadre){ 
    super(nombrePadre); 
    System.out.println("CREANDO HIJA"); 
    System.out.println(this.nombreHija); 
    System.out.println(this.nombre); 
    System.out.println("///"); 
    this.nombreHija = nombreHija; 
    atributoFinalSinInicializar=2; 
  } 
  public Hija(int a){ 
    this(); 
    t=2; 
  } 
   
  @Override 
  public String toString() { 
    return "Hija [nombreHija=" + nombreHija + ", nombre=" + nombre + ", atributoFinalSinInicializar=" 
        + atributoFinalSinInicializar + ", atributoFinalInicializado=" + atributoFinalInicializado + ", t=" + t 
        + "]"; 
  } 
 
 
  @Override 
  public void testLlamado() { 
    System.out.println("HIJA"); 
    super.testLlamado(); 
  } 
   
  public static void main(String args[]) 
  { 
    Hija p = new Hija(); 
    Abuelo a = new Abuelo(); 
     
    System.out.println(p); 
 
    Hija p2 = new Hija("AAAA","BB"); 
    System.out.println(p2); 
    p.testLlamado(); 
     
    System.out.println(new Hija(2)); 
     
     
     
  } 
   
} 
 
 
///NUNCA UNA CLASE PUEDE DEFINIR UN CONSTRUCTOR COMO ABSTRACTO 
///UN METODO DECLARADO COMO FINAL NO SE PUEDE SOBRESCRIBIR 
///NUNCA SE LE PUEDE ASIGNAR UN NUEVO VALOR A UN PARAMETRO DECLARADO COMO FiNAL 
///SI UN ATRIBUTO ES DECLARADO FINAL SIEMPRE DEBE SER INICIALIZADO ALMENOS POR EL CONSTRUCTOR 
///SI QUEREMOS USAR EL EQUALS O EL HASHCODE PARA QUE ANDE DEBE ESTAR EN TODOS LOS NIVELES DE HERENCIA 
///SIEMPRE LA PRIMERA LINEA DEL CONSTRUCTOR ES INVOCAR AL PADRE SINO NO LO PONES LLAMA A EL QUE ES POR DEFECTO. 
///EN JAVA SOLO EXISTE LA HERENCIA SIMPLE 
///EL ORDEN ES DE HEREDAR Y IMPLEMENTAR ES extends y luego implements. 
///UNA CLASE PUEDE IMPLEMENTAR MAS DE UNA INTERFAZ Y SE LAS SEPARA POR COMAS 
///LLAMAR AL CONSTRUCTOR SE PUEDE POR this() 