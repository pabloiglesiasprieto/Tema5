package Tema5.ejercicio5;

import java.util.ArrayList;

/**
 * Clase Abstracta Polígono
 */
public abstract class Poligono {

	/**
	 * Lista Poligonos.
	 */
	private ArrayList<Poligono> listaPoligono = new ArrayList<>();

	/**
	 * Atributo protegido que identifica el número de lados.
	 */
	protected int numeroLados = 3;

	/**
	 * Constructor de poligono
	 * 
	 * @param numeroLados Numero de lados de poligono.
	 */
	public Poligono(int numeroLados) {

		if (numeroLados >= 3) {
			this.numeroLados = numeroLados;
		}
	}

	/**
	 * Método abstracto que devuelve una cadena con la cantidad de lados.
	 */
	public String toString() {

		String cadena = String.valueOf(numeroLados);

		return cadena;
	}

	/**
	 * Método abstracto que calcula el área.
	 * 
	 * @return Área de la figura.
	 */
	public abstract double area();
}
