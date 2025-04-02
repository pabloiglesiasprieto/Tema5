package Tema5.ejerciciocomparator.ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Importamos el random.
		Random rnd = new Random();

		// Creamos un array de Integers.
		Integer[] tabla = new Integer[20];

		// Recorremos el array con un for.
		for (int i = 0; i < tabla.length; i++) {

			// Le asignamos a las posiciones del array un valor comprendido entre 0 y 100.
			tabla[i] = (Integer) rnd.nextInt(0, 101);
		}
		// Ordenamos el array.
		Arrays.sort(tabla, new CompararNumeros());

		// Imprimimos el array.
		System.out.println(Arrays.toString(tabla));
	}

}
