package grafo;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void recorrer(Igrafo g, Nodo nodoInicial){
		
		boolean[] visitado = new boolean[g.getCantidadDeNodos()];
		Queue<Nodo> cola = new LinkedList<Nodo>();
		
		visitado[nodoInicial.getIndex()] = true;
		cola.add(nodoInicial);
		
		while(!cola.isEmpty())
		{
			Nodo n = cola.poll();
			for(Nodo ady : g.getAdyacentes(n))
			{
				if(visitado[ady.getIndex()] == false)
				{
					cola.add(ady);	
					System.out.println(ady.toString());
					visitado[ady.getIndex()] = true;
					
				}
			}
		}
	}
	
	public static void main(String args[]){
		Igrafo g = new Grafo(9,Integer.MAX_VALUE);
	
		Nodo nS = new Nodo(0,"s");
		Nodo nA = new Nodo(1,"a");
		Nodo nB = new Nodo(2,"b");
		Nodo nC = new Nodo(3,"c");
		Nodo nD = new Nodo(4,"d");
		Nodo nE = new Nodo(5,"e");
		Nodo nF = new Nodo(6,"f");
		Nodo nG = new Nodo(7,"g");
		Nodo nH = new Nodo(8,"h");
		
		g.addNodo(nS);
		g.addNodo(nA);
		g.addNodo(nB);
		g.addNodo(nC);
		g.addNodo(nD);
		g.addNodo(nE);
		g.addNodo(nF);
		g.addNodo(nG);
		g.addNodo(nH);
		
		g.addArista(new Arista(nS,nA,1));
		g.addArista(new Arista(nA,nD,1));
		g.addArista(new Arista(nD,nG,1));
		g.addArista(new Arista(nA,nE,1));
		g.addArista(new Arista(nE,nG,1));
		g.addArista(new Arista(nS,nB,1));
		g.addArista(new Arista(nB,nE,1));
		g.addArista(new Arista(nS,nC,1));
		g.addArista(new Arista(nC,nF,1));
		g.addArista(new Arista(nF,nG,1));
		g.addArista(new Arista(nF,nH,1));

		System.out.println("BFS");
		BFS.recorrer(g, nS);
		System.out.println("DFS");
		DFS.recorrer(g, nS);
		
	}
	
}
