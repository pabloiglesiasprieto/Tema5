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
	 * Compara objetos y devuelve cual es mayor o menor que otro.
	 */
	@Override
	public int compareTo(Socio o) {
		return 0;
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
