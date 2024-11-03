package SistemaGestorTareas

class Usuario(val nombre: String) {
    private val proyectos: MutableList<Proyecto> = ArrayList()

    fun crearProyecto(nombreProyecto: String) {
        val nuevoProyecto = Proyecto(nombreProyecto)
        proyectos.add(nuevoProyecto)
        println("Proyecto '$nombreProyecto' creado por $nombre.")
    }

    fun obtenerProyecto(nombreProyecto: String?): Proyecto? {
        for (proyecto in proyectos) {
            if (proyecto.nombre.equals(nombreProyecto, ignoreCase = true)) {
                return proyecto
            }
        }
        return null
    }

    override fun toString(): String {
        return "Usuario: $nombre"
    }
}