package mm.U5.EntregableCOAC;

public class Chirigota extends AgrupacionOficial implements Callejera {

    private int numCuples;

    public Chirigota(String nombre, String autor, String autorMusica,
                     String autorLetras, String tipo, int puntos,
                     int numCuples) {

        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.numCuples = numCuples;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + nombre);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La chirigota " + nombre + " va caminito del falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + nombre);
    }
}

