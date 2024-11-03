package SistemaRPG

fun main() {
    val juego = GestorBatalla()

    val guerrero = Guerrero("Goku", 100, 15)
    val mago = Mago("Paco", 80, 30, 5)
    val fuego = Hechizo("Fuego fatuo", 20, 10)

    juego.agregarPersonaje(guerrero)
    juego.agregarPersonaje(mago)

    juego.accion(guerrero, mago)
    mago.lanzarHechizo(fuego, guerrero)
    juego.accion(mago, guerrero)

    juego.mostrarEstado()
}