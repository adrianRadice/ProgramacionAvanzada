package vagones; 
 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.Arrays; 
import java.util.Scanner; 
 
public class Solve extends EjercicioOIA { 
 
  private int cantidadVagones; 
  private int agresividadTotal; 
  private int agresividadMaxima; 
  private Especie[] especies; 
 
  public Solve(File entrada, File salida) throws FileNotFoundException { 
    super(entrada, salida); 
    // TODO Auto-generated constructor stub 
    Scanner sc = new Scanner(entrada); 
    int cantidadEspecies = sc.nextInt(); 
    especies = new Especie[cantidadEspecies]; 
    agresividadMaxima = sc.nextInt(); 
    for(int i=0 ; i<cantidadEspecies ; i++) 
      especies[i]=(new Especie(sc.next(),sc.nextInt(),sc.nextInt())); 
    sc.close(); 
  } 
  public void acomodarEnVagones(){ 
    Arrays.sort(especies); 
      cantidadVagones = 1; 
    int agresividadMaximaVagon = especies[0].getAgresividad(); 
    int agresividadMinimaVagon = especies[0].getAgresividad(); 
    for(int i=1 ; i<especies.length; i++) 
    { 
      if((agresividadMaximaVagon - especies[i].getAgresividad()) > agresividadMaxima){ 
        cantidadVagones++; 
        agresividadTotal += agresividadMaximaVagon - agresividadMinimaVagon; 
        agresividadMaximaVagon = especies[i].getAgresividad(); 
        agresividadMinimaVagon = agresividadMaximaVagon; 
      } 
      else 
        agresividadMinimaVagon = especies[i].getAgresividad(); 
    } 
    agresividadTotal += agresividadMaximaVagon - agresividadMinimaVagon; 
  } 
   
  @Override 
  public void resolve() { 
    acomodarEnVagones(); 
    PrintWriter pw = null; 
    try { 
      pw = new PrintWriter(salida); 
      pw.print(cantidadVagones); 
      pw.print(' '); 
      pw.print(agresividadTotal); 
    } catch (FileNotFoundException e) { 
      // TODO Auto-generated catch block 
      e.printStackTrace(); 
      } 
    finally{ 
      if(pw != null) 
        pw.close(); 
    } 
  } 
 
  public static void main(String args[]) throws FileNotFoundException{ 
    new Solve(new File("entrada.in"),new File("salida.out")).resolve(); 
  } 
   
 
} 