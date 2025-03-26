package Tema5.ejerciciointerfaces.ejercicio3;

public class Main {
	public static void main(String[] args) {

		// Creamos los objetos.
		Gato g1 = new Gato("Misifú", "Café", "Negro", 10);
		Perro p1 = new Perro("Juan", "Yorkshire", "Negro", 10);

		p1.comer();
		p1.dormir();
		System.out.println(p1.hacerCaso() ? "Hizo caso" : "No hizo caso");

	}
}
