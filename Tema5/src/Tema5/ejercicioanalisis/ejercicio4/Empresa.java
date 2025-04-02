package Tema5.ejercicioanalisis.ejercicio4;

public class Empresa extends Contacto {

	private String website;

	public Empresa(String nombre, String telefono, String website) {
		super(nombre, telefono);
		this.website = website;
	}

	public String getWebsite() {
		return this.website;
	}

	@Override
	public String toString() {
		String cadena;
		cadena = super.toString();
		cadena += this.website;
		return cadena;
	}

}
