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
public class CaballeroTest {
	private final double ATAQUE = 50;
	private final double SALUD = 200;
	private final double ENERGIA = 3;
	private final double DEFENSA = 0;
	private final double ENERGIA_CONSUMIDA = 1;
	private final int POS1=0;
	private final int POS2=1;

	private Unidad unidad;
	

	@Test
	public void crearNuevoTest() throws Exception{
		unidad = new Caballero(1);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , DEFENSA)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}
	
	@Test
	public void equiparEscudoTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparPunialTest() throws Exception{
		unidad = new Caballero(1);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparCapaTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparEscudoCapaTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparCapaEscudoTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparEscudoPunialTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparPunialEscudoTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparPunialCapaTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparCapaPunialTest() throws Exception{
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparEscudoCapaPunialTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparCapaEscudoPunialTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparCapaPunialEscudoTest() throws Exception{
		unidad = new Caballero(1);
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
	public void equiparPunialCapaEscudoTest() throws Exception{
		unidad = new Caballero(1);
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
	public void distanciaNoValidaParaCombate() throws Exception{
		Unidad u1 = new Caballero(0);
		Unidad u2 = new Soldado(3);
		assertFalse(u1.puedoAtacar(u2));
		u1 = new Caballero(0);
		u2 = new Arquero(0);
		assertFalse(u1.puedoAtacar(u2));
	}
	
	@Test
	public void distanciaValidaParaCombate() throws Exception{
		Unidad u1 = new Caballero(5);
		Unidad u2 = new Soldado(6);

		for(int i=0 ; i<2; i++){
			assertTrue(u1.puedoAtacar(u2));
			u2.avanzar();
		}
	}
	
	@Test
	public void puedeRestaurarEnergia() throws Exception{
		unidad = new Caballero(1);
		unidad.atacar(new Soldado(2));
		assertTrue(unidad.puedeRestauraEnergia());
	}

	@Test
	public void agotarEnergia() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Caballero(2);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.getEnergia(), 0, 0.1);
	}
	
	@Test
	public void restaurarEnergia() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Caballero(2);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
		}
		unidad.restaurarEnergia();
		assertEquals(unidad.getEnergia(), ENERGIA, 0.1);
		
	}
	
	
	@Test
	public void noPoderAtacarMuertos() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Caballero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(unidad.puedoAtacar(victima));
	
	}
	
	@Test
	public void noAtacarMuertos() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Caballero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
	
	}

	@Test
	public void noSeAutoAtaca() throws Exception{

		unidad = new Caballero(1);
		assertFalse(unidad.puedoAtacar(unidad));
	}

	@Test
	public void noPoderAtacarEstandoMuerto() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Caballero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(victima.puedoAtacar(unidad));
	}

	@Test
	public void noAtacarEstandoMuerto() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Caballero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(victima.atacar(unidad), 0, 0.1);
	
		
	}
	
	@Test
	public void noPoderAtacarAgotado() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Soldado(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		System.out.println(unidad.getEnergia());
		assertFalse(unidad.puedoAtacar(new Soldado(200)));
	}	
	
	@Test
	public void noAtacarAgotado() throws Exception{
		unidad = new Caballero(1);
		Unidad victima = new Caballero(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.atacar(new Soldado(200)), 0, 0.1);
		
	}


	@Test
	public void noPermiteMutipleEscudo() throws Exception{
		unidad = new Caballero(1);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		try{
			unidad = new Escudo(unidad);
			assertTrue(false);
		}
		catch(Exception ex){
			unidad = new Capa(unidad);
			assertTrue(true);
		}
	}
	@Test
	public void noPermiteMutiplePunial() throws Exception{
		unidad = new Caballero(1);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		try{
			unidad = new Punial(unidad);
			assertTrue(false);
		}
		catch(Exception ex){
			unidad = new Capa(unidad);
			assertTrue(true);
		}
	}
	@Test
	public void noPermiteMutipleCapa() throws Exception{
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		try{
			unidad = new Capa(unidad);
			assertTrue(false);
		}
		catch(Exception ex){
			unidad = new Escudo(unidad);
			assertTrue(true);
		}
	}
	

	/////////////LUCHO MIRAR DESDE ACA PARA ABAJO PARA BASARTE PARA LOS OTROS TEST
	@Test
	public void baseAtacadoPorCaballeroBase() throws Exception{
		unidad = new Caballero(POS1);
		Unidad atacante = new Caballero(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Caballero(POS1);
		Unidad atacante = new Caballero(POS2);
		atacante = new Escudo(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Caballero(POS1);
		Unidad atacante = new Caballero(POS2);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE +3));
	}
	@Test
	public void baseAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Caballero(POS1);
		Unidad atacante = new Caballero(POS2);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Caballero(POS1);
		Unidad atacante = new Caballero(POS2);
		atacante = new Escudo(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE + 3));
	}
	@Test
	public void baseAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Caballero(POS1);
		Unidad atacante = new Caballero(POS2);
		atacante = new Escudo(atacante);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Caballero(POS1);
		Unidad atacante = new Caballero(POS2);
		atacante = new Capa(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*0.1 + 3));
	}
	
	//////
	@Test
	public void conEscudoAtacadoPorCaballeroBase() throws Exception{
		unidad = new Escudo(new Caballero(POS1));
		Unidad atacante = new Caballero(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Escudo(new Caballero(POS1));
		Unidad atacante =  new Escudo(new Caballero(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Escudo(new Caballero(POS1));
		Unidad atacante =  new Punial(new Caballero(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Escudo(new Caballero(POS1));
		Unidad atacante =  new Capa(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Caballero(POS1));
		Unidad atacante =  new Escudo(new Punial(new Caballero(POS2)));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Caballero(POS1));
		Unidad atacante =  new Escudo(new Capa(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Caballero(POS1));
		Unidad atacante =  new Capa(new Punial(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque+=3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conPunialAtacadoPorCaballeroBase() throws Exception{
		unidad = new Punial(new Caballero(POS1));
		Unidad atacante =  new Caballero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Punial(new Caballero(POS1));
		Unidad atacante =  new Escudo(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Punial(new Caballero(POS1));
		Unidad atacante =  new Punial(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Punial(new Caballero(POS1));
		Unidad atacante =  new Capa(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Punial(new Caballero(POS1));
		Unidad atacante =  new Escudo( new Punial(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3+3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Punial(new Caballero(POS1));
		Unidad atacante =  new Capa( new Escudo(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Punial(new Caballero(0));
		Unidad atacante =  new Capa( new Punial(new Caballero(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3+3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conCapaAtacadoPorCaballeroBase() throws Exception{
		unidad = new Capa(new Caballero(POS1));
		Unidad atacante =  new Caballero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Capa(new Caballero(POS1));
		Unidad atacante = new Escudo( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Capa(new Caballero(POS1));
		Unidad atacante = new Punial( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Capa(new Caballero(POS1));
		Unidad atacante = new Capa( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Caballero(POS1));
		Unidad atacante = new Escudo(new Punial( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Caballero(POS1));
		Unidad atacante = new Escudo(new Capa( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Capa(new Caballero(POS1));
		Unidad atacante = new Punial(new Capa( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conCapaYEscudoAtacadoPorCaballeroBase() throws Exception{
		unidad = new Escudo(new Capa(new Caballero(POS1)));
		Unidad atacante = new Caballero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Escudo(new Capa(new Caballero(POS1)));
		Unidad atacante = new Escudo(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Escudo(new Capa(new Caballero(POS1)));
		Unidad atacante = new Punial(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Escudo(new Capa(new Caballero(POS1)));
		Unidad atacante = new Capa(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Caballero(POS1)));
		Unidad atacante = new Escudo( new Punial(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Capa(new Caballero(POS1)));
		Unidad atacante =new Escudo( new Capa(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Caballero(POS1)));
		Unidad atacante = new Punial( new Capa(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
//////
	@Test
	public void conPunialYEscudoAtacadoPorCaballeroBase() throws Exception{
		unidad = new Escudo(new Punial(new Caballero(POS1)));
		Unidad atacante = new Caballero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Escudo(new Punial(new Caballero(POS1)));
		Unidad atacante = new Escudo(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Escudo(new Punial(new Caballero(POS1)));
		Unidad atacante =new Punial( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Escudo(new Punial(new Caballero(POS1)));
		Unidad atacante =new Capa( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Caballero(POS1)));
		Unidad atacante =new Escudo(new Punial( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Punial(new Caballero(POS1)));
		Unidad atacante =new Escudo(new Capa( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Caballero(POS1)));
		Unidad atacante =new Punial(new Capa( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1 +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	//////
	@Test
	public void conPunialYCapaAtacadoPorCaballeroBase() throws Exception{
		unidad = new Capa(new Punial(new Caballero(POS1)));
		Unidad atacante =new Caballero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Capa(new Punial(new Caballero(POS1)));
		Unidad atacante = new Escudo(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Capa(new Punial(new Caballero(POS1)));
		Unidad atacante = new Punial(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3;
		valorAtaque = valorAtaque  + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Capa(new Punial(new Caballero(POS1)));
		Unidad atacante = new Capa(new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Punial(new Caballero(POS1)));
		Unidad atacante = new Escudo(new Punial(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Punial(new Caballero(POS1)));
		Unidad atacante = new Escudo(new Capa(new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Capa(new Punial(new Caballero(POS2)));
		Unidad atacante = new Punial(new Capa(new Caballero(POS1)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroBase() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Caballero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroConEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Escudo( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroConPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Punial( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroConCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Capa( new Caballero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*0.1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Escudo(new Punial( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Escudo(new Capa( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroConCapaYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Punial(new Capa( new Caballero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorCaballeroConCapaPunialYEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Caballero(POS1))));
		Unidad atacante = new Escudo(new Punial(new Capa( new Caballero(POS2))));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
}

	
	
