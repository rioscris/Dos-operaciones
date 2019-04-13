package Pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import codegolf.Operacion;

public class OperacionesPruebas {

	private Operacion o;
	
	@Before
	public void setUp() {
		o = new Operacion();
	}
	
	/*
	 * 1: 0+1 = 1
	 */
	@Test
	public void queSeOperaUnaSolaVez() {
		assertEquals(o.operaciones(1), 1);
	}
	
	/*
	 * 1: 0+1 = 1
	 * 2: 1*2 = 2
	 * 3: 2*2 = 4
	 * 4: 4+1 = 5
	 */
	@Test
	public void queConsideraNumerosImpares() {
		assertEquals(o.operaciones(5), 4);
	}
	
	
	/*
	 * 1: 0+1 = 1
	 * 2: 1*2 = 2
	 * 3: 2*2 = 4
	 * 4: 4*2 = 8
	 * 5: 8*2 = 16
	 * 6: 16+1 = 17
	 * 7: 17+1 = 18
	 * 8: 18+1 = 19
	 * 9: 19+1 = 20
	 */
	@Test
	public void queConsideraNumerosPares() {
		assertEquals(o.operaciones(20), 9);
	}
}
