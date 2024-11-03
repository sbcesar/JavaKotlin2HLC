package SistemaRPG;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int puntosVida, int fuerza) {
        super(nombre, puntosVida);
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString() + " (Guerrero, Fuerza: " + fuerza + ")";
    }

    @Override
    public void atacar(Personaje objetivo) {
        int danio = fuerza;
        objetivo.recibirDanio(danio);
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + " y causa " + danio + " de daño.");
    }
}

