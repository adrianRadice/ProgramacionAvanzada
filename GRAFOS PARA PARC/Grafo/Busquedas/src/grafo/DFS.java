package grafo;

import java.util.Stack;

public class DFS {
	public static void recorrer(Igrafo g, Nodo nodoInicial){
		
		boolean[] visitado = new boolean[g.getCantidadDeNodos()];
		Stack<Nodo> pila = new Stack<Nodo>();
		
		visitado[nodoInicial.getIndex()] = true;
		pila.push(nodoInicial);
		
		while(!pila.isEmpty())
		{
			Nodo n = pila.pop();
			System.out.println(n.toString());
			for(Nodo ady : g.getAdyacentes(n))
			{
				if(visitado[ady.getIndex()] == false)
				{
					pila.push(ady);
					visitado[ady.getIndex()] = true;
					
				}
			}
		}
	}
}
