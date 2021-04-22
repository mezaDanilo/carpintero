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
	public void testProbarContraseñaCorrecta() {
		Cerradura cerradura = new Cerradura("1");
		String contraseñaUsuario = "1";
		
		assertTrue(cerradura.verSiLaContraseñaIngresadaEsCorrecta(contraseñaUsuario));
		
	}
	
	@Test
	public void testProbarContraseñaIncorrecta() {
		Cerradura cerradura = new Cerradura("1");
		String contraseñaUsuario = "2";
		
		assertFalse(cerradura.verSiLaContraseñaIngresadaEsCorrecta(contraseñaUsuario));
		
	}

	
	
}
