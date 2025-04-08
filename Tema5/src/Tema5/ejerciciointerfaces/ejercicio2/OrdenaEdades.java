package Tema5.ejerciciointerfaces.ejercicio2;

import java.util.Comparator;

public class OrdenaEdades implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {

		return o1.getEdad() - o2.getEdad();

	}
	

}
