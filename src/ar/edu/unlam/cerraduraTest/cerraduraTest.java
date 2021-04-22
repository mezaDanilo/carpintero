package ar.edu.unlam.cerraduraTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.cerradura.Cerradura;

public class cerraduraTest {
	@Test
	public void testProbarQueSeCreoBienLaCerradura() {
		Cerradura cerradura = new Cerradura("1");
		
		assertNotNull(cerradura);	
	}
	
	@Test
	public void testProbarQueSeCreoCerradaLaCerradura() {
		Cerradura cerradura = new Cerradura("1");
		
		assertFalse(cerradura.getEstadoCerradura());
	}
	
	@Test
	public void testProbarContrase�aCorrecta() {
		Cerradura cerradura = new Cerradura("1");
		String contrase�aUsuario = "1";
		
		assertTrue(cerradura.verSiLaContrase�aIngresadaEsCorrecta(contrase�aUsuario));
		
	}
	
	@Test
	public void testProbarContrase�aIncorrecta() {
		Cerradura cerradura = new Cerradura("1");
		String contrase�aUsuario = "2";
		
		assertFalse(cerradura.verSiLaContrase�aIngresadaEsCorrecta(contrase�aUsuario));
		
	}

	
	
}
