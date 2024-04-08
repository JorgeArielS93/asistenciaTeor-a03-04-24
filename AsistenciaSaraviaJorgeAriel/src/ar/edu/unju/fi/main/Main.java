package ar.edu.unju.fi.main;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;

public class Main {

	public static void main(String[] args) {
		 // Ejemplo de uso: Generar alumnos
        Alumno[] alumnos = crearAlumnos();
        for (Alumno alumno : alumnos) {
            System.out.println("Legajo: " + alumno.getLegajo() + ", Nombre: " + alumno.getNombre() + ", Apellido: " + alumno.getApellido());
        }

        // Ejemplo de uso: Generar materias
        Materia[] materias = generarMaterias();
        for (Materia materia : materias) {
            System.out.println("Código: " + materia.getCodigo() + ", Nombre: " + materia.getNombre());
        }
	}
	
//	// Método para generar 5 alumnos
//	public static void crearAlumnos() {
//		Alumno alumno1=new Alumno(3, "Perez", "Juan Gabriel");
//		Alumno alumno2=new Alumno(4, "Gómez", "María");
//		Alumno alumno3=new Alumno(5, "Martinez", "Pedro");
//		Alumno alumno4=new Alumno(6, "Rodriguez", "Marcos");
//		Alumno alumno5=new Alumno(7, "Sanchez", "Lucia");
//	}
	
	// Método para generar 5 alumnos
	public static Alumno[] crearAlumnos() {
	    Alumno[] alumnos = new Alumno[5];
	    alumnos[0] = new Alumno(0033, "Perez", "Juan Gabriel");
	    alumnos[1] = new Alumno(0044, "Gomez", "María");
	    alumnos[2] = new Alumno(0055, "Martinez", "Pedro");
	    alumnos[3] = new Alumno(0066, "Rodriguez", "Marcos");
	    alumnos[4] = new Alumno(0077, "Sanchez", "Lucia");
	    return alumnos;
	}
	
	 // Método para generar 3 materias
    public static Materia[] generarMaterias() {
        Materia[] materias = new Materia[3];
        materias[0] = new Materia("MAT001", "Matemáticas");
        materias[1] = new Materia("FIS001", "Física");
        materias[2] = new Materia("QUI001", "Química");
        return materias;
    }
}
