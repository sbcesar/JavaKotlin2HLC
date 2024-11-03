package SistemaGestionEstudiante;

public class Curso {
    private String nombre;
    private Profesor profesor;

    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        profesor.asignarCurso(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "Curso: " + nombre + ", Profesor: " + profesor.getNombre();
    }
}

