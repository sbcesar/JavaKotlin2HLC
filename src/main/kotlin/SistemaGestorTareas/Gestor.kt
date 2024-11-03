package SistemaGestorTareas

fun main() {
    val usuario = Usuario("Carlos")

    usuario.crearProyecto("Proyecto 1")
    usuario.crearProyecto("Proyecto 2")

    val proyecto1 = usuario.obtenerProyecto("Proyecto 1")
    if (proyecto1 != null) {
        proyecto1.agregarTarea(Tarea("Tarea 1"))
        proyecto1.agregarTarea(Tarea("Tarea 2"))
    }

    val proyecto2 = usuario.obtenerProyecto("Proyecto 2")
    if (proyecto2 != null) {
        proyecto2.agregarTarea(Tarea("Tarea A"))
        proyecto2.agregarTarea(Tarea("Tarea B"))
    }

    proyecto1!!.mostrarTareas()
    proyecto2!!.mostrarTareas()

    if (proyecto1 != null) {
        val tareas: List<Tarea> = proyecto1.tareas
        if (!tareas.isEmpty()) {
            tareas[0].marcarComoCompletada()
        }
    }

    proyecto1.mostrarTareas()
}