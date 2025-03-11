package Tema5.ejercicio3;

/**
 * Clase Perecedero que extiende de Producto.
 */
public class Perecedero extends Producto {

	/**
	 * Atributo privado que indica la cantidad de días a caducar.
	 */
	private int diasACaducar;

	/**
	 * Constructor de la clase Perecedero.
	 * 
	 * @param nombre       Nombre del producto.
	 * @param precio       Precio del producto.
	 * @param diasACaducar Dias a caducar del producto.
	 */
	public Perecedero(String nombre, int precio, int diasACaducar) {
		super(nombre, precio);

		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * @Override Override método toString().
	 */
	public String toString() {
		return super.toString() + "Dias a Caducar: " + diasACaducar + "\n";
	}
}
