package Tema5.ejercicioanalisis.ejercicio2;

class DVD extends Ficha {
	public enum Tipo {
		PELICULA, DOCUMENTAL, SERIE
	}

	private String director;
	private String año;
	private Tipo tipo;

	public DVD(int id, String titulo, String director, String año, Tipo tipo) {
		super(id, titulo);
		this.director = director;
		this.año = año;
		this.tipo = tipo;
		this.prestamo = "5 días";
	}

	// Getters y setters específicos
	public String getDirector() {
		return director;
	}

	public String getAño() {
		return año;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("DVD: " + titulo + ", ID: " + id + ", Director: " + director + ", Año: " + año + ", Tipo: "
				+ tipo + ", Préstamo: " + prestamo);
	}
}
