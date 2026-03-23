package mm.U7.PracticasExamen.Filmafinnity;

import java.io.*;
import java.util.*;

public class Filmaffinity implements Serializable {

    private Map<String, Pelicula> peliculas = new HashMap<>();
    private Map<String, Actor> actores = new HashMap<>();

    private Map<Pelicula, Set<Actor>> peliculaActores = new HashMap<>();
    private Map<Actor, Set<Pelicula>> actorPeliculas = new HashMap<>();

    private String claveActor(String nombre, String apellido) {
        return nombre + "_" + apellido;
    }

    public void addPeliculaActor(Pelicula p, Actor a) {
        peliculas.put(p.getTitulo(), p);
        actores.put(claveActor(a.getNombre(), a.getApellido()), a);

        peliculaActores.putIfAbsent(p, new HashSet<>());
        peliculaActores.get(p).add(a);

        actorPeliculas.putIfAbsent(a, new HashSet<>());
        actorPeliculas.get(a).add(p);
    }

    public List<Actor> getActores(Pelicula p) {
        List<Actor> lista = new ArrayList<>(peliculaActores.getOrDefault(p, new HashSet<>()));

        lista.sort(Comparator.comparing(Actor::getApellido));
        return lista;
    }

    public List<Pelicula> getPeliculas(Actor a) {
        List<Pelicula> lista = new ArrayList<>(actorPeliculas.getOrDefault(a, new HashSet<>()));

        lista.sort(Comparator.comparing(Pelicula::getTitulo).reversed());
        return lista;
    }

    public Pelicula getPelicula(String titulo) {
        return peliculas.get(titulo);
    }

    public void removePelicula(String titulo) {
        Pelicula p = peliculas.remove(titulo);
        if (p == null) return;

        Set<Actor> actoresAsociados = peliculaActores.remove(p);

        if (actoresAsociados != null) {
            for (Actor a : actoresAsociados) {
                Set<Pelicula> pelis = actorPeliculas.get(a);
                if (pelis != null) {
                    pelis.remove(p);
                }
            }
        }
    }

    public Actor getActor(String nombre, String apellido) {
        return actores.get(claveActor(nombre, apellido));
    }

    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("filmaffinity.dat"))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Filmaffinity cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("filmaffinity.dat"))) {
            return (Filmaffinity) ois.readObject();
        } catch (Exception e) {
            return new Filmaffinity();
        }
    }
}