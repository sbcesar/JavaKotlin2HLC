package org.example.SistemaGestionEstudiante

fun main() {
    val escuela: Escuela = Escuela()

    val profesor1 = Profesor("Juan Pérez")
    val profesor2 = Profesor("María López")

    val curso1 = Curso("Matemáticas", profesor1)
    val curso2 = Curso("Historia", profesor2)

    escuela.agregarCurso(curso1)
    escuela.agregarCurso(curso2)

    val estudiante1 = Estudiante("Carlos")
    val estudiante2 = Estudiante("Ana")

    escuela.agregarEstudiante(estudiante1)
    escuela.agregarEstudiante(estudiante2)

    profesor1.asignarCalificacion(estudiante1, 55.0)
    profesor1.asignarCalificacion(estudiante1, 77.0)
    profesor2.asignarCalificacion(estudiante2, 90.0)
    profesor2.asignarCalificacion(estudiante2, 82.0)


    escuela.mostrarEstudiantes()
    escuela.mostrarCursos()
}