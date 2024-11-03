package org.example.SistemaGestionEstudiante

class Curso(val nombre: String, profesor: Profesor) {
    private val profesor: Profesor = profesor

    init {
        profesor.asignarCurso(this)
    }

    override fun toString(): String {
        return "Curso: " + nombre + ", Profesor: " + profesor.nombre
    }
}