package SistemaReservaHotel

import java.time.LocalDate

fun main() {
    val hotel = Hotel()

    hotel.agregarHabitacion(Habitacion(1))
    hotel.agregarHabitacion(Habitacion(2))
    hotel.agregarHabitacion(Habitacion(3))

    hotel.registrarCliente(Cliente(1, "Benito Camela"))
    hotel.registrarCliente(Cliente(2, "Ana"))
    hotel.registrarCliente(Cliente(3, "Pepe"))

    hotel.reservarHabitacion(1, 1, LocalDate.now(), LocalDate.now().plusDays(3))
    hotel.reservarHabitacion(2, 2, LocalDate.now(), LocalDate.now().plusDays(5))

    hotel.mostrarReservasActivas()

    hotel.cancelarReserva(1, 1)

    hotel.mostrarReservasActivas()
}