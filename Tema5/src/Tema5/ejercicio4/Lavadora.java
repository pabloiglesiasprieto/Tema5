package Tema5.ejercicio4;

/**
 * Clase Carga que hereda de Electrodomestico.
 */
public class Lavadora extends Electrodomestico {

	/**
	 * Atributo privado de Carga que identifica las unidades.
	 */
	private int carga = 5;

	/**
	 * Constructor de la clase Carga.
	 * 
	 * @param precioBase     Precio base de la carga.
	 * @param color          Color de la carga.
	 * @param nivelDeConsumo Nivel de consumo de la carga.
	 * @param peso           Peso de la carga.
	 * @param carga          Cantidad de unidades.
	 */
	public Lavadora(double precioBase, String color, char nivelDeConsumo, int peso, int carga) {

		super(precioBase, color, nivelDeConsumo, peso);

		if (carga >= 0) {
			this.carga = carga;
		}
	}

	/**
	 * Constructor de la clase Lavadora.
	 * 
	 * @param precio Precio de la lavadora.
	 * @param peso   Peso de la lavadora.
	 */
	public Lavadora(double precio, int peso) {
		super(precio, peso);
	}

	/**
	 * Getter de la carga.
	 * 
	 * @return Peso de la lavadora.
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * @Overrride Override del precio final.
	 */
	public void precioFinal() {

		super.precioFinal();

		if (carga > 30) {
			this.precioBase += 50;
		}
	}

}
