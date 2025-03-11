package Tema5.ejercicio3;

/**
 * Clase Producto
 */
public class Producto {

	/**
	 * Atributo privado que identifica el nombre.
	 */
	private String nombre;

	/**
	 * Atributo privado que identifica el precio.
	 */
	private int precio;

	/**
	 * Constructor de la clase Producto.
	 * 
	 * @param nombre Nombre del producto.
	 * @param precio Precio del producto.
	 */
	public Producto(String nombre, int precio) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	/**
	 * Getter de nombre.
	 * 
	 * @return Devuelve el nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter de nombre.
	 * 
	 * @param nombre Nombre del producto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter de precio.
	 * 
	 * @return Precio del produto.
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Setter del precio.
	 * 
	 * @param precio Precio del producto.
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Override de método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += "Nombre: " + nombre + "\nPrecio: " + precio + "\n";
		return cadena;
	}

}
