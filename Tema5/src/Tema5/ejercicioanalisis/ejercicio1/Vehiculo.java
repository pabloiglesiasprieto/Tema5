package Tema5.ejercicioanalisis.ejercicio1;

public class Vehiculo {

	/**
	 * Enumerado para los tipos de vehiculo.
	 */
	enum Tipo {
		TURISMOS, CAMIONES, MOTOCILETAS
	}

	/**
	 * Atributo privado de vehiculo que identificará la marca.
	 */
	private String marca;

	/**
	 * Atributo privado de vehiculo que identificará el modelo.
	 */
	private String modelo;

	/**
	 * Atributo privado de vehiculo que identificará el color.
	 */
	private String color;

	/**
	 * Atributo privado de vehiculo que identificará la matricula.
	 */
	private String matricula;

	/**
	 * Atributo privado de vehiculo que identificará si el vehiculo está encendido.
	 */
	private boolean encendido;

	/**
	 * Atributo privado de vehiculo que identificará la marcha.
	 */
	private int marcha;

	/**
	 * Atributo privado de vehiculo que identificará la velocidad.
	 */
	private String velocidad;

	/**
	 * Atributo privado de vehiculo que identificará el tipo de vehiculo.
	 */
	private Tipo tipoCoche;

	/**
	 * Constructor de vehiculo.
	 * 
	 * @param marca     Marca del vehiculo.
	 * @param color     Color del vehiculo.
	 * @param modelo    Modelo del vehiculo.
	 * @param matricula Matricula del vehiculo.
	 */
	public Vehiculo(String marca, String color, String modelo, String matricula) {

		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	/**
	 * Getter de marca.
	 * 
	 * @return Marca del vehiculo.
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * Getter de color
	 * 
	 * @return Color del vehiculo.
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Getter de modelo.
	 * 
	 * @return Modelo del vehiculo.
	 */
	public String getModelo() {
		return this.modelo;
	}

	/**
	 * Getter de matricula.
	 * 
	 * @return Getter de matricula.
	 */
	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * Getter del estado del vehiculo.
	 * 
	 * @return Encendido o apagado.
	 */
	public boolean isEncendido() {
		return this.encendido;
	}

	/**
	 * Getter de la marcha.
	 * 
	 * @return Marcha actual del vehiculo.
	 */
	public int getMarcha() {
		return this.marcha;
	}

	/**
	 * Getter de velocidad del vehiculo.
	 * 
	 * @return Velocidad del vehiculo.
	 */
	public String getVelocidad() {
		return this.velocidad;
	}

	/**
	 * Setter del color del vehiculo.
	 * 
	 * @param color Color del vehiculo.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Función que para el vehiculo.
	 */
	public void parar() {

	}

	/**
	 * Función que arranca el vehiculo.
	 */
	public void arrancar() {

	}

	/**
	 * Función que sube de marcha.
	 */
	public void subirMarcha() {

	}

	/**
	 * Función que baja de marcha.
	 */
	public void bajarMarcha() {

	}

}
