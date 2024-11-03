package SistemaReservaHotel

import java.time.LocalDate

class Reserva(
    val habitacion: Habitacion,
    val cliente: Cliente,
    val fechaEntrada: LocalDate,
    val fechaSalida: LocalDate
) {
    override fun toString(): String {
        return "Reserva{" +
                "Habitación=" + habitacion.id +
                ", Cliente=" + cliente.nombre +
                ", Fecha Entrada=" + fechaEntrada +
                ", Fecha Salida=" + fechaSalida +
                '}'
    }
}