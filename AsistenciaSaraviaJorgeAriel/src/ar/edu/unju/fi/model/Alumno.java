package ar.edu.unju.fi.model;

/**
 * La clase Alumno representa un modelo para almacenar información sobre un
 * estudiante.
 */
public class Alumno {
	private int legajo; // Número de legajo del alumno
	private String apellido; // Apellido del alumno
	private String nombre; // Nombre del alumno

	// Constructor por defecto sin parametros
	public Alumno() {

	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param legajo:   Número de legajo del alumno
	 * @param apellido: Apellido del alumno
	 * @param nombre:   Nombre del alumno
	 */
	public Alumno(int legajo, String apellido, String nombre) {
		this.legajo = legajo;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Alumno {" + "Legajo: " + legajo + ", Nombre: " + nombre + ", Apellido: " + apellido + "}";
	}

}
