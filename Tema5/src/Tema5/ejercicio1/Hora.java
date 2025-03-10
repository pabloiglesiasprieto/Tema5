package Tema5.ejercicio1;

/**
 * Clase hora
 */
public class Hora {

	/**
	 * Atributo privado que identifica la hora.
	 */
	protected int hora;

	/**
	 * Atributo privado que identifica el minuto.
	 */
	protected int minuto;

	/**
	 * Constructor de clase Hora
	 * 
	 * @param hora   Hora
	 * @param minuto Minuto
	 */
	public Hora(int hora, int minuto) {

		if (hora >= 0 && hora <= 24) {
			this.hora = hora;
		}

		if (minuto >= 0 && minuto <= 60) {
			this.minuto = minuto;
		}

	}

	/**
	 * Método que cambia el minuto.
	 * 
	 * @param minuto Nuevo minuto.
	 * @return Devuelve un booleano indicando si se ha cambiado el minuto o no.
	 */
	public boolean setMinutos(int minuto) {
		boolean cambiado = false;

		if (minuto >= 0 && minuto <= 60) {
			this.minuto = minuto;
			cambiado = true;
		}
		return cambiado;

	}

	/**
	 * Método que cambia la hora.
	 * 
	 * @param hora Nueva hora.
	 * @return Devuelve un booleano indicando si se ha cambiado el minuto o no.
	 */
	public boolean setHora(int hora) {
		boolean cambiado = false;

		if (minuto >= 0 && hora <= 23) {
			this.hora = hora;
			cambiado = true;
		}
		return cambiado;

	}

	/**
	 * Método que incrementa en 1 el minuto.
	 */
	public void inc() {

		this.minuto++;
		if (this.minuto >= 60) {
			this.minuto = 0;
			this.hora++;
		}
	}

	/**
	 * Override método toString().
	 */
	public String toString() {
		String cadena = "";

		cadena += this.hora + " horas, " + this.minuto + " minutos";

		return cadena;
	}
}
