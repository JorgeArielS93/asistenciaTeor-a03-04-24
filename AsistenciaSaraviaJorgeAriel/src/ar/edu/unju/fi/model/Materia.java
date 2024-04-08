package ar.edu.unju.fi.model;

/**
 * La clase Materia representa un modelo para almacenar información sobre una
 * materia.
 */
public class Materia {
	private String codigo;
	private String nombre;

	/**
	 * Constructor por defecto sin parametros
	 */
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param codigo: codigo de la materia
	 * @param nombre: nombre de la materia
	 */
	public Materia(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Materia {" + "Código: " + codigo + ", Nombre: " + nombre + "}";
	}
}
