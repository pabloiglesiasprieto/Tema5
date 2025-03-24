package Tema5.ejerciciointerfaces.ejercicio1;

/**
 * Clase Socio.
 */
public class Socio implements Comparable<Socio> {

	/**
	 * Atributo que identificará al Socio.
	 */
	private int id;

	/**
	 * Atributo que nombrará al Socio.
	 */
	private String nombre;

	/**
	 * Atributo que dará una edad al socio.
	 */
	private int edad;

	/**
	 * Constructor de Socio.
	 */
	public Socio(int id, String nombre, int edad) {

		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 17) {
			this.edad = edad;
		}

	}

	/**
	 * Override compareTo, si el id es mayor, se pondrá primero, si es menor, se
	 * pondrá detras y si son iguales no se añadirá.
	 */
	public int compareTo(Socio o) {
		int comparable;

		if (this.id > o.id) {
			comparable = 1;
		} else if (this.id < o.id) {
			comparable = 0;
		} else {
			comparable = -1;
		}
		return comparable;

	}

	/**
	 * Devuelve una cadena con información del objeto.
	 */
	@Override
	public String toString() {
		String cadena = "";
		cadena += "ID: " + this.id + "\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Edad: " + this.edad + "\n";
		return cadena;
	}

}
