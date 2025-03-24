package Tema5.ejerciciointerfaces.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Importamos Scanner.
		Scanner sc = new Scanner(System.in);

		// Atributo id para Socio.
		int id;

		// Atributo nombre para Socio.
		String nombre;

		// Atributo edad para Socio.
		int edad;

		// Eleccion de usuario.
		int eleccion;

		// Imprimimos el menú.
		imprimirMenu();

		// Preguntamos la acción.
		System.out.println("Que acción quieres realizar.");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos Scanner.
		sc.nextLine();

		// Hacemos un while.
		while (eleccion != 0) {

			switch (eleccion) {

			case 1 -> {
				// Pedimos los datos del socio.
				System.out.println("Introduce el id");

				// Leemos entrada de teclado.
				id = sc.nextInt();

				// Limpiamos buffer.
				sc.nextLine();

				// Pedimos datos.
				System.out.println("Introduce el nombre");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Pedimos datos.
				System.out.println("Introduce la edad.");

				// Leemos entrada de teclado.
				edad = sc.nextInt();
			}
			case 2 -> {

			}

			}
		}
	}

	static void imprimirMenu() {

		System.out.println("1.Añadir Socio.\n2.Ordenar lista\n0.Imprimir Socios.");
	}

}
