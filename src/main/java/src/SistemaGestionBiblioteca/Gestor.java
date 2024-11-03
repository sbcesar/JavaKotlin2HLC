package SistemaGestionBiblioteca;

public class Gestor {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro(1, "Libro 1", "Autor 1"));
        biblioteca.agregarLibro(new Libro(2, "Libro 2", "Autor 2"));
        biblioteca.agregarLibro(new Libro(3, "Libro 3", "Autor 3"));

        biblioteca.registrarUsuario(new Usuario(1, "Benito Camela"));
        biblioteca.registrarUsuario(new Usuario(2, "Alberto Calvo"));
        biblioteca.registrarUsuario(new Usuario(3, "Pedro Pedro"));

        System.out.println("\nEstado inicial:");
        biblioteca.mostrarLibros();
        biblioteca.mostrarUsuarios();

        System.out.println("\nPrestar el libro con ID 1 a usuario con ID 1:");
        biblioteca.prestarLibro(1, 1);

        System.out.println("\nPrestar el mismo libro (ID 1) a otro usuario (ID 2):");
        biblioteca.prestarLibro(1, 2);

        System.out.println("\nPrestar el libro con ID 2 a usuario con ID 2:");
        biblioteca.prestarLibro(2, 2);

        System.out.println("\nEstado de la biblioteca después de préstamos:");
        biblioteca.mostrarLibros();

        System.out.println("\nDevolver el libro con ID 1 con usuario con ID 1:");
        biblioteca.devolverLibro(1,1);

        System.out.println("\nDevolver el libro con ID 3 que no está en préstamo:");
        biblioteca.devolverLibro(3,2);

        System.out.println("\nEstado final:");
        biblioteca.mostrarLibros();
        biblioteca.mostrarUsuarios();
    }
}
