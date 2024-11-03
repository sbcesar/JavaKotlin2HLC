package SistemaRPG

class Guerrero(nombre: String, puntosVida: Int, private val fuerza: Int) : Personaje(nombre, puntosVida) {
    override fun toString(): String {
        return super.toString() + " (Guerrero, Fuerza: " + fuerza + ")"
    }

    override fun atacar(objetivo: Personaje?) {
        val danio = fuerza
        objetivo?.recibirDanio(danio)
        if (objetivo != null) {
            println(nombre + " ataca a " + objetivo.nombre + " y causa " + danio + " de daño.")
        }
    }
}