package personaje;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Capa;
import item.Escudo;
import item.Punial;
/**
 * @author adrian
 *
 */
public class SoldadoTest {
	private final double ATAQUE = 10;
	private final double SALUD = 200;
	private final double ENERGIA = 100;
	private final double DEFENSA = 0;
	private final double ENERGIA_CONSUMIDA = 10;
	private final int POS1=0;
	private final int POS2=0;
	

	private Unidad unidad;
	
	@Test
	public void crearNuevoTest() throws Exception{
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		Unidad u1 = new Soldado(4);
		Unidad u2 = new Soldado(100);
		assertFalse(u1.puedoAtacar(u2));
	}
	
	@Test
	public void distanciaValidaParaCombate() throws Exception{
		Unidad u1 = new Soldado(2);
		Unidad u2 = new Soldado(2);
		assertTrue(u1.puedoAtacar(u2));
	}

	@Test
	public void puedeRestaurarEnergia() throws Exception{
		unidad = new Soldado(1);
		unidad.atacar(new Soldado(1));
		assertTrue(unidad.puedeRestauraEnergia());
	}

	@Test
	public void agotarEnergia() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.getEnergia(), 0, 0.1);
	}
	
	@Test
	public void restaurarEnergia() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
		}
		unidad.restaurarEnergia();
		assertEquals(unidad.getEnergia(), ENERGIA, 0.1);
		
	}

	@Test
	public void noPoderAtacarMuertos() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(unidad.puedoAtacar(victima));
	
	}
	
	@Test
	public void noAtacarMuertos() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
	
	}

	@Test
	public void noSeAutoAtaca() throws Exception{

		unidad = new Soldado(1);
		assertFalse(unidad.puedoAtacar(unidad));
	}

	@Test
	public void noPoderAtacarEstandoMuerto() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(victima.puedoAtacar(unidad));
	}

	@Test
	public void noAtacarEstandoMuerto() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(victima.atacar(unidad), 0, 0.1);
	
		
	}
	
	@Test
	public void noPoderAtacarAgotado() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertTrue(victima.puedoAtacar(unidad));
	}	
	
	@Test
	public void noAtacarAgotado() throws Exception{
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
		
	}

	@Test
	public void noReponerEnergiaSiEstaAlPalo() throws Exception{
		unidad = new Soldado(1);
		assertFalse(unidad.puedeRestauraEnergia());
		
	}

	@Test
	public void noPermiteMutipleEscudo() throws Exception{
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
	public void baseAtacadoPorSoldadoBase() throws Exception{
		unidad = new Soldado(POS1);
		Unidad atacante = new Soldado(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Soldado(POS1);
		Unidad atacante = new Soldado(POS2);
		atacante = new Escudo(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Soldado(POS1);
		Unidad atacante = new Soldado(POS2);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE +3));
	}
	@Test
	public void baseAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Soldado(POS1);
		Unidad atacante = new Soldado(POS2);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Soldado(POS1);
		Unidad atacante = new Soldado(POS2);
		atacante = new Escudo(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE + 3));
	}
	@Test
	public void baseAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Soldado(POS1);
		Unidad atacante = new Soldado(POS2);
		atacante = new Escudo(atacante);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Soldado(POS1);
		Unidad atacante = new Soldado(POS2);
		atacante = new Capa(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*0.1 + 3));
	}
	
	//////
	@Test
	public void conEscudoAtacadoPorSoldadoBase() throws Exception{
		unidad = new Escudo(new Soldado(POS1));
		Unidad atacante = new Soldado(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Escudo(new Soldado(POS1));
		Unidad atacante =  new Escudo(new Soldado(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Escudo(new Soldado(POS1));
		Unidad atacante =  new Punial(new Soldado(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Escudo(new Soldado(POS1));
		Unidad atacante =  new Capa(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Soldado(POS1));
		Unidad atacante =  new Escudo(new Punial(new Soldado(POS2)));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Soldado(POS1));
		Unidad atacante =  new Escudo(new Capa(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Escudo(new Soldado(POS1));
		Unidad atacante =  new Capa(new Punial(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque+=3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conPunialAtacadoPorSoldadoBase() throws Exception{
		unidad = new Punial(new Soldado(POS1));
		Unidad atacante =  new Soldado(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Punial(new Soldado(POS1));
		Unidad atacante =  new Escudo(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Punial(new Soldado(POS1));
		Unidad atacante =  new Punial(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Punial(new Soldado(POS1));
		Unidad atacante =  new Capa(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Punial(new Soldado(POS1));
		Unidad atacante =  new Escudo( new Punial(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3+3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Punial(new Soldado(POS1));
		Unidad atacante =  new Capa( new Escudo(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Capa( new Punial(new Soldado(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3+3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conCapaAtacadoPorSoldadoBase() throws Exception{
		unidad = new Capa(new Soldado(POS1));
		Unidad atacante =  new Soldado(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Capa(new Soldado(POS1));
		Unidad atacante = new Escudo( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Capa(new Soldado(POS1));
		Unidad atacante = new Punial( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Capa(new Soldado(POS1));
		Unidad atacante = new Capa( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Capa(new Soldado(POS1));
		Unidad atacante = new Escudo(new Punial( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Capa(new Soldado(POS1));
		Unidad atacante = new Escudo(new Capa( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Capa(new Soldado(POS1));
		Unidad atacante = new Punial(new Capa( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoBase() throws Exception{
		unidad = new Escudo(new Capa(new Soldado(POS1)));
		Unidad atacante = new Soldado(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Escudo(new Capa(new Soldado(POS1)));
		Unidad atacante = new Escudo(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Escudo(new Capa(new Soldado(POS1)));
		Unidad atacante = new Punial(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Escudo(new Capa(new Soldado(POS1)));
		Unidad atacante = new Capa(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Soldado(POS1)));
		Unidad atacante = new Escudo( new Punial(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Capa(new Soldado(POS1)));
		Unidad atacante =new Escudo( new Capa(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Soldado(POS1)));
		Unidad atacante = new Punial( new Capa(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
//////
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoBase() throws Exception{
		unidad = new Escudo(new Punial(new Soldado(POS1)));
		Unidad atacante = new Soldado(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Escudo(new Punial(new Soldado(POS1)));
		Unidad atacante = new Escudo(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Escudo(new Punial(new Soldado(POS1)));
		Unidad atacante =new Punial( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Escudo(new Punial(new Soldado(POS1)));
		Unidad atacante =new Capa( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Soldado(POS1)));
		Unidad atacante =new Escudo(new Punial( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Punial(new Soldado(POS1)));
		Unidad atacante =new Escudo(new Capa( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Soldado(POS1)));
		Unidad atacante =new Punial(new Capa( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1 +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	//////
	@Test
	public void conPunialYCapaAtacadoPorSoldadoBase() throws Exception{
		unidad = new Capa(new Punial(new Soldado(POS1)));
		Unidad atacante =new Soldado(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Capa(new Punial(new Soldado(POS1)));
		Unidad atacante = new Escudo(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Capa(new Punial(new Soldado(POS1)));
		Unidad atacante = new Punial(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3;
		valorAtaque = valorAtaque  + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Capa(new Punial(new Soldado(POS1)));
		Unidad atacante = new Capa(new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Capa(new Punial(new Soldado(POS1)));
		Unidad atacante = new Escudo(new Punial(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Capa(new Punial(new Soldado(POS1)));
		Unidad atacante = new Escudo(new Capa(new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Capa(new Punial(new Soldado(POS2)));
		Unidad atacante = new Punial(new Capa(new Soldado(POS1)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoBase() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Soldado(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoConEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Escudo( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoConPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Punial( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoConCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Capa( new Soldado(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*0.1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoConEscudoYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Escudo(new Punial( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoConEscudoYCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Escudo(new Capa( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoConCapaYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Punial(new Capa( new Soldado(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorSoldadoConCapaPunialYEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Soldado(POS1))));
		Unidad atacante = new Escudo(new Punial(new Capa( new Soldado(POS2))));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	///DESPUES ABRIA QUE REPETIR TODO LO MISMO PERO AHORA UN SOLDADO ATACADO POR UN ARQUERO LUEGO POR UN CABALLERO Y LUEGO POR UN LANCERO
}