package Tema5.ejercicio5;

/**
 * Clasea Rectangulo que hereda de Poligono.
 */
public class Rectangulo extends Poligono {
	/**
	 * Atributo privado que identificará el lado1.
	 */
	private double lado1 = 1;

	/**
	 * Atributo privado que identificará el lado2.
	 */
	private double lado2 = 1;

	/**
	 * Constructor vacío.
	 */
	public Rectangulo() {
		super(4);
	}

	/**
	 * Constructor de Rectangulo.
	 * 
	 * @param lado1 Primer lado del rectangulo.
	 * @param lado2 Segundo lado del rectangulo.
	 */
	public Rectangulo(double lado1, double lado2) {

		super(4);

		if (lado1 > 0 && lado2 > 0) {
			this.lado1 = lado1;
			this.lado2 = lado2;
		}
	}

	/**
	 * Getter de número de lados.
	 * 
	 * @return Devuelve el número de lados de la figura.
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Método que devuelve una cadena.
	 */
	public String toString() {
		String cadena = "";

		cadena += "Figura: Rectangulo " + super.toString();

		return cadena;

	}

	/**
	 * Método que devuelve el area del poligono.
	 */
	public double area() {
		return lado1 * lado2;
	}

}
