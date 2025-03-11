package Tema5.ejercicio2;

/**
 * Clase Tecnico que hereda de Operario.
 */
public class Tecnico extends Operario {

	/**
	 * Constructor de la clase Tecnico.
	 * 
	 * @param nombre Nombre del Tecnico.
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Override de método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += super.toString() + " -> Tecnico";
		return cadena;

	}
}
