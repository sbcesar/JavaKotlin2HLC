package SistemaReservaHotel;

public class Habitacion {
    private int id;
    private boolean disponible;

    public Habitacion(int id) {
        this.id = id;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Habitación{" +
                "ID=" + id +
                ", Disponible=" + disponible +
                '}';
    }
}

