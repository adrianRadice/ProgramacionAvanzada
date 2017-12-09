package personaje;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import item.Capa;
import item.Escudo;
import item.Puñal;

public class CaballeroTest {
	private final double ATAQUE = 50;
	private final double SALUD = 200;
	private final double ENERGIA = 3;
	private final double DEFENSA = 1;

	private Unidad unidad;
	
	@Test
	public void crearNuevoTest(){
		unidad = new Caballero(1);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}
	
	@Test
	public void equiparEscudoTest(){
		unidad = new Caballero(1);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA + DEFENSA * 0.4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparPunialTest(){
		unidad = new Caballero(1);
		unidad = new Puñal(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparCapaTest(){
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(), ATAQUE - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparEscudoCapaTest(){
		unidad = new Caballero(1);
		unidad = new Escudo(unidad);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE - ATAQUE * 0.1 )   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA + DEFENSA * 0.4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaEscudoTest(){
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE - ATAQUE * 0.1 )   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA + DEFENSA * 0.4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparEscudoPunialTest(){
		unidad = new Caballero(1);
		unidad = new Escudo(unidad);
		unidad = new Puñal(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa() , (DEFENSA + DEFENSA * 0.4) - 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparPunialEscudoTest(){
		unidad = new Caballero(1);
		unidad = new Puñal(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa() , (DEFENSA + DEFENSA * 0.4) - 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparPunialCapaTest(){
		unidad = new Caballero(1);
		unidad = new Puñal(unidad);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialTest(){
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		unidad = new Puñal(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparEscudoCapaPunialTest(){
		unidad = new Caballero(1);
		unidad = new Escudo(unidad);
		unidad = new Capa(unidad);
		unidad = new Puñal(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA - 3 + DEFENSA*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaEscudoPunialTest(){
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Puñal(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA - 3 + DEFENSA*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialEscudoTest(){
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Puñal(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA - 3 + DEFENSA*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparPunialCapaEscudoTest(){
		unidad = new Caballero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Puñal(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa() , DEFENSA - 3 + DEFENSA*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
}
