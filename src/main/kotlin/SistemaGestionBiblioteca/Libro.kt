package org.example.SistemaGestionBiblioteca

class Libro(
    var id: Int,
    var titulo: String,
    var autor: String
) {
    var prestado: Boolean = false

    fun isPrestado(): Boolean {
        return prestado
    }

    fun switchPrestado(prestado: Boolean) {
        this.prestado = prestado
    }

    override fun toString(): String {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                '}'
    }
}