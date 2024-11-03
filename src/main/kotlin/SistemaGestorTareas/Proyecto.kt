package SistemaGestorTareas

class Proyecto(val nombre: String) {
    val tareas: MutableList<Tarea> = mutableListOf()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
        println("Tarea '" + tarea.nombre + "' añadida al proyecto '" + nombre + "'.")
    }

    fun mostrarTareas() {
        println("Tareas del proyecto '$nombre':")
        for (tarea in tareas) {
            println(tarea)
        }
    }
}