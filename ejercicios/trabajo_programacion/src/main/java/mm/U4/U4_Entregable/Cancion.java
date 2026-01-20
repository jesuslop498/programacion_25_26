package mm.U4.U4_Entregable;

public class Cancion {
    private String titulo;
    private double duracion;
    private genero genero;
    private Cantante autor;

    public Cancion(String titulo, double duracion, genero genero, Cantante autor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public genero getGenero() {
        return genero;
    }

    public Cantante getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setGenero(genero genero) {
        this.genero = genero;
    }

    public void setAutor(Cantante autor) {
        this.autor = autor;
    }

    public void mostrar_informacion() {
        System.out.println("      Título: " + titulo);
        System.out.println("      Duración: " + duracion);
        System.out.println("      Género: " + genero);
        System.out.println("      Autor: " + autor.getNombreArtistico());
    }



}
