package Tema5.ejerciciointerfaces.ejercicio2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// Creamos el array.

		// Creamos los futbolistas.
		Futbolista furbolista1 = new Futbolista(10, "Pedro", 13, 100);
		Futbolista furbolista2 = new Futbolista(1, "Juan", 20, 22);
		Futbolista furbolista3 = new Futbolista(109, "Teresa", 10, 4);
		Futbolista furbolista4 = new Futbolista(3, "Chaparrita", 3, 10);
		Futbolista furbolista5 = new Futbolista(90, "Julian", 10, 3);

		// Los añadimos al array
		Futbolista[] lista = { furbolista1, furbolista2, furbolista3, furbolista4, furbolista5 };

		// Recorremos el array e imprimimos.
		for (Futbolista furbo : lista) {

			// Imprimimos el furbolista.
			System.out.println(furbo);
		}

		// Linea divisora.
		System.out.println("---------------------------------------------------------------------------------------");

		// Ordenamos el array.
		Arrays.sort(lista);

		// Recorremos el array e imprimimos.
		for (Futbolista furbo : lista) {

			// Imprimimos el furbolista.
			System.out.println(furbo);
		}

	}
}
