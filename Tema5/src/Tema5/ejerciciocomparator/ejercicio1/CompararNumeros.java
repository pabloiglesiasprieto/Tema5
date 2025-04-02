package Tema5.ejerciciocomparator.ejercicio1;

import java.util.Comparator;

public class CompararNumeros implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int posicion = o1 - o2;
		return posicion;
	}

}
