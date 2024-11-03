package org.example.SistemaGestionEstudiante

class Profesor(val nombre: String) {
    private val cursos: MutableList<Curso>

    init {
        this.cursos = ArrayList<Curso>()
    }

    fun asignarCurso(curso: Curso) {
        cursos.add(curso)
    }

    fun asignarCalificacion(estudiante: Estudiante, calificacion: Double) {
        estudiante.agregarCalificacion(calificacion)
    }

    override fun toString(): String {
        return "Profesor: $nombre"
    }
}