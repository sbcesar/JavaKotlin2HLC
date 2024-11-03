package SistemaRPG

abstract class Personaje(
    val nombre: String,
    var puntosVida: Int
) {
    fun recibirDanio(danio: Int) {
        puntosVida -= danio
        if (puntosVida < 0) {
            puntosVida = 0
        }
    }

    override fun toString(): String {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida +
                '}'
    }

    abstract fun atacar(objetivo: Personaje?)
}