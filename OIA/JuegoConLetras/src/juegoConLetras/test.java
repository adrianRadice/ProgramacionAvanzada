package juegoConLetras;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class test {

	@Test
	public void test() {
		Palabra palabra = new Palabra("adrian");
		int tamanio = 8;
		
		Palabra.setSalto(tamanio);
		
		String sopa = "XXadrianXnairdaXXadrianXAXXXXXXXAX";

		int j=0;
		
		
		
		for(int i= 0; i<sopa.length(); i++){
			if((i+1)%tamanio==0)
				palabra.reiniciarLrRl();
			if(palabra.evaluarCaracter(sopa.charAt(i))){
				j++;
				if(j==2){
					Assert.assertTrue(true);
					return;
				}
				
			}
		}
		
		Assert.assertTrue(false);
		
	}

}
