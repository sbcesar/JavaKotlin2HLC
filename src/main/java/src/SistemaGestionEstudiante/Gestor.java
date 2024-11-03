package SistemaGestionEstudiante;

public class Gestor {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();

        Profesor profesor1 = new Profesor("Juan Pérez");
        Profesor profesor2 = new Profesor("María López");

        Curso curso1 = new Curso("Matemáticas", profesor1);
        Curso curso2 = new Curso("Historia", profesor2);

        escuela.agregarCurso(curso1);
        escuela.agregarCurso(curso2);

        Estudiante estudiante1 = new Estudiante("Carlos");
        Estudiante estudiante2 = new Estudiante("Ana");

        escuela.agregarEstudiante(estudiante1);
        escuela.agregarEstudiante(estudiante2);

        profesor1.asignarCalificacion(estudiante1, 55);
        profesor1.asignarCalificacion(estudiante1, 77);
        profesor2.asignarCalificacion(estudiante2, 90);
        profesor2.asignarCalificacion(estudiante2, 82);


        escuela.mostrarEstudiantes();
        escuela.mostrarCursos();
    }
}
