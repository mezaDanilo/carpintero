//Cerradura	
//	+String ContraseñaVerdadera
//	
//	*abrirCerradura
//	*cerrarCerradura

package ar.edu.unlam.cerradura;

public class Cerradura {
	private String contraseñaVerdadera;
	private Boolean estadoCerradura;

	public Cerradura(String contraseñaVerdadera) {
		this.contraseñaVerdadera = contraseñaVerdadera;
		this.estadoCerradura = false;
	}
	
	public Boolean verSiLaContraseñaIngresadaEsCorrecta(String contraseñaIngresada) {
		if(contraseñaVerdadera.equals(contraseñaIngresada)) {
			this.estadoCerradura = true;
			return true;
		}
		
		return false;
	}
	
	public void cerrarCerradura() {
		this.estadoCerradura = false;
	}
	
}
