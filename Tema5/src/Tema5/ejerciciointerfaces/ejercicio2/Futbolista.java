package Tema5.ejerciciointerfaces.ejercicio2;

public class Futbolista implements Comparable<Futbolista> {

	/**
	 * Atributo privado que indicará el número de camiseta.
	 */
	private int numeroCamiseta;

	/**
	 * Atributo privado que identificará el nombre del futbolista.
	 */
	private String nombre;

	/**
	 * Atributo privado que identificará la edad del futbolista.
	 */
	private int edad;

	/**
	 * Atributo privado que identificará la cantidad de goles del futbolista.
	 */
	private int numeroGoles;

	/**
	 * Constructor de clase Futbolista.
	 * 
	 * @param numeroCamiseta Atributo privado que indicará el número de camiseta.
	 * @param nombre         Atributo privado que identificará el nombre del
	 *                       futbolista.
	 * @param edad           Atributo privado que identificará la edad del
	 *                       futbolista.
	 * @param numeroGoles    Atributo privado que identificará la cantidad de goles
	 *                       del futbolista.
	 */
	public Futbolista(int numeroCamiseta, String nombre, int edad, int numeroGoles) {

		this.numeroCamiseta = numeroCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numeroGoles = numeroGoles;

	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getNumeroGoles() {
		return numeroGoles;
	}

	/**
	 * 
	 * Método toString de Futbolista @Override
	 */
	public String toString() {

		String cadena = "";
		cadena += "Número camiseta: " + this.numeroCamiseta + "\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Edad: " + this.edad + "\n";
		cadena += "Número goles: " + this.numeroGoles + "\n";

		return cadena;

	}

	/**
	 * @Override Método equals de clase Futbolista.
	 */
	public boolean equals(Object o) {

		Futbolista f1 = (Futbolista) o;
		return (f1.numeroCamiseta == this.numeroCamiseta);

	}

	/**
	 * 
	 * @Override Método compareto de clase Futbolista.
	 */
	public int compareTo(Futbolista o) {

		int comparable;
		if (this.numeroCamiseta > o.numeroCamiseta) {
			comparable = 1;
		} else if (this.numeroCamiseta < o.numeroCamiseta) {
			comparable = -1;
		} else {
			comparable = o.nombre.compareTo(this.nombre);
		}

		return comparable;
	}

}
