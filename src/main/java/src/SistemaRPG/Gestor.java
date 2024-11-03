package SistemaRPG;

public class Gestor {
    public static void main(String[] args) {
        GestorBatalla juego = new GestorBatalla();

        Guerrero guerrero = new Guerrero("Goku", 100, 15);
        Mago mago = new Mago("Paco", 80, 30, 5);
        Hechizo fuego = new Hechizo("Fuego fatuo", 20, 10);

        juego.agregarPersonaje(guerrero);
        juego.agregarPersonaje(mago);

        juego.accion(guerrero, mago);
        mago.lanzarHechizo(fuego, guerrero);
        juego.accion(mago,guerrero);

        juego.mostrarEstado();
    }
}
