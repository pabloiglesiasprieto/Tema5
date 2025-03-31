package Tema5.ejercicioanalisis.ejercicio2;

import java.util.ArrayList;

class Biblioteca {
	private ArrayList<Ficha> fichas;

	public Biblioteca() {
		fichas = new ArrayList<>();
	}

	public void agregarFicha(Ficha ficha) {
		fichas.add(ficha);
	}

	public void mostrarTodo() {
		for (Ficha f : fichas) {
			f.mostrarInfo();
		}
	}
}