package Tema5.ejerciciointerfaces.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, String color, int peso) {
		super(nombre, raza, color, peso);
	}

	public void toserBola() {
		System.out.println("Tosió una bola de pelo.");
	}

	@Override
	public void hacerRuido() {
		System.out.println("MIAUU");
	}

	@Override
	public boolean hacerCaso() {
		Random rnd = new Random();
		int tmp = rnd.nextInt(1, 101);
		return tmp <= 5;

	}

}
