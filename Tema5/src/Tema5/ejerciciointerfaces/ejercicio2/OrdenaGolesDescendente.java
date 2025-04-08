package Tema5.ejerciciointerfaces.ejercicio2;

import java.util.Comparator;

public class OrdenaGolesDescendente implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o2.getNumeroGoles() - o1.getNumeroGoles();
	}
}