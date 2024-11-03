package SistemaRPG;

public class Mago extends Personaje {
    private int poderMagico;
    private int danioBasico;

    public Mago(String nombre, int puntosVida, int poderMagico, int danioBasico) {
        super(nombre, puntosVida);
        this.poderMagico = poderMagico;
        this.danioBasico = danioBasico;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (poderMagico > 0) {
            System.out.println(getNombre() + " ataca físicamente a " + objetivo.getNombre() + " causando " + danioBasico + " de daño.");
            objetivo.recibirDanio(danioBasico);
        } else {
            System.out.println(getNombre() + " no tiene poder mágico para lanzar hechizos, así que ataca físicamente.");
            objetivo.recibirDanio(danioBasico);
        }
    }

    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (hechizo.getCostoPoder() <= poderMagico) {
            objetivo.recibirDanio(hechizo.getDanio());
            poderMagico -= hechizo.getCostoPoder();
            System.out.println(getNombre() + " lanza " + hechizo.getNombre() + " a " + objetivo.getNombre() + " causando " + hechizo.getDanio() + " de daño.");
        } else {
            System.out.println(getNombre() + " no tiene suficiente poder mágico para lanzar " + hechizo.getNombre() + ".");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Mago, Poder Mágico: " + poderMagico + ")";
    }
}

