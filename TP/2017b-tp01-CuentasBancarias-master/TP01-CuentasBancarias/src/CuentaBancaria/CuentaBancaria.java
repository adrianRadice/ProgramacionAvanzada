package CuentaBancaria;

public class CuentaBancaria {
	private double saldo;
	private boolean operativa;

	public CuentaBancaria(){
		this.saldo = 0;
		this.operativa = true;
	}
	
	public void inoperar(){
		this.operativa = false;
	}

	
	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double monto) {
		if(monto>=0 )
			this.saldo += monto;
	}

	public void retirar(double monto) {
		if(monto<=this.saldo && monto > 0)
			this.saldo -= monto;
		
	}

	public void transferirMontoA(CuentaBancaria destino, double monto) {
		if(!destino.equals(this) && destino.operativa && operativa){
			this.retirar(monto);
			destino.depositar(monto);
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return false;
	}

}
