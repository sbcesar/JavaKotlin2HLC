package SistemaReservaHotel;

import java.time.LocalDate;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva(Habitacion habitacion, Cliente cliente, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "Habitación=" + habitacion.getId() +
                ", Cliente=" + cliente.getNombre() +
                ", Fecha Entrada=" + fechaEntrada +
                ", Fecha Salida=" + fechaSalida +
                '}';
    }
}

