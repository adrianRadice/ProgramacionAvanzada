package grafo;

public interface Igrafo {
	public void addNodo(Nodo n);
	public void addArista(Arista a);
	public int getCantidadDeNodos();
	public void imprimirGrafo();
	public Nodo[] getNodos();
	public Arista getArista(NodoGenerico n1 ,NodoGenerico n2);
	
}