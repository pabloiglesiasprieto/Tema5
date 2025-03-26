package Tema5.ejerciciointerfaces.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, String raza, String color, int peso) {
		super(nombre, raza, color, peso);
	}

	public void sacarPaseo() {

		System.out.println("El perro está chill paseando.");

	}

	@Override
	public void hacerRuido() {

		System.out.println("WOOF");
	}

	@Override
	public boolean hacerCaso() {

		Random rnd = new Random();
		int tmp;
		tmp = rnd.nextInt(1, 101);

		return tmp <= 90;
	}

}
