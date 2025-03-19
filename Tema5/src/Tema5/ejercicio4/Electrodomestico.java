package Tema5.ejercicio4;

import java.util.ArrayList;

/**
 * Clase Electrodomestico.
 */
public class Electrodomestico {

	/**
	 * Atributo que identifica el precio base.
	 */
	protected double precioBase = 100;

	/**
	 * Atributo que identifica el color.
	 */
	protected colores color = colores.BLANCO;

	/**
	 * Atributo que identifica el consumoEnergetico.
	 */
	protected consumoEnergetico nivelDeConsumo = consumoEnergetico.F;

	/**
	 * Atributo que identifica el peso.
	 */
	protected int peso;

	/**
	 * Enumerador para el consumo energético.
	 */
	enum consumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * Enumerador para los colores.
	 */
	enum colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Constructor de la clase Electrodomestico.
	 * 
	 * @param precioBase     Precio base del electrodomestico.
	 * @param color          Color de electrodomestico.
	 * @param nivelDeConsumo Nivel de consumo del electrodomestico.
	 * @param peso           Peso de electrodomestico.
	 */
	public Electrodomestico(double precioBase, String color, char nivelDeConsumo, int peso) {

		if (precioBase >= 0) {
			this.precioBase = precioBase;

		}
		comprobarColor(color);

		comprobarConsumoElectrico(nivelDeConsumo);

		if (peso >= 1) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor para la clase Electrodomestico.
	 * 
	 * @param precio Precio del electrodomestico.
	 * @param peso   Peso del electrodomestico.
	 */
	public Electrodomestico(double precio, int peso) {
		if (precio >= 0) {
			this.precioBase = precio;
		}

		if (peso >= 1) {
			this.peso = peso;
		}
	}

	/**
	 * Getter del precio.
	 * 
	 * @return Devuelve el precio del electrodomestico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Setter del precio.
	 * 
	 * @param precioBase Nuevo precio del electrodomestico.
	 */
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * Getter del precio.
	 * 
	 * @return Precio del electrodomestico.
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Setter del peso.
	 * 
	 * @param peso Nuevo peso de electrodomestico.
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Método que comprueba si el color es válido.
	 * 
	 * @param color Color a asignar al electrodomestico.
	 */
	public void comprobarColor(String color) {
		switch (color.toUpperCase()) {
		case "AZUL" -> this.color = colores.AZUL;
		case "BLANCO" -> this.color = colores.BLANCO;
		case "NEGRO" -> this.color = colores.NEGRO;
		case "ROJO" -> this.color = colores.ROJO;
		case "GRIS" -> this.color = colores.GRIS;
		default -> this.color = colores.BLANCO;
		}
	}

	/**
	 * Método que comprueba si el consumo electrico es correcto.
	 * 
	 * @param nivelDeConsumo Nivel de consumo de electrodomestico.
	 */
	public void comprobarConsumoElectrico(char nivelDeConsumo) {
		switch (nivelDeConsumo) {
		case 'A' -> this.nivelDeConsumo = consumoEnergetico.A;
		case 'B' -> this.nivelDeConsumo = consumoEnergetico.B;
		case 'C' -> this.nivelDeConsumo = consumoEnergetico.C;
		case 'D' -> this.nivelDeConsumo = consumoEnergetico.D;
		case 'E' -> this.nivelDeConsumo = consumoEnergetico.E;
		case 'F' -> this.nivelDeConsumo = consumoEnergetico.F;
		default -> this.nivelDeConsumo = consumoEnergetico.F;
		}
	}

	/**
	 * Función que calculará el precioFinal.
	 */
	public void precioFinal() {

		switch (this.nivelDeConsumo) {

		case A -> this.precioBase += 100;
		case B -> this.precioBase += 80;
		case C -> this.precioBase += 60;
		case D -> this.precioBase += 50;
		case E -> this.precioBase += 30;
		case F -> this.precioBase += 10;

		}

		if (peso >= 0 && peso <= 19) {
			this.precioBase += 10;
		}

		if (peso >= 20 && peso <= 49) {
			this.precioBase += 50;
		}

		if (peso >= 50 && peso <= 79) {
			this.precioBase += 80;
		}

		if (peso >= 80) {
			this.precioBase += 100;
		}
	}

}
