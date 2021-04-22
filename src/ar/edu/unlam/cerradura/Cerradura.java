//Cerradura	
//	+String Contrase�aVerdadera
//	
//	*abrirCerradura
//	*cerrarCerradura

package ar.edu.unlam.cerradura;

public class Cerradura {
	private String contrase�aVerdadera;
	private Boolean estadoCerradura;

	public Cerradura(String contrase�aVerdadera) {
		this.contrase�aVerdadera = contrase�aVerdadera;
		this.estadoCerradura = false;
	}
	
	public Boolean verSiLaContrase�aIngresadaEsCorrecta(String contrase�aIngresada) {
		if(contrase�aVerdadera.equals(contrase�aIngresada)) {
			this.estadoCerradura = true;
			return true;
		}
		
		return false;
	}
	
	public void cerrarCerradura() {
		this.estadoCerradura = false;
	}
	
}
