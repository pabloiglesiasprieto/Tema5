package Tema5.ejercicio2;

/**
 * Clase Oficial que hereda de Operario.
 */
public class Oficial extends Operario {

	/**
	 * Constructor de la clase Oficial.
	 * 
	 * @param nombre Nombre del Oficial.
	 */
	public Oficial(String nombre) {
		super(nombre);
	}
	
	/**
	 * Override de método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += super.toString() + " -> Oficial";
		return cadena;
	}
	

}
