package SistemaGestionEstudiante;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private List<Curso> cursos;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void asignarCalificacion(Estudiante estudiante, double calificacion) {
        estudiante.agregarCalificacion(calificacion);
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre;
    }
}

