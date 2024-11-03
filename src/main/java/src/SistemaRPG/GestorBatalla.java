package SistemaRPG;

import java.util.ArrayList;
import java.util.List;

public class GestorBatalla {
    private List<Personaje> personajes;

    public GestorBatalla() {
        personajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
        System.out.println(personaje.getNombre() + " acaba de spawnear.");
    }

    public void accion(Personaje atacante, Personaje objetivo) {
        atacante.atacar(objetivo);
    }

    public void mostrarEstado() {
        System.out.println("Estado:");
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }
    }
}

