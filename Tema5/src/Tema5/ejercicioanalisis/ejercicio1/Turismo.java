package Tema5.ejercicioanalisis.ejercicio1;

public class Turismo extends Vehiculo {
	/**
	 * Enumerado del uso.
	 */
	enum Uso {
		PROFESIONAL, PARTICULAR
	}

	/**
	 * Atributo privado para el número de plazas.
	 */
	private int numeroPlazas;

	/**
	 * Tipo de uso del vehiculo.
	 */
	private Uso tipoDeUso;

	/**
	 * Constructor de camión.
	 * 
	 * @param marca     Marca del camion.
	 * @param color     Color del camion.
	 * @param modelo    Modelo del camion.
	 * @param matricula Matricula del camion.
	 */
	public Turismo(String marca, String color, String modelo, String matricula, int numeroPlazas, String uso) {
		super(marca, color, modelo, matricula);

		if (this.numeroPlazas > 2) {
			this.numeroPlazas = numeroPlazas;
		}
		this.tipoDeUso = Uso.valueOf(uso);
	}

	/**
	 * Getter del número de plazas.
	 * 
	 * @return Devuelve el número de plazas.
	 */
	public int getNumeroPlazas() {
		return this.numeroPlazas;
	}

	/**
	 * Getter del tipo de uso.
	 * 
	 * @return Tipo de uso del vehiculo.
	 */
	public String getUso() {
		return String.valueOf(this.tipoDeUso);
	}

}
