package org.example.SistemaGestionBiblioteca

class Usuario(var id: Int, var nombre: String) {
    override fun toString(): String {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}'
    }
}