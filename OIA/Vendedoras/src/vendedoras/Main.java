package vendedoras;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception
	{
		ArrayList<Vendedor> vendedoras = new ArrayList<Vendedor>();
		
		Scanner sc = new Scanner(new File("entrada.in"));
		
		for(short i =0, cantVendedoras = sc.nextShort(); i<cantVendedoras; )
		{
			Vendedor vendedora = new Vendedor(++i);
			short cantVentas = sc.nextShort();
			for(short venta = 0; venta<cantVentas; venta++)
				vendedora.addMontoVenta(sc.nextFloat());
			vendedoras.add(vendedora);
		}
		
		short N = sc.nextShort();
		sc.close();
		
		float montoMaximo = -1;
		boolean empate = true;
		
		while(empate && N<=10000)
		{
			for(int i = 0; i<vendedoras.size(); i++)
			{
				Vendedor vendedora = vendedoras.get(i);
				if(vendedora.getCantVentas()<N){
					vendedoras.remove(vendedora);
					i--;
				}
				else
				{
					float montoVentaMayVend = vendedora.getMayorImporteEnVentasConsecutivas(N);
					if(montoMaximo < montoVentaMayVend){
						montoMaximo = montoVentaMayVend;
						empate = false;
						
					}
					else if (montoMaximo == montoVentaMayVend)
						empate = true;
					else{
						vendedoras.remove(vendedora);
						i--;
					}
				}
			}
			N++;
		}

		PrintWriter salida = new PrintWriter(new FileWriter("salida.out")); 
		

		if(vendedoras.size() == 0 && montoMaximo == -1)
				salida.println("No hay ganadoras");
		else if(empate)
				salida.println("No se puede desempatar");
		else
		{
			salida.println(vendedoras.get(0).getNumero());
			salida.print(N-1);
			salida.print(" ");
			salida.print(montoMaximo);
		}
		
		salida.close();
	}
}
