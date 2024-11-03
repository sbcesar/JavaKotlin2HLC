package SistemaGestionEstudiante;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;

    public Escuela() {
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println(estudiante.getNombre() + " ha sido agregado.");
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso " + curso.getNombre() + " ha sido agregado.");
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void mostrarCursos() {
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
}

