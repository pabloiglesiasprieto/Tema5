package Tema5.ejercicio4;

/**
 * Clase Television que hereda de Electrodomestico
 */
public class Television extends Electrodomestico {

	/**
	 * Atributo privado de Television que identifica las pulgadas.
	 */
	private int pulgadas = 20;

	/**
	 * Atributo privado de Televisión que identifica si tiene sintonizadorTDT.
	 */
	private boolean sintonizadorTDT = false;

	/**
	 * Constructor de la clase Television.
	 * 
	 * @param precioBase      Precio base de la Television.
	 * @param color           Color de la Television.
	 * @param nivelDeConsumo  Consumo de la Television.
	 * @param peso            Peso de la Television.
	 * @param pulgadas        Pulgadas de la Television.
	 * @param sintonizadorTDT Tiene sintonizador la Television.
	 */
	public Television(double precioBase, String color, char nivelDeConsumo, int peso, int pulgadas,
			String sintonizadorTDT) {

		super(precioBase, color, nivelDeConsumo, peso);

		if (pulgadas >= 30) {
			this.pulgadas = pulgadas;
		}

		if (sintonizadorTDT.equalsIgnoreCase("Sí")) {
			this.sintonizadorTDT = true;
		} else {
			this.sintonizadorTDT = false;
		}
	}

	/**
	 * Constructor de la clase Television.
	 * 
	 * @param precio Precio de la Television.
	 * @param peso   Peso de la Television.
	 */
	public Television(double precio, int peso) {
		super(precio, peso);
	}

	/**
	 * Getter de las pulgadas.
	 * 
	 * @return Pulgadas de la Television.
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * Getter de sintonizadorTDT.
	 * 
	 * @return Devuelve si la television tiene un sintonizador.
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Setter de sintonizador.
	 * 
	 * @param sintonizadorTDT True or False.
	 */
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * @Override Override de PrecioFinal().
	 */
	public void precioFinal() {

		super.precioFinal();

		if (sintonizadorTDT) {
			this.precioBase += 50;
		}
		if (pulgadas > 40) {
			this.precioBase = (this.precioBase * 0.3 + this.precioBase);
		}

	}

}
