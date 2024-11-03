package SistemaRPG

class GestorBatalla {
    private val personajes: MutableList<Personaje> = ArrayList()

    fun agregarPersonaje(personaje: Personaje) {
        personajes.add(personaje)
        println(personaje.nombre + " acaba de spawnear.")
    }

    fun accion(atacante: Personaje, objetivo: Personaje?) {
        atacante.atacar(objetivo)
    }

    fun mostrarEstado() {
        println("Estado:")
        for (personaje in personajes) {
            println(personaje)
        }
    }
}