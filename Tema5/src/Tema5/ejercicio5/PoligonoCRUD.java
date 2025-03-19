package Tema5.ejercicio5;

import java.util.ArrayList;

/**
 * Clase Poligono CRUD.
 */
public class PoligonoCRUD {

	/**
	 * Lista de poligonos.
	 */
	private static ArrayList<Poligono> listaPoligono = new ArrayList<>();

	/**
	 * Método para añadir un Poligono.
	 */
	public static void añadirPoligono(Poligono p1) {
		listaPoligono.add(p1);

	}

	/**
	 * Método para imprimir todos los Poligonos.
	 */
	public static void mostrarPoligonos() {

		for (Poligono p1 : listaPoligono) {

			System.out.println(p1);

		}

	}

}
