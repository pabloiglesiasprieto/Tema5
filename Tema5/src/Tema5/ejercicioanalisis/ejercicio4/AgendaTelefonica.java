package Tema5.ejercicioanalisis.ejercicio4;

import java.util.HashSet;

public class AgendaTelefonica {

	private HashSet<Contacto> agenda;

	public AgendaTelefonica() {

		this.agenda = new HashSet<Contacto>();
	}

	public Contacto getContacto(String nombre) {
		Contacto c1 = null;

		for (Contacto contacto : agenda) {
			if (contacto.getNombre().equals(nombre)) {
				c1 = contacto;
			}
		}
		return c1;
	}

	public void getAllContactos() {
		for (Contacto contacto : agenda) {
			System.out.println(contacto);
		}
	}

	public boolean addContacto(Contacto contac) {
		return agenda.add(contac);
	}

	public boolean removeContacto(Contacto contac) {
		return agenda.remove(contac);
	}

}
