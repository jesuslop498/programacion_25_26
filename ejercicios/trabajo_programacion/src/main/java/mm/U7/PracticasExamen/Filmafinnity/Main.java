package mm.U7.PracticasExamen.Filmafinnity;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Filmaffinity f = new Filmaffinity();

        // Películas
        Pelicula p1 = new Pelicula("Inception", 2010, "USA", "Sci-Fi", "Nolan");
        Pelicula p2 = new Pelicula("Titanic", 1997, "USA", "Drama", "Cameron");
        Pelicula p3 = new Pelicula("Gladiator", 2000, "USA", "Acción", "Scott");
        Pelicula p4 = new Pelicula("Avatar", 2009, "USA", "Sci-Fi", "Cameron");
        Pelicula p5 = new Pelicula("Matrix", 1999, "USA", "Sci-Fi", "Wachowski");

        // Actores
        Actor a1 = new Actor("Leonardo", "DiCaprio", "USA");
        Actor a2 = new Actor("Kate", "Winslet", "UK");
        Actor a3 = new Actor("Russell", "Crowe", "NZ");
        Actor a4 = new Actor("Keanu", "Reeves", "Canada");
        Actor a5 = new Actor("Sam", "Worthington", "Australia");

        // Relaciones
        f.addPeliculaActor(p1, a1);
        f.addPeliculaActor(p2, a1);
        f.addPeliculaActor(p2, a2);
        f.addPeliculaActor(p3, a3);
        f.addPeliculaActor(p5, a4);
        f.addPeliculaActor(p4, a5);

        // Pruebas
        System.out.println("Actores en Titanic:");
        List<Actor> actores = f.getActores(p2);
        actores.forEach(System.out::println);

        System.out.println("\nPelículas de Leonardo DiCaprio:");
        List<Pelicula> pelis = f.getPeliculas(a1);
        pelis.forEach(System.out::println);

        // Guardar
        f.guardarDatos();

        // Cargar
        Filmaffinity f2 = Filmaffinity.cargarDatos();
        System.out.println("\nPelícula buscada: " + f2.getPelicula("Matrix"));
    }
}
