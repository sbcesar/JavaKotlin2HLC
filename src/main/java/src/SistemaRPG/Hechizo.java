package SistemaRPG;

public class Hechizo {
    private String nombre;
    private int danio;
    private int costoPoder;

    public Hechizo(String nombre, int danio, int costoPoder) {
        this.nombre = nombre;
        this.danio = danio;
        this.costoPoder = costoPoder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }

    public int getCostoPoder() {
        return costoPoder;
    }
}

