package SistemaRPG

class Mago(nombre: String, puntosVida: Int, private var poderMagico: Int, private val danioBasico: Int) : Personaje(nombre, puntosVida) {
    override fun atacar(objetivo: Personaje?) {
        if (poderMagico > 0) {
            println(nombre + " ataca físicamente a " + objetivo?.nombre + " causando " + danioBasico + " de daño.")
            objetivo?.recibirDanio(danioBasico)
        } else {
            println("$nombre no tiene poder mágico para lanzar hechizos, así que ataca físicamente.")
            objetivo?.recibirDanio(danioBasico)
        }
    }

    fun lanzarHechizo(hechizo: Hechizo, objetivo: Personaje) {
        if (hechizo.costoPoder <= poderMagico) {
            objetivo.recibirDanio(hechizo.danio)
            poderMagico -= hechizo.costoPoder
            println(nombre + " lanza " + hechizo.nombre + " a " + objetivo.nombre + " causando " + hechizo.danio + " de daño.")
        } else {
            println(nombre + " no tiene suficiente poder mágico para lanzar " + hechizo.nombre + ".")
        }
    }

    override fun toString(): String {
        return super.toString() + " (Mago, Poder Mágico: " + poderMagico + ")"
    }
}