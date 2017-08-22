package vendedoras;

import java.util.ArrayList;

public class Vendedor {
	public Vendedor(short numero)
	{
		this.numero = numero;
		this.montos = new ArrayList<Float>();
	}

	public void addMontoVenta(float monto)
	{
		if(monto > 0)
			montos.add(monto);
	}
	
	public float getMayorImporteEnVentasConsecutivas(int cantConsecutivas) throws Exception
	{
		if(cantConsecutivas > montos.size())
			throw new Exception("No cumple con las cantidad de ventas");

		float montoMaximo = 0, acumulador;
		for(int i=0; i <= montos.size()-cantConsecutivas; i++)
		{
			acumulador = 0;
			for(int j=0; j<cantConsecutivas;j++)
				acumulador += montos.get(i+j);
			if(acumulador >= montoMaximo)
				montoMaximo = acumulador;
		}
	
		
		return montoMaximo;
	}
	
	public int getCantVentas()
	{
		return montos.size();
	}
	public short getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}
	
	private short numero;
	private ArrayList<Float> montos;

	
}
