package Tema5.ejercicioanalisis.ejercicio2;

abstract class Ficha {
	protected int id;
	protected String titulo;
	protected String prestamo;

	public Ficha(int id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	// Métodos accesores
	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getPrestamo() {
		return prestamo;
	}

	// Métodos modificadores
	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// Método abstracto para mostrar información específica
	public abstract void mostrarInfo();
}