package org.example.SistemaGestionEstudiante

class Escuela {
    private val estudiantes: MutableList<Estudiante> = mutableListOf()
    private val cursos: MutableList<Curso> = mutableListOf()

    fun agregarEstudiante(estudiante: Estudiante) {
        estudiantes.add(estudiante)
        println(estudiante.nombre + " ha sido agregado.")
    }

    fun agregarCurso(curso: Curso) {
        cursos.add(curso)
        println("Curso " + curso.nombre + " ha sido agregado.")
    }

    fun mostrarEstudiantes() {
        println("Estudiantes:")
        for (estudiante in estudiantes) {
            println(estudiante)
        }
    }

    fun mostrarCursos() {
        println("Cursos:")
        for (curso in cursos) {
            println(curso)
        }
    }
}