package Tema5.ejercicioanalisis.ejercicio2;

class Revista extends Ficha {
	private int numeroRevista;
	private String añoPublicacion;

	public Revista(int id, String titulo, int numeroRevista, String añoPublicacion) {
		super(id, titulo);
		this.numeroRevista = numeroRevista;
		this.añoPublicacion = añoPublicacion;
		this.prestamo = "10 días";
	}

	// Getters y setters específicos
	public int getNumeroRevista() {
		return numeroRevista;
	}

	public String getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}

	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Revista: " + titulo + ", ID: " + id + ", Número: " + numeroRevista + ", Año: "
				+ añoPublicacion + ", Préstamo: " + prestamo);
	}

	@Override
	public int compareTo(Ficha o) {
		int orden = this.id - o.getId();
		if (this.id < o.getId())
			orden = -1;
		if (this.id > o.getId())
			orden = 1;
		orden = 0;
		return orden;
	}
}