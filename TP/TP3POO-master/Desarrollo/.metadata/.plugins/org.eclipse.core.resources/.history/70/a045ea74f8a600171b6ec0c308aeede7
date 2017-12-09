package personaje;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import item.Capa;
import item.Escudo;
import item.Punial;
/**
 * @author adrian
 *
 */
public class LanceroTest {

	private final double ATAQUE = 25;
	private final double SALUD = 150;
	private final double ENERGIA = 1;
	private final double DEFENSA = 0;

	private Unidad unidad;

	
	@Test
	public void crearNuevoTest(){
		unidad = new Lancero(1);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , DEFENSA)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}
	
	@Test
	public void equiparEscudoTest(){
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , DEFENSA + 10 * 0.4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparPunialTest(){
		unidad = new Lancero(1);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,- 3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparCapaTest(){
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(), ATAQUE - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 0)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparEscudoCapaTest(){
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE - ATAQUE * 0.1 )   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,10 * 0.4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaEscudoTest(){
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE - ATAQUE * .1 )   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,10 * .4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparEscudoPunialTest(){
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 10*.4 - 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparPunialEscudoTest(){
		unidad = new Lancero(1);
		unidad = new Punial(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 10* .4 - 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparPunialCapaTest(){
		unidad = new Lancero(1);
		unidad = new Punial(unidad);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialTest(){
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,- 3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparEscudoCapaPunialTest(){
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaEscudoPunialTest(){
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialEscudoTest(){
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparPunialCapaEscudoTest(){
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	
	
	@Test
	public void distanciaNoValidaParaCombate(){
		Unidad u1 = new Lancero(0);
		Unidad u2 = new Soldado(4);
		assertFalse(u1.puedoAtacar(u2));
		u1 = new Caballero(0);
		u2 = new Arquero(0);
		assertFalse(u1.puedoAtacar(u2));
	}
	
	@Test
	public void distanciaValidaParaCombate(){
		Unidad u1 = new Lancero(5);
		Unidad u2 = new Soldado(6);

		for(int i=0 ; i<3; i++){
			assertTrue(u1.puedoAtacar(u2));
			u2.avanzar();
		}
	}
	
	@Test
	public void puedeRestaurarEnergia(){
		unidad = new Lancero(1);
		assertFalse(unidad.puedeRestauraEnergia());
	}

	@Test
	public void agotarEnergia(){
		unidad = new Lancero(1);
		Unidad victima = new Soldado(2);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.getEnergia(), ENERGIA, 0.1);
	}
	
	@Test
	public void restaurarEnergia(){
		unidad = new Lancero(1);
		Unidad victima = new Soldado(2);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
		}
		double e = unidad.getEnergia();
		unidad.restaurarEnergia();
		assertEquals(unidad.getEnergia(), e, 0.1);
		
	}

	@Test
	public void noPoderAtacarMuertos(){
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(unidad.puedoAtacar(victima));
	
	}
	
	@Test
	public void noAtacarMuertos(){
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
	
	}

	@Test
	public void noSeAutoAtaca(){

		unidad = new Lancero(1);
		assertFalse(unidad.puedoAtacar(unidad));
	}

	@Test
	public void noPoderAtacarEstandoMuerto(){
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(victima.puedoAtacar(unidad));
	}

	@Test
	public void noAtacarEstandoMuerto(){
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(victima.atacar(unidad), 0, 0.1);
	
		
	}
	
	
	
}
