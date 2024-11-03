package SistemaReservaHotel

class Habitacion(val id: Int) {
    var disponible: Boolean = true

    fun changeDisponible(disponible: Boolean) {
        this.disponible = disponible
    }

    override fun toString(): String {
        return "Habitación{" +
                "ID=" + id +
                ", Disponible=" + disponible +
                '}'
    }
}