package SistemaGestorTareas;

import java.util.List;

public class Gestor {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos");

        usuario.crearProyecto("Proyecto 1");
        usuario.crearProyecto("Proyecto 2");

        Proyecto proyecto1 = usuario.obtenerProyecto("Proyecto 1");
        if (proyecto1 != null) {
            proyecto1.agregarTarea(new Tarea("Tarea 1"));
            proyecto1.agregarTarea(new Tarea("Tarea 2"));
        }

        Proyecto proyecto2 = usuario.obtenerProyecto("Proyecto 2");
        if (proyecto2 != null) {
            proyecto2.agregarTarea(new Tarea("Tarea A"));
            proyecto2.agregarTarea(new Tarea("Tarea B"));
        }

        proyecto1.mostrarTareas();
        proyecto2.mostrarTareas();

        if (proyecto1 != null) {
            List<Tarea> tareas = proyecto1.getTareas();
            if (!tareas.isEmpty()) {
                tareas.get(0).marcarComoCompletada();
            }
        }

        proyecto1.mostrarTareas();
    }
}
