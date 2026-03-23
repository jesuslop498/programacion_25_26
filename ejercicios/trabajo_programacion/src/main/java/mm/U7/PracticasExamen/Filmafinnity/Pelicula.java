package mm.U7.PracticasExamen.Filmafinnity;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {
    private static int contador = 0;

    private int id;
    private String titulo;
    private int anio;
    private String pais;
    private String genero;
    private String director;

    public Pelicula(String titulo, int anio, String pais, String genero, String director) {
        this.id = ++contador;
        this.titulo = titulo;
        this.anio = anio;
        this.pais = pais;
        this.genero = genero;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula)) return false;
        Pelicula pelicula = (Pelicula) o;
        return titulo.equals(pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ")";
    }
}
