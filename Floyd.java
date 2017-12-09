package Algoritmo;

import grafo.Digrafo;

public class Floyd {

		public static int[][] obtener (Digrafo g)
		{
			 
			int aristas[][] = g.getMatriz();
			int cantidadNodos =aristas[0].length;
			int i,j,k;
			
			for(i=0; i < cantidadNodos ; i++)
				aristas[i][i] = 0;
			
			for(k=0;k<cantidadNodos; k++)
			{
				for(i=0; i<cantidadNodos; i++)
				{
					for(j=0; j<cantidadNodos;j++)
					{
						if(aristas[i][k] != g.getRepresentacionInfinito()&&
						   aristas[k][j] != g.getRepresentacionInfinito())
						{
							int dist = aristas[i][k]+ aristas[k][j];
							if(dist<aristas[i][j])
								aristas[i][j] = dist;
						}
							
					}
				}
			}
			return aristas;
		}
}
