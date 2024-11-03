package SistemaReservaHotel

import java.time.LocalDate

class Hotel {
    private val habitaciones: MutableList<Habitacion> = mutableListOf()
    private val clientes: MutableList<Cliente> = mutableListOf()
    private val reservas: MutableList<Reserva> = mutableListOf()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitaciones.add(habitacion)
        println("Se ha añadido la habitación -> $habitacion")
    }

    fun registrarCliente(cliente: Cliente) {
        clientes.add(cliente)
        println("Se ha añadido el cliente -> $cliente")
    }

    fun reservarHabitacion(habitacionId: Int, clienteId: Int, fechaEntrada: LocalDate, fechaSalida: LocalDate) {
        var habitacion: Habitacion? = null
        var cliente: Cliente? = null

        for (habitacionBuscar in habitaciones) {
            if (habitacionBuscar.id == habitacionId) {
                habitacion = habitacionBuscar
                break
            }
        }

        for (clienteBuscar in clientes) {
            if (clienteBuscar.id == clienteId) {
                cliente = clienteBuscar
                break
            }
        }

        if (habitacion == null) {
            println("La habitación con ID $habitacionId no existe.")
            return
        }

        if (cliente == null) {
            println("El cliente con ID $clienteId no está registrado.")
            return
        }

        if (!habitacion.disponible) {
            println("La habitación '" + habitacion.id + "' ya está reservada.")
            return
        }

        val reserva = Reserva(habitacion, cliente, fechaEntrada, fechaSalida)
        reservas.add(reserva)
        habitacion.changeDisponible(false)
        println("Se ha realizado la reserva -> $reserva")
    }

    fun cancelarReserva(habitacionId: Int, clienteId: Int) {
        var reservaCancelar: Reserva? = null

        for (reservaBuscar in reservas) {
            if (reservaBuscar.habitacion.id == habitacionId && reservaBuscar.cliente.id == clienteId) {
                reservaCancelar = reservaBuscar
                break
            }
        }

        if (reservaCancelar != null) {
            reservas.remove(reservaCancelar)
            reservaCancelar.habitacion.changeDisponible(true)
            println("Se ha cancelado la reserva -> $reservaCancelar")
        } else {
            println("No se encontró una reserva para la habitación $habitacionId y cliente $clienteId.")
        }
    }

    fun mostrarReservasActivas() {
        println("Reservas activas:")
        for (reserva in reservas) {
            println(reserva)
        }
    }

    private fun buscarHabitacionPorId(habitacionId: Int): Habitacion? {
        for (habitacion in habitaciones) {
            if (habitacion.id == habitacionId) {
                return habitacion
            }
        }
        return null
    }

    private fun buscarClientePorId(clienteId: Int): Cliente? {
        for (cliente in clientes) {
            if (cliente.id == clienteId) {
                return cliente
            }
        }
        return null
    }

    private fun buscarReserva(habitacionId: Int, clienteId: Int): Reserva? {
        for (reserva in reservas) {
            if (reserva.habitacion.id == habitacionId && reserva.cliente.id == clienteId) {
                return reserva
            }
        }
        return null
    }
}