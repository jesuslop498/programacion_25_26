package mm.U4.U4_Entregable;

import java.util.Arrays;

public class Biblioteca {
    private String nombre;
    private Libro[] libros;
    private static String responsable = "Manolo";

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[0];
    }

    public void addLibros(Libro libro) {
        if (libros.length < 20) {
            libros = Arrays.copyOf(libros, libros.length + 1);
            libros[libros.length - 1] = libro;
        } else {
            System.out.println("Estanterias llenas");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public static String getResponsable() {
        return responsable;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public static void setResponsable(String responsable) {
        Biblioteca.responsable = responsable;
    }

    public void mostrar_libros() {
        System.out.println(Arrays.toString(libros));
    }

    public void mostrar_informacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Responsabel de la biblioteca: " + responsable);
        System.out.println("Libros en biblioteca: ");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i]);
            }
        }
    }
}
