package org.example.SistemaGestionBiblioteca

fun main() {
    val biblioteca: Biblioteca = Biblioteca()

    biblioteca.agregarLibro(Libro(1, "Libro 1", "Autor 1"))
    biblioteca.agregarLibro(Libro(2, "Libro 2", "Autor 2"))
    biblioteca.agregarLibro(Libro(3, "Libro 3", "Autor 3"))

    biblioteca.registrarUsuario(Usuario(1, "Benito Camela"))
    biblioteca.registrarUsuario(Usuario(2, "Alberto Calvo"))
    biblioteca.registrarUsuario(Usuario(3, "Pedro Pedro"))

    println("\nEstado inicial:")
    biblioteca.mostrarLibros()
    biblioteca.mostrarUsuarios()

    println("\nPrestar el libro con ID 1 a usuario con ID 1:")
    biblioteca.prestarLibro(1, 1)

    println("\nPrestar el mismo libro (ID 1) a otro usuario (ID 2):")
    biblioteca.prestarLibro(1, 2)

    println("\nPrestar el libro con ID 2 a usuario con ID 2:")
    biblioteca.prestarLibro(2, 2)

    println("\nEstado de la biblioteca después de préstamos:")
    biblioteca.mostrarLibros()

    println("\nDevolver el libro con ID 1 con usuario con ID 1:")
    biblioteca.devolverLibro(1, 1)

    println("\nDevolver el libro con ID 3 que no está en préstamo:")
    biblioteca.devolverLibro(3, 2)

    println("\nEstado final:")
    biblioteca.mostrarLibros()
    biblioteca.mostrarUsuarios()
}
