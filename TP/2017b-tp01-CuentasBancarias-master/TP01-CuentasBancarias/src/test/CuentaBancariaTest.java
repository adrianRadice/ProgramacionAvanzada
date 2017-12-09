package test;

import org.junit.Assert;
import org.junit.Test;

import CuentaBancaria.CuentaBancaria;

public class CuentaBancariaTest {

	@Test
	public void iniciaCuentaEn0(){
		CuentaBancaria cuenta = new CuentaBancaria();
		Assert.assertEquals(0,cuenta.getSaldo(),0.10);
	}
	@Test
	public void depositar200Pesos(){
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(200);
		Assert.assertEquals(200,cuenta.getSaldo(),0.10);
	}

	@Test
	public void depositarACuentaConSaldoPositivo(){
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(300);
		cuenta.depositar(300);
		Assert.assertEquals(600,cuenta.getSaldo(),0.10);
	}
	@Test
	public void depositarSaldoNegativo(){
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(-300);
		Assert.assertEquals(0,cuenta.getSaldo(),0.10);
	}
	@Test
	public void retirar200Pesos(){
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(200);
		cuenta.retirar(200);
		Assert.assertEquals(0,cuenta.getSaldo(),0.10);
	}
	@Test
	public void retirarSaldoInsuficiente(){
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(200);
		cuenta.retirar(500);
		Assert.assertEquals(200,cuenta.getSaldo(),0.10);
	}
	@Test
	public void retirarMontoNegativo(){
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.depositar(200);
		cuenta.retirar(-500);
		Assert.assertEquals(200,cuenta.getSaldo(),0.10);
	}
	
	@Test
	public void transferir200aDestino(){
		CuentaBancaria origen = new CuentaBancaria();
		CuentaBancaria destino = new CuentaBancaria();
		origen.depositar(500);
		origen.transferirMontoA(destino,200);
		Assert.assertEquals(200,destino.getSaldo(),0.10);
	}
	

	@Test
	public void transferir(){
		CuentaBancaria origen = new CuentaBancaria();
		CuentaBancaria destino = new CuentaBancaria();
		origen.depositar(500);
		origen.transferirMontoA(destino,200);
		Assert.assertTrue(origen.getSaldo() == 300 && destino.getSaldo() == 200);
	}

	@Test
	public void autoTransferencia(){

		CuentaBancaria origen = new CuentaBancaria();
		CuentaBancaria destino = origen;
		origen.depositar(500);
		origen.transferirMontoA(destino,200);
		Assert.assertEquals(500,destino.getSaldo(),0.10);
	}
	@Test
	public void transferirDestinoNoOperativa(){
		CuentaBancaria origen = new CuentaBancaria();
		CuentaBancaria destino = new CuentaBancaria();
		destino.inoperar();
		origen.depositar(500);
		origen.transferirMontoA(destino,200);
		Assert.assertTrue(origen.getSaldo() == 500 && destino.getSaldo() == 0);
	}

	@Test
	public void transferirOrigenNoOperativa(){
		CuentaBancaria origen = new CuentaBancaria();
		CuentaBancaria destino = new CuentaBancaria();
		origen.inoperar();
		origen.depositar(500);
		origen.transferirMontoA(destino,200);
		Assert.assertTrue(origen.getSaldo() == 500 && destino.getSaldo() == 0);
	}

}
