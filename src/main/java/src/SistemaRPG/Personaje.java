package SistemaRPG;

public abstract class Personaje {
    private String nombre;
    private int puntosVida;

    public Personaje(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void recibirDanio(int danio) {
        puntosVida -= danio;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida +
                '}';
    }

    public abstract void atacar(Personaje objetivo);
}

