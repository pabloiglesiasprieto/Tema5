package Tema5.ejercicio2;

/**
 * Clase Empleado
 */
public class Empleado {
	/**
	 * Atributo privado que identifica el nombre de la clase Empleado.
	 */
	private String nombre;

	/**
	 * Constructor de la clase Empleado.
	 * 
	 * @param nombre Nombre del empleado.
	 */
	public Empleado(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

	}

	/**
	 * Getter de nombre del Empleado.
	 * 
	 * @return Devuelve el nombre del Empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre del Empleado.
	 * 
	 * @param nombre Nuevo nombre del empleado.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Override del método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += "Empleado " + nombre;
		return cadena;
	}

}
