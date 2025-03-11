package Tema5.ejercicio2;

public class Main {
	public static void main(String[] args) {

		// Instanciamos las clases.
		Empleado e1 = new Empleado("Pedro");
		Oficial o1 = new Oficial("Juan");
		Directivo d1 = new Directivo("Manuel");
		Operario op1 = new Operario("Pablo");
		Tecnico t1 = new Tecnico("Julian");

		// Imprimimos los objetos.
		System.out.println(e1);
		System.out.println(o1);
		System.out.println(d1);
		System.out.println(op1);
		System.out.println(t1);
	}
}
