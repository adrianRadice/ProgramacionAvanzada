package grafo;

public interface IGrafo {

	void setConexion(Arista arista) throws Exception;

	Arista getArista(Nodo nodoInicial, Nodo nodoFinal) throws Exception;

	int getCantidadDeNodos();

	int getValorInfinito();

}