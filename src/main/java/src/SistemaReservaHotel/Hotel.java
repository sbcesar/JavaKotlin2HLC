package SistemaReservaHotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Se ha añadido la habitación -> " + habitacion);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Se ha añadido el cliente -> " + cliente);
    }

    public void reservarHabitacion(int habitacionId, int clienteId, LocalDate fechaEntrada, LocalDate fechaSalida) {
        Habitacion habitacion = null;
        Cliente cliente = null;

        for (Habitacion habitacionBuscar : habitaciones) {
            if (habitacionBuscar.getId() == habitacionId) {
                habitacion = habitacionBuscar;
                break;
            }
        }

        for (Cliente clienteBuscar : clientes) {
            if (clienteBuscar.getId() == clienteId) {
                cliente = clienteBuscar;
                break;
            }
        }

        if (habitacion == null) {
            System.out.println("La habitación con ID " + habitacionId + " no existe.");
            return;
        }

        if (cliente == null) {
            System.out.println("El cliente con ID " + clienteId + " no está registrado.");
            return;
        }

        if (!habitacion.isDisponible()) {
            System.out.println("La habitación '" + habitacion.getId() + "' ya está reservada.");
            return;
        }

        Reserva reserva = new Reserva(habitacion, cliente, fechaEntrada, fechaSalida);
        reservas.add(reserva);
        habitacion.setDisponible(false);
        System.out.println("Se ha realizado la reserva -> " + reserva);
    }

    public void cancelarReserva(int habitacionId, int clienteId) {
        Reserva reservaCancelar = null;

        for (Reserva reservaBuscar : reservas) {
            if (reservaBuscar.getHabitacion().getId() == habitacionId && reservaBuscar.getCliente().getId() == clienteId) {
                reservaCancelar = reservaBuscar;
                break;
            }
        }

        if (reservaCancelar != null) {
            reservas.remove(reservaCancelar);
            reservaCancelar.getHabitacion().setDisponible(true);
            System.out.println("Se ha cancelado la reserva -> " + reservaCancelar);
        } else {
            System.out.println("No se encontró una reserva para la habitación " + habitacionId + " y cliente " + clienteId + ".");
        }
    }

    public void mostrarReservasActivas() {
        System.out.println("Reservas activas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    private Habitacion buscarHabitacionPorId(int habitacionId) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getId() == habitacionId) {
                return habitacion;
            }
        }
        return null;
    }

    private Cliente buscarClientePorId(int clienteId) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == clienteId) {
                return cliente;
            }
        }
        return null;
    }

    private Reserva buscarReserva(int habitacionId, int clienteId) {
        for (Reserva reserva : reservas) {
            if (reserva.getHabitacion().getId() == habitacionId && reserva.getCliente().getId() == clienteId) {
                return reserva;
            }
        }
        return null;
    }
}

