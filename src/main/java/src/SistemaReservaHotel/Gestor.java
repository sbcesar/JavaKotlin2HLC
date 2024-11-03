package SistemaReservaHotel;

import java.time.LocalDate;

public class Gestor {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.agregarHabitacion(new Habitacion(1));
        hotel.agregarHabitacion(new Habitacion(2));
        hotel.agregarHabitacion(new Habitacion(3));

        hotel.registrarCliente(new Cliente(1, "Benito Camela"));
        hotel.registrarCliente(new Cliente(2, "Ana"));
        hotel.registrarCliente(new Cliente(3, "Pepe"));

        hotel.reservarHabitacion(1, 1, LocalDate.now(), LocalDate.now().plusDays(3));
        hotel.reservarHabitacion(2, 2, LocalDate.now(), LocalDate.now().plusDays(5));

        hotel.mostrarReservasActivas();

        hotel.cancelarReserva(1, 1);

        hotel.mostrarReservasActivas();
    }
}