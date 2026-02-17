package mm.U5.EntregableCOAC;

public abstract class Agrupacion implements Comparable<Agrupacion> {

    protected String nombre;
    protected String autor;
    protected String autorMusica;
    protected String autorLetras;
    protected String tipo;

    private static int totalAgrupaciones = 0;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.tipo = tipo;
        totalAgrupaciones++;
    }

    public static int getTotalAgrupaciones() {
        return totalAgrupaciones;
    }

    public abstract void cantar_la_presentacion();

    public void hacer_tipo() {
        System.out.println("La " + this.getClass().getSimpleName() +
                " " + nombre + " va de " + tipo);
    }

    @Override
    public int compareTo(Agrupacion o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Autor: " + autor +
                ", Autor Música: " + autorMusica +
                ", Autor Letras: " + autorLetras +
                ", Tipo: " + tipo;
    }
}

