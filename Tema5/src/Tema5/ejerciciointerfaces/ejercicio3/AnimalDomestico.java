package Tema5.ejerciciointerfaces.ejercicio3;

public abstract class AnimalDomestico implements Animal {

	/**
	 * Atributo privado que identificará el nombre del animal doméstico.
	 */
	private String nombre;

	/**
	 * Atributo privado que identificará la raza del animal doméstico.
	 */
	private String raza;

	/**
	 * Atributo privado que identificará el color del animal doméstico.
	 */
	private String color;

	/**
	 * Atributo privado que identificará el peso del animal doméstico.
	 */
	private int peso;

	public AnimalDomestico(String nombre, String raza, String color, int peso) {

		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.peso = peso;
	}

	/**
	 * @Override Método que identifica la acción de comer de un animal.
	 */
	public void comer() {

		System.out.println("El animal está comiendo...");
	}

	/**
	 * @Override Método que identifica la acción de dormir de un animal.
	 */
	public void dormir() {

		System.out.println("El animal está durmiendo...");

	}

	/**
	 * Método que identifica la acción de vacunar de un animal.
	 */
	public void vacunar() {

		System.out.println("El animal ha sido vacunado...");
	}

	/**
	 * @Override Método abstracto que identifica la acción de hacer ruido de un
	 *           animal.
	 */
	public abstract void hacerRuido();

	/**
	 * Método abstracto que identifica la acción de hacer caso de un animal.
	 */
	public abstract boolean hacerCaso();
}
