//Puerta
//	+Boolean EstadoPuerta
//	+Cerradura c1
//	+Cerradura c2
//	+Cerradura c3
//
//	*estaLaPuertaAbierta
//	*abrirPuerta(c1,c2,c3)
//	*cerrarPuerta(bloquea la puerta)
	
package ar.edu.unlam.cerradura;

public class Puerta {
	private Cerradura c1,c2,c3;
	private Boolean estadoPuerta;
	
	public Puerta(Cerradura c1, Cerradura c2, Cerradura c3) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.estadoPuerta = false;
	}
	
	public Boolean estaLaPuertaAbierta() {
		return this.estadoPuerta;
	}
	
	public void abrirPuerta(Cerradura c1, Cerradura c2, Cerradura c3) {
		this.estadoPuerta = true;
	}
	
	public void cerrarPuerta() {
		this.estadoPuerta = false;
		c1.cerrarCerradura();
		c2.cerrarCerradura();
		c3.cerrarCerradura();
	}

	
}
