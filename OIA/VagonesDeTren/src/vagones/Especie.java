package vagones; 
 
 
public class Especie implements Comparable<Especie> { 
 
  private String especie; 
  private int agresividad; 
  private int cantidad; 
   
  public Especie(String especie, int agresividad, int cantidad) { 
    super(); 
    this.especie = especie; 
    this.agresividad = agresividad; 
    this.cantidad = cantidad; 
  } 
   
  public int compareTo(Especie e){ 
    if(this.agresividad > e.agresividad) 
      return -1; 
    if(this.agresividad < e.agresividad) 
      return 1; 
    return 0; 
  } 
 
  @Override 
  public String toString() { 
    return "Especie [especie=" + especie + ", agresividad=" + agresividad + ", cantidad=" + cantidad + "]"; 
  } 
 
  public int getAgresividad() { 
    // TODO Auto-generated method stub 
    return agresividad; 
  } 
   
   
} 
