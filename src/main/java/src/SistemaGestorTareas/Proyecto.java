package SistemaGestorTareas;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea '" + tarea.getNombre() + "' añadida al proyecto '" + nombre + "'.");
    }

    public void mostrarTareas() {
        System.out.println("Tareas del proyecto '" + nombre + "':");
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}

