package Tema5.ejercicio5;

/**
 * Clase Triangulo
 */
public class Triangulo extends Poligono {

	/**
	 * Primer lado.
	 */
	private double lado1 = 1;

	/**
	 * Segundo lado.
	 */
	private double lado2 = 1;

	/**
	 * Tercer lado.
	 */
	private double lado3 = 1;

	/**
	 * Constructor vacío.
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor de la clase Triangulo.
	 * 
	 * @param lado1 Primer lado.
	 * @param lado2 Segundo lado.
	 * @param lado3 Tercer lado.
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);

		if (lado1 > 0 && lado2 > 0 && lado3 > 0) {

			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;

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
	 * @Override Método que devuelve una cadena.
	 */
	public String toString() {
		String cadena = "";

		cadena += "Figura: Triangulo " + super.toString();

		return cadena;
	}

	/**
	 * @Override Método que devuelve el area del poligono.
	 */
	public double area() {
		double area;
		double semiperimetro = (lado1 + lado2 + lado3) / 2;
		area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

		return area;
	}

}
