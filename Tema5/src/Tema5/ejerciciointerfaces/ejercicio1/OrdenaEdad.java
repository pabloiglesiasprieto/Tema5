package Tema5.ejerciciointerfaces.ejercicio1;

import java.util.Comparator;

public class OrdenaEdad implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
