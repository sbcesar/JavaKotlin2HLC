package SistemaReservaHotel

class Cliente(val id: Int, val nombre: String) {
    override fun toString(): String {
        return "Cliente{" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                '}'
    }
}