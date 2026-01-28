package mm.U4.U4_Entregable;

public class Capitulo {
    private int numeroCapitulo;
    private String tituloCapitulo;
    private Formato formato;

    public Capitulo(int numeroCapitulo, String tituloCapitulo, Formato formato) {
        this.numeroCapitulo = numeroCapitulo;
        this.tituloCapitulo = tituloCapitulo;
        this.formato = formato;
    }

    public int getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public String getTituloCapitulo() {
        return tituloCapitulo;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setNumeroCapitulo(int numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Capitulo{" +
                "numeroCapitulo=" + numeroCapitulo +
                ", tituloCapitulo='" + tituloCapitulo + '\'' +
                ", formato=" + formato +
                '}';
    }

    public void mostrar_informacion() {
        System.out.println("Numero del capitulo: " + numeroCapitulo);
        System.out.println("Titulo del capitulo: " + tituloCapitulo);
        System.out.println("Formato del capitulo: " + formato);
    }
}
