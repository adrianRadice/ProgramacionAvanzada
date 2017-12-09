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
public class ArqueroTest {
	private final double ATAQUE = 5;
	private final double SALUD = 50;
	private final double ENERGIA = 20;
	private final double DEFENSA = 0;
	private final double ENERGIA_CONSUMIDA = 1;
	private final int POS1=0;
	private final int POS2=3;

	private Unidad unidad;
	


	@Test
	public void crearNuevoTest() throws Exception{
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
		unidad = new Punial(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 10* .4- 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparPunialCapaTest() throws Exception{
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		Unidad u1 = new Arquero(0);
		Unidad u2 = new Soldado(6);
		assertFalse(u1.puedoAtacar(u2));
		u1 = new Arquero(0);
		u2 = new Arquero(1);
		assertFalse(u1.puedoAtacar(u2));
		u1 = new Arquero(1);
		u2 = new Arquero(1);
		assertFalse(u1.puedoAtacar(u2));
	}
	
	@Test
	public void distanciaValidaParaCombate() throws Exception{
		Unidad u1 = new Arquero(5);
		Unidad u2 = new Soldado(7);

		for(int i=0 ; i<4; i++){
			assertTrue(u1.puedoAtacar(u2));
			u2.avanzar();
		}
	}
	
	@Test
	public void puedeRestaurarEnergia() throws Exception{
		unidad = new Arquero(1);
		unidad.atacar(new Soldado(3));
		assertTrue(unidad.puedeRestauraEnergia());
	}

	@Test
	public void agotarEnergia() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Soldado(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.getEnergia(), 0, 0.1);
	}
	
	@Test
	public void restaurarEnergia() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Soldado(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
		}
		unidad.restaurarEnergia();
		assertEquals(unidad.getEnergia(), 6, 0.1);
		
	}
	

	@Test
	public void noPoderAtacarMuertos() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(unidad.puedoAtacar(victima));
	
	}
	
	@Test
	public void noAtacarMuertos() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
	
	}

	@Test
	public void noSeAutoAtaca() throws Exception{

		unidad = new Arquero(1);
		assertFalse(unidad.puedoAtacar(unidad));
	}

	@Test
	public void noPoderAtacarEstandoMuerto() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(victima.puedoAtacar(unidad));
	}

	@Test
	public void noAtacarEstandoMuerto() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(victima.atacar(unidad), 0, 0.1);
	
		
	}
	
	@Test
	public void noPoderAtacarAgotado() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertFalse(unidad.puedoAtacar(victima));
	}	
	
	@Test
	public void noAtacarAgotado() throws Exception{
		unidad = new Arquero(1);
		Unidad victima = new Soldado(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
		
	}
	

	@Test
	public void noPermiteMutipleEscudo() throws Exception{
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
		unidad = new Arquero(1);
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
	public void baseAtacadoPorArqueroBase() throws Exception{
		unidad = new Arquero(POS1);
		Unidad atacante = new Arquero(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Arquero(POS1);
		Unidad atacante = new Arquero(POS2);
		atacante = new Escudo(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Arquero(POS1);
		Unidad atacante = new Arquero(POS2);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE +3));
	}
	@Test
	public void baseAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Arquero(POS1);
		Unidad atacante = new Arquero(POS2);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Arquero(POS1);
		Unidad atacante = new Arquero(POS2);
		atacante = new Escudo(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE + 3));
	}
	@Test
	public void baseAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Arquero(POS1);
		Unidad atacante = new Arquero(POS2);
		atacante = new Escudo(atacante);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Arquero(POS1);
		Unidad atacante = new Arquero(POS2);
		atacante = new Capa(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*0.1 + 3));
	}
	
	//////
	@Test
	public void conEscudoAtacadoPorArqueroBase() throws Exception{
		unidad = new Escudo(new Arquero(POS1));
		Unidad atacante = new Arquero(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Escudo(new Arquero(POS1));
		Unidad atacante =  new Escudo(new Arquero(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Escudo(new Arquero(POS1));
		Unidad atacante =  new Punial(new Arquero(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Escudo(new Arquero(POS1));
		Unidad atacante =  new Capa(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Arquero(POS1));
		Unidad atacante =  new Escudo(new Punial(new Arquero(POS2)));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Arquero(POS1));
		Unidad atacante =  new Escudo(new Capa(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Arquero(POS1));
		Unidad atacante =  new Capa(new Punial(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque+=3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conPunialAtacadoPorArqueroBase() throws Exception{
		unidad = new Punial(new Arquero(POS1));
		Unidad atacante =  new Arquero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Punial(new Arquero(POS1));
		Unidad atacante =  new Escudo(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Punial(new Arquero(POS1));
		Unidad atacante =  new Punial(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Punial(new Arquero(POS1));
		Unidad atacante =  new Capa(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Punial(new Arquero(POS1));
		Unidad atacante =  new Escudo( new Punial(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3+3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Punial(new Arquero(POS1));
		Unidad atacante =  new Capa( new Escudo(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Punial(new Arquero(0));
		Unidad atacante =  new Capa( new Punial(new Arquero(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3+3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conCapaAtacadoPorArqueroBase() throws Exception{
		unidad = new Capa(new Arquero(POS1));
		Unidad atacante =  new Arquero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Capa(new Arquero(POS1));
		Unidad atacante = new Escudo( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Capa(new Arquero(POS1));
		Unidad atacante = new Punial( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Capa(new Arquero(POS1));
		Unidad atacante = new Capa( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Arquero(POS1));
		Unidad atacante = new Escudo(new Punial( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Arquero(POS1));
		Unidad atacante = new Escudo(new Capa( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Capa(new Arquero(POS1));
		Unidad atacante = new Punial(new Capa( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conCapaYEscudoAtacadoPorArqueroBase() throws Exception{
		unidad = new Escudo(new Capa(new Arquero(POS1)));
		Unidad atacante = new Arquero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Escudo(new Capa(new Arquero(POS1)));
		Unidad atacante = new Escudo(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Escudo(new Capa(new Arquero(POS1)));
		Unidad atacante = new Punial(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Escudo(new Capa(new Arquero(POS1)));
		Unidad atacante = new Capa(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Arquero(POS1)));
		Unidad atacante = new Escudo( new Punial(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Capa(new Arquero(POS1)));
		Unidad atacante =new Escudo( new Capa(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Arquero(POS1)));
		Unidad atacante = new Punial( new Capa(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
//////
	@Test
	public void conPunialYEscudoAtacadoPorArqueroBase() throws Exception{
		unidad = new Escudo(new Punial(new Arquero(POS1)));
		Unidad atacante = new Arquero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Escudo(new Punial(new Arquero(POS1)));
		Unidad atacante = new Escudo(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Escudo(new Punial(new Arquero(POS1)));
		Unidad atacante =new Punial( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Escudo(new Punial(new Arquero(POS1)));
		Unidad atacante =new Capa( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Arquero(POS1)));
		Unidad atacante =new Escudo(new Punial( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Punial(new Arquero(POS1)));
		Unidad atacante =new Escudo(new Capa( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Arquero(POS1)));
		Unidad atacante =new Punial(new Capa( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1 +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	//////
	@Test
	public void conPunialYCapaAtacadoPorArqueroBase() throws Exception{
		unidad = new Capa(new Punial(new Arquero(POS1)));
		Unidad atacante =new Arquero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Capa(new Punial(new Arquero(POS1)));
		Unidad atacante = new Escudo(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Capa(new Punial(new Arquero(POS1)));
		Unidad atacante = new Punial(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3;
		valorAtaque = valorAtaque  + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Capa(new Punial(new Arquero(POS1)));
		Unidad atacante = new Capa(new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Punial(new Arquero(POS1)));
		Unidad atacante = new Escudo(new Punial(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Punial(new Arquero(POS1)));
		Unidad atacante = new Escudo(new Capa(new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Capa(new Punial(new Arquero(POS2)));
		Unidad atacante = new Punial(new Capa(new Arquero(POS1)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroBase() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Arquero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroConEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Escudo( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroConPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Punial( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroConCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Capa( new Arquero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*0.1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Escudo(new Punial( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Escudo(new Capa( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroConCapaYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Punial(new Capa( new Arquero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorArqueroConCapaPunialYEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Arquero(POS1))));
		Unidad atacante = new Escudo(new Punial(new Capa( new Arquero(POS2))));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	///DESPUES ABRIA QUE REPETIR TODO LO MISMO PERO AHORA UN Arquero ATACADO POR UN Soldado LUEGO POR UN CABALLERO Y LUEGO POR UN LANCERO
	
}
