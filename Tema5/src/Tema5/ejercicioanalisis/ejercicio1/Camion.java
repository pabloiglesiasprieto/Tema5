package Tema5.ejercicioanalisis.ejercicio1;

public class Camion extends Vehiculo {
	private double pesoMaximoAutorizado;
	private boolean mercanciaPeligrosa;

	public Camion(String marca, String color, String modelo, String matricula, double pesoMaximo,
			String mercanciaPeligrosa) {
		super(marca, color, modelo, matricula);
		if (pesoMaximo > 0) {
			this.pesoMaximoAutorizado = pesoMaximo;
		}
		if (mercanciaPeligrosa.equalsIgnoreCase("Si")) {
			this.mercanciaPeligrosa = true;
		} else if (mercanciaPeligrosa.equalsIgnoreCase("No")) {
			this.mercanciaPeligrosa = false;
		}
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	public double getPesoMaximoAutorizado() {
		return pesoMaximoAutorizado;
	}
}
