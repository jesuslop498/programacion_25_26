package mm.U4.U4_Entregable;

import java.util.Arrays;

public class Libro {
    private String tiulo;
    private String autor;
    private int anioPublicacion;
    private Capitulo[] capitulos;

    public Libro(String tiulo, String autor, int anioPublicacion) {
        this.tiulo = tiulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.capitulos = new Capitulo[0];
    }

    public void addCapitulo(Capitulo capitulo) {
        boolean comprobador = false;

        for (int i = 0; i < capitulos.length; i++) {
            if (capitulo.getNumeroCapitulo() == capitulos[i].getNumeroCapitulo()) {
                comprobador = true;
            }
        }

        if (capitulos.length < 30 && !comprobador) {
            capitulos = Arrays.copyOf(capitulos, capitulos.length + 1);
            capitulos[capitulos.length - 1] = capitulo;
        } else {
            System.out.println("Error, libro completo o numero de capitulo erroneo.");
        }
    }

    public void eliminarCapitulo(int numeroCapitulo) {
        if (numeroCapitulo < 0) {
            return;
        }

        Capitulo[] nuevo = new Capitulo[capitulos.length - 1];
        int cont = 0;

        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i].getNumeroCapitulo() != numeroCapitulo) {
                nuevo[cont++] = capitulos[i];
            }
        }

        capitulos = nuevo;
    }

    public String getTiulo() {
        return tiulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setTiulo(String tiulo) {
        this.tiulo = tiulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public void mostrar_capitulos() {
        System.out.println(Arrays.toString(capitulos));
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tiulo='" + tiulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", capitulos=" + Arrays.toString(capitulos) +
                '}';
    }

    public void mostrar_informacion() {
        System.out.println("Titulo: " + tiulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("Capitulos del libro: ");
        for (int i = 0; i < capitulos.length; i++) {
            System.out.println(capitulos[i]);
        }
    }
}
