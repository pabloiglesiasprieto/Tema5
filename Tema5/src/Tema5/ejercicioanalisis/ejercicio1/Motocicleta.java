package Tema5.ejercicioanalisis.ejercicio1;

public class Motocicleta extends Vehiculo {

	/**
	 * Atributo privado para saber la cilindrada.
	 */
	private int cilindrada;

	public Motocicleta(String marca, String color, String modelo, String matricula, int cilindrada) {
		super(marca, color, modelo, matricula);

		if (cilindrada > 100) {
			this.cilindrada = cilindrada;
		}
	}

	public boolean requiereCarnet() {
		return this.cilindrada >= 125;
	}
}
