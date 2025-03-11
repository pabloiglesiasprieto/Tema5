package Tema5.ejercicio2;

/**
 * Clase Directivo que hereda de Empleado.
 */
public class Directivo extends Empleado {

	/**
	 * Constructor de la clase Directivo.
	 * 
	 * @param nombre Nombre del directivo.
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Override del método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += super.toString() + " -> Directivo";
		return cadena;
	}

}
