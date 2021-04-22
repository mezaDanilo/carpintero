package ar.edu.unlam.cerraduraTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.cerradura.Cerradura;
import ar.edu.unlam.cerradura.Puerta;

public class puertaTest {

	@Test
	public void testCrearPuerta() {
		///Preparacion
		Cerradura c1 = new Cerradura("1");
		Cerradura c2 = new Cerradura("12");
		Cerradura c3 = new Cerradura("123");
		Puerta puerta = new Puerta(c1, c2, c3);
		///Ejecucion
		assertNotNull(puerta);
	}
	
	@Test
	public void testVerQueLaPuertaSeCreeCerrada() {
		///Preparacion
		Cerradura c1 = new Cerradura("1");
		Cerradura c2 = new Cerradura("12");
		Cerradura c3 = new Cerradura("123");
		Puerta puerta = new Puerta(c1, c2, c3);
		///Ejecucion
		assertFalse(puerta.estaLaPuertaAbierta());
	}
	
	
	@Test
	public void testVerQueLaPuertaSeAbraConLasContraseñasCorrectas() {
		///Preparacion
		Cerradura c1 = new Cerradura("1");
		Cerradura c2 = new Cerradura("12");
		Cerradura c3 = new Cerradura("123");
		Puerta puerta = new Puerta(c1, c2, c3);
		
		///
		puerta.intentoDeAbrirLaPuerta("1", "12","123");
		
		///Ejecucion
		assertTrue(puerta.estaLaPuertaAbierta());
	}

	@Test
	public void testVerQueLaPuertaNoSeAbraConLasContraseñasIncorrectas() {
		///Preparacion
		Cerradura c1 = new Cerradura("1");
		Cerradura c2 = new Cerradura("12");
		Cerradura c3 = new Cerradura("123");
		Puerta puerta = new Puerta(c1, c2, c3);
		
		///
		puerta.intentoDeAbrirLaPuerta("10", "12","123");
		
		///Ejecucion
		assertFalse(puerta.estaLaPuertaAbierta());
	}
	
	@Test
	public void testCerrarPuerta() {
		///Preparacion
		Cerradura c1 = new Cerradura("1");
		Cerradura c2 = new Cerradura("12");
		Cerradura c3 = new Cerradura("123");
		Puerta puerta = new Puerta(c1, c2, c3);
		
		///
		puerta.cerrarPuerta();
		
		///Ejecucion
		assertFalse(puerta.estaLaPuertaAbierta());		
	}
	
}
