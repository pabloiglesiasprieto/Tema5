package Tema5.ejercicioanalisis.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre;

		String telefono;

		String website;

		String cumpleaños;

		int eleccion;

		AgendaTelefonica agenda = new AgendaTelefonica();

		System.out.println("Que acción quieres realizar.");

		imprimirMenu();

		eleccion = sc.nextInt();

		sc.nextLine();

		while (eleccion != 0) {

			switch (eleccion) {

			case 1 -> {
				agenda.getAllContactos();
			}
			case 2 -> {

				System.out.println("Que tipo de contacto quieres agregar:\n1.Persona.\n2.Empresa.");

				eleccion = sc.nextInt();

				sc.nextLine();

				switch (eleccion) {

				case 1 -> {

					System.out.println("Introduce el nombre de la persona.");
					nombre = sc.nextLine();

					System.out.println("Introduce el teléfono.");
					telefono = sc.nextLine();

					System.out.println("Introduce el cumpleaños.");
					cumpleaños = sc.nextLine();

					Contacto persona = new Persona(nombre, telefono, cumpleaños);

					System.out.println(agenda.addContacto(persona) ? "El contacto ha sido agregado correctamente."
							: "El contacto ya existe en la agenda.");

				}
				case 2 -> {

					System.out.println("Introduce el nombre de la empresa.");
					nombre = sc.nextLine();

					System.out.println("Introduce el teléfono.");
					telefono = sc.nextLine();

					System.out.println("Introduce la página web.");
					website = sc.nextLine();

					Contacto empresa = new Empresa(nombre, telefono, website);

					System.out.println(agenda.addContacto(empresa) ? "El contacto ha sido agregado correctamente"
							: "El contacto ya existe en la agenda.");

				}

				}

			}
			case 3 -> {
				System.out.println("Introduce el nombre del contacto a modificar.");
				nombre = sc.nextLine();
				Contacto c1 = new Contacto(nombre);
				System.out.println(agenda.removeContacto(c1) ? "Contacto eliminado correctamente."
						: "El contacto no se ha encontrado en la agenda.");
			}
			case 4 -> {

				System.out.println("Introduce el nombre del contacto a modificar.");
				nombre = sc.nextLine();
				Contacto c1 = agenda.getContacto(nombre);
				System.out.println("Introduce el telefono nuevo.");
				telefono = sc.nextLine();
				c1.setTelefono(telefono);

			}
			}
			System.out.println("Que acción quieres realizar.");

			imprimirMenu();

			eleccion = sc.nextInt();

			sc.nextLine();

		}
		System.out.println("Saliste de la agenda.");
		sc.close();

	}

	public static void imprimirMenu() {

		System.out.println(
				"1.Imprimir Contactos.\n2.Agregar Contacto.\n3.Borrar Contacto.\n4.Modificar Telefono.\n0.Salir.");
	}
}
