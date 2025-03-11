package Tema5.ejercicio2;

/**
 * Clase Operario que hereda de Empleado.
 */
public class Operario extends Empleado {

	/**
	 * Constructor de clase Operario
	 * 
	 * @param nombre Nombre del Operario.
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Override del método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += super.toString() + " -> Operario";
		return cadena;
	}

}
