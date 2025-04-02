package Tema5.ejercicioanalisis.ejercicio4;

import java.util.Objects;

public class Contacto {

	private String nombre;
	private String telefono;

	public Contacto(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public Contacto(String nombre, String telefono) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (telefono.length() == 9 && !telefono.contains("-")) {
			this.telefono = telefono;
		}
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		Contacto other = (Contacto) obj;
		return this.nombre.equals(other.nombre);
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += "Nombre: " + this.nombre + " - ";
		cadena += "Telefono: " + this.telefono + " - ";
		return cadena;
	}

}
