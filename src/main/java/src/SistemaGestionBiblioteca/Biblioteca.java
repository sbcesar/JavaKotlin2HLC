package SistemaGestionBiblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    private List<Libro> libros;
    private List<Usuario> usuarios;
    private Map<Integer, Integer> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro " + libro.getTitulo() + " ha sido agregado.");
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("El usuario " + usuario.getNombre() + " con id " + usuario.getId() + " ha sido registrado.");
    }

    public void prestarLibro(int idLibro, int idUsuario) {
        Libro libro = null;
        Usuario usuario = null;

        for (Libro libroBuscar : libros) {
            if (libroBuscar.getId() == idLibro) {
                libro = libroBuscar;
                break;
            }
        }

        for (Usuario usuarioBuscar : usuarios) {
            if (usuarioBuscar.getId() == idUsuario) {
                usuario = usuarioBuscar;
                break;
            }
        }

        if (libro == null) {
            System.out.println("El libro con id " + idLibro + " no existe.");
        } else if (usuario == null) {
            System.out.println("El usuario con id " + idUsuario + " no está registrado.");
        } else if (libro.isPrestado()){
            System.out.println("El libro " + libro.getTitulo() + " ya está prestado.");
        } else  {
            libro.setPrestado(true);
            prestamos.put(idLibro, idUsuario);
            System.out.println("El libro " + libro.getTitulo() + " ha sido prestado a " + usuario.getNombre() + ".");
        }
    }

    public void devolverLibro(int idLibro, int idUsuario) {
        Libro libro = null;

        for (Libro libroBuscar : libros) {
            if (libroBuscar.getId() == idLibro) {
                libro = libroBuscar;
                break;
            }
        }

        if (libro == null) {
            System.out.println("El libro con id " + idLibro + " no existe.");
        } else if (!libro.isPrestado()){
            System.out.println("El libro " + libro.getTitulo() + " no está prestado.");
        } else  {
            libro.setPrestado(false);
            prestamos.remove(idLibro);
            System.out.println("El libro " + libro.getTitulo() + " ha sido devuelto.");
        }
    }

    public void mostrarLibros() {
        System.out.println("Libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarUsuarios() {
        System.out.println("Usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
