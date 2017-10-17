package petrolera;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solve extends EjercicioOIA {

	private ArrayList<Deposito> depositos;
	//private ArrayList<Deposito> depositosEmpleados;
	private int cantidadDepositos;
	private int volumenADistribuir;
	private int petroleoRebalsado;
	private int cantDepoEmpleados;
	private float profSueloNivelFluido;
	
	
	public Solve(File entrada, File salida) throws FileNotFoundException {
		super(entrada, salida);
		// TODO Auto-generated constructor stub
		depositos = new ArrayList<Deposito>();
	//	depositosEmpleados = new ArrayList<Deposito>();
		Scanner sc = new Scanner(entrada);
		cantidadDepositos = sc.nextInt();
		///NO ES NECESARIO inicializarlo en 0 PERO QUEDA MAS CLARO
		petroleoRebalsado = 0;
		cantDepoEmpleados = 0;
		profSueloNivelFluido = 0;
		////
		for (int i= 0; i<cantidadDepositos; i++) {
			depositos.add(new Deposito(sc.nextInt(),sc.nextInt()));
		}
		volumenADistribuir = sc.nextInt();
		sc.close();	
	}
	
	public void distribuirPetroleo() {
		float profundidadActual = depositos.get(0).getProfundidad();
		if(cantidadDepositos == 1)
		{
			int rebalsa = volumenADistribuir - depositos.get(0).getVolumen();
			if(rebalsa > 0)
				petroleoRebalsado = rebalsa;
			else
			{
				//depositosEmpleados.add(depositos.get(0));
				cantDepoEmpleados = 1;
				profSueloNivelFluido = profundidadActual - volumenADistribuir / depositos.get(0).getSuperficie();
			}
		}
		else
		{
			int i = 0;
			int proximaProfundidad;	
			float diferenciaProfundidad;
			int sup=0;
			
			while(volumenADistribuir > 0) {
				
				while(i < depositos.size() && depositos.get(i).getProfundidad()==profundidadActual) {
					cantDepoEmpleados++;
					//depositosEmpleados.add(depositos.get(i));
					sup += depositos.get(i).getSuperficie();
					i++;
				}
				
				if(i == depositos.size())
					proximaProfundidad = 0;
				else 
					proximaProfundidad = depositos.get(i).getProfundidad();
				
				diferenciaProfundidad = profundidadActual-proximaProfundidad;
				
				float vol = diferenciaProfundidad * sup;
				
				if(volumenADistribuir > vol)
				{
					if(vol == 0)
					{
						petroleoRebalsado = volumenADistribuir;
						volumenADistribuir = 0;
					}
					volumenADistribuir -= vol;
					profundidadActual = proximaProfundidad;
				}
				else
				{
					profundidadActual =  (volumenADistribuir * diferenciaProfundidad / vol);
					profSueloNivelFluido = /*depositosEmpleados.get(depositosEmpleados.size()-1).getProfundidad()*/depositos.get(cantDepoEmpleados-1).getProfundidad() - profundidadActual;
					volumenADistribuir = 0;
				}
			}
			
		}
	}


	@Override
	public void resolver() {
		distribuirPetroleo();
		PrintWriter pw;
		try {
			pw = new PrintWriter(salida);
			if(petroleoRebalsado > 0)
			{
				pw.print("Rebasan: ");
				pw.print(petroleoRebalsado);
			}
			else
			{
				pw.println(cantDepoEmpleados);
				//pw.println(depositosEmpleados.size());
				pw.println((int)profSueloNivelFluido);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Solve(new File("entrada.in"),new File("salida.out")).resolver();
	}
}
