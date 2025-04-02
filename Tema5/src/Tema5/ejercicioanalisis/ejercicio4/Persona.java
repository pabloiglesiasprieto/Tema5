package Tema5.ejercicioanalisis.ejercicio4;

public class Persona extends Contacto {

	private String cumpleaños;

	public Persona(String nombre, String telefono, String cumpleaños) {
		super(nombre, telefono);
		this.cumpleaños = cumpleaños;
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += this.cumpleaños;

		return cadena;
	}

}
