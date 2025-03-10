package Tema5.ejercicio1;

/**
 * Clase HoraExacta que hereda de Hora.
 */
public class HoraExacta extends Hora {

	/**
	 * Atributo privado segundos.
	 */
	protected int segundos;

	/**
	 * Constructor de hora, minuto, segundos.
	 * 
	 * @param hora     Hora de la hora.
	 * @param minuto   Minuto de la hora.
	 * @param segundos Segundos de la hora.
	 */
	public HoraExacta(int hora, int minuto, int segundos) {

		super(hora, minuto);
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}

	}

	/**
	 * Setter de segundo.
	 * 
	 * @param segundo Nuevo segundo.
	 * @return
	 */
	public boolean setSegundo(int segundo) {
		boolean cambiado = false;

		if (segundo >= 0 && segundo <= 59) {
			this.segundos = segundo;
			cambiado = true;
		}
		return cambiado;
	}

	public void inc() {
		
	}

}
