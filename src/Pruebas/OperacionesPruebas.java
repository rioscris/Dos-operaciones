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
	
	@Test
	public void queSeOperaUnaSolaVez() {
		assertEquals(o.operaciones(1), 1);
	}
	
}
