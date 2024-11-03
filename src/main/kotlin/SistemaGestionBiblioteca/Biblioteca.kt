package org.example.SistemaGestionBiblioteca

class Biblioteca {
    private val libros: MutableList<Libro> = mutableListOf()
    private val usuarios: MutableList<Usuario> = mutableListOf()
    private val prestamos: MutableMap<Int, Int> = mutableMapOf()

    fun agregarLibro(libro: Libro) {
        libros.add(libro)
        println("El libro " + libro.titulo + " ha sido agregado.")
    }

    fun registrarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
        println("El usuario " + usuario.nombre + " con id " + usuario.id + " ha sido registrado.")
    }

    fun prestarLibro(idLibro: Int, idUsuario: Int) {
        var libro: Libro? = null
        var usuario: Usuario? = null

        for (libroBuscar in libros) {
            if (libroBuscar.id == idLibro) {
                libro = libroBuscar
                break
            }
        }

        for (usuarioBuscar in usuarios) {
            if (usuarioBuscar.id == idUsuario) {
                usuario = usuarioBuscar
                break
            }
        }

        if (libro == null) {
            println("El libro con id $idLibro no existe.")
        } else if (usuario == null) {
            println("El usuario con id $idUsuario no está registrado.")
        } else if (libro.prestado) {
            println("El libro " + libro.titulo + " ya está prestado.")
        } else {
            libro.switchPrestado(true)
            prestamos[idLibro] = idUsuario
            println("El libro " + libro.titulo + " ha sido prestado a " + usuario.nombre + ".")
        }
    }

    fun devolverLibro(idLibro: Int, idUsuario: Int) {
        var libro: Libro? = null

        for (libroBuscar in libros) {
            if (libroBuscar.id == idLibro) {
                libro = libroBuscar
                break
            }
        }

        if (libro == null) {
            println("El libro con id $idLibro no existe.")
        } else if (!libro.prestado) {
            println("El libro " + libro.titulo + " no está prestado.")
        } else {
            libro.switchPrestado(false)
            prestamos.remove(idLibro)
            println("El libro " + libro.titulo + " ha sido devuelto.")
        }
    }

    fun mostrarLibros() {
        println("Libros:")
        for (libro in libros) {
            println(libro)
        }
    }

    fun mostrarUsuarios() {
        println("Usuarios:")
        for (usuario in usuarios) {
            println(usuario)
        }
    }
}