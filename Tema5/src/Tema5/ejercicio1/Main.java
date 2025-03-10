package Tema5.ejercicio1;

public class Main {
	public static void main(String[] args) {

		// Creamos un objeto de tipo Hora.
		Hora hora = new Hora(10, 20);

		// Creamos un objeto de tipo horaExacta.
		HoraExacta horaExacta = new HoraExacta(1, 10, 20);

		System.out.println(hora);
		System.out.println(horaExacta);
		hora.setMinutos(59);

		horaExacta.setMinutos(59);
		horaExacta.setSegundo(59);
		horaExacta.inc();
		System.out.println(horaExacta);
		horaExacta.inc();
		System.out.println(horaExacta);

	}
}
