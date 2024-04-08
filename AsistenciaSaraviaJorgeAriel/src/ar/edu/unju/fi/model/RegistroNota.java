package ar.edu.unju.fi.model;

/**
 * La clase RegistroNota representa un modelo para almacenar información sobre
 * una nota final de una materia a un alumno.
 */
public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float notaFinal;

	/**
	 * Constructor por defecto sin parametros
	 */
	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param codigo:    Código de identificación de la nota
	 * @param alumno:    Alumno al que se le asigna la nota
	 * @param materia:   Materia a la que corresponde la nota
	 * @param notaFinal: Nota final obtenida por el alumno en la materia
	 */
	public RegistroNota(String codigo, Alumno alumno, Materia materia, Float notaFinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notaFinal = notaFinal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Float notaFinal) {
		this.notaFinal = notaFinal;
	}

	// Método toString para representar un registro de nota como una cadena de texto
	@Override
	public String toString() {
		return "Registro de Nota {" + "Código: " + codigo + ", Alumno: " + alumno.getNombre() + " "
				+ alumno.getApellido() + ", Materia: " + materia.getNombre() + ", Nota Final: " + notaFinal + "}";
	}
}
