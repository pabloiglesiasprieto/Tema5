package Tema5.ejercicio5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Importamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable que guardará la eleccion del usuario.
		int eleccion;

		// Declaramos la variable lado1.
		double lado1;

		// Declaramos la variable lado2.
		double lado2;

		// Declaramos la variable lado3.
		double lado3;

		// Imprimimos el menú.
		menu();

		// Preguntamos la acción que quiera realizar.
		System.out.println("Que acción quiere realizar.");

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Creamos un bucle.
		while (eleccion != 4) {

			// Creamos un switch.
			switch (eleccion) {

			// Primer case
			case 1 -> {

				// Preguntamos la longitud de los 3 lados.
				System.out.println("Introduce la longitud del primer lado");

				// Leemos entrada de teclado.
				lado1 = sc.nextInt();

				// Preguntamos la longitud de los 3 lados.
				System.out.println("Introduce la longitud del segundo lado");

				// Leemos entrada de teclado.
				lado2 = sc.nextInt();

				// Preguntamos la longitud de los 3 lados.
				System.out.println("Introduce la longitud del tercer lado");

				// Leemos entrada de teclado.
				lado3 = sc.nextInt();

				// Creamos el objeto.
				Poligono t1 = new Triangulo(lado1, lado2, lado3);

				// Añadimos el objeto a la lista.
				PoligonoCRUD.añadirPoligono(t1);
			}
			// Segundo case.
			case 2 -> {

				// Preguntamos la longitud de los 2 lados.
				System.out.println("Introduce la longitud del primer lado");

				// Leemos entrada de teclado.
				lado1 = sc.nextInt();

				// Preguntamos la longitud de los 2 lados.
				System.out.println("Introduce la longitud del segundo lado");

				// Leemos entrada de teclado.
				lado2 = sc.nextInt();
			}
			// Tercer case.
			case 3 -> {

				// Llamamos a la función que imprime los poligonos.
				PoligonoCRUD.mostrarPoligonos();
			}
			}
			// Imprimimos el menú.
			menu();

			// Preguntamos la acción que quiera realizar.
			System.out.println("Que acción quiere realizar.");

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();
		}
	}

	// Función que imprime el menú.
	static void menu() {
		System.out.println(
				"1. Introducir Triangulo.\n" + "2. Introducir Rectángulo.\n" + "3. Mostrar Polígonos\n" + "4. Salir");

	}
}
