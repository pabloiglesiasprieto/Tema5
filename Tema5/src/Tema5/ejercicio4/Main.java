package Tema5.ejercicio4;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// Creamos la lista de Electrodomesticos.
		ArrayList<Electrodomestico> listaElectrodomestico = new ArrayList<>();

		// Creamos los objetos.
		Electrodomestico e1 = new Electrodomestico(30, "negro", 'C', 20);
		Electrodomestico l1 = new Lavadora(32, "negro", 'C', 20, 10);
		Electrodomestico t1 = new Television(14, "negro", 'C', 20, 30, "Sí");

		listaElectrodomestico.add(e1);
		listaElectrodomestico.add(l1);
		listaElectrodomestico.add(t1);

		e1.precioFinal();
		System.out.println(e1.getPrecioBase());
		l1.precioFinal();
		System.out.println(l1.getPrecioBase());
		t1.precioFinal();
		System.out.println(t1.getPrecioBase());
	}
}
