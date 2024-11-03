package SistemaGestorTareas

class Tarea(val nombre: String) {
    var isCompletada: Boolean = false

    fun marcarComoCompletada() {
        isCompletada = true
        println("La tarea '$nombre' ha sido marcada como completada.")
    }

    override fun toString(): String {
        return nombre + " - " + (if (isCompletada) "Completada" else "Pendiente")
    }
}