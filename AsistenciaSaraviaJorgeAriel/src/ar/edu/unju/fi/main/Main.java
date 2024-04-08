package ar.edu.unju.fi.main;

import java.util.Random;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// Cargar y Mostrar alumnos
		Alumno[] alumnos = crearAlumnos();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
		}

		// Cargar y Mostrar Materias
		Materia[] materias = generarMaterias();
		for (Materia materia : materias) {
			System.out.println(materia.toString());
		}

        // Cargar y mostrar los registros de notas
        RegistroNota[] registros = crearRegistrosNotas(alumnos, materias);
        for (RegistroNota registroNota : registros) {
			System.out.println(registroNota.toString());
		}

	}

	// Método para crear 3 alumnos
	public static Alumno[] crearAlumnos() {
		Alumno[] alumnos = new Alumno[3];
		alumnos[0] = new Alumno(33, "Perez", "Juan Gabriel");
		alumnos[1] = new Alumno(44, "Gomez", "María");
		alumnos[2] = new Alumno(55, "Martinez", "Pedro");
		return alumnos;
	}

	// Método para crear 3 materias
	public static Materia[] generarMaterias() {
		Materia[] materias = new Materia[3];
		materias[0] = new Materia("MAT001", "Matemáticas");
		materias[1] = new Materia("FIS001", "Física");
		materias[2] = new Materia("QUI001", "Química");
		return materias;
	}

	// Método para crear registros de notas
	public static RegistroNota[] crearRegistrosNotas(Alumno[] alumnos, Materia[] materias) {
		// Creo un arreglo para almacenar 3 registros de notas
		RegistroNota[] registros = new RegistroNota[3]; 
		Random random = new Random();
		// Generar registros de notas aleatorias para cada alumno y materia
		for (int i = 0; i < 3; i++) {
			// Seleccionar un alumno en orden
			Alumno alumno = alumnos[i];
			// Seleccionar una materia en orden
			Materia materia = materias[i]; 
			// Generar código de registro único
			String codigo = "Reg" + (i + 1);
			// Generar nota aleatoria entre 0 y 10
			float nota = random.nextInt(11); 
			 // Crear registro de nota
			registros[i] = new RegistroNota(codigo, alumno, materia, nota);
		}

		return registros;
	}
}
