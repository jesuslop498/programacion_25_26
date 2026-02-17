package mm.U5.EntregableCOAC;

public class Coro extends AgrupacionOficial {

    private int numBandurrias;
    private int numGuitarras;

    public Coro(String nombre, String autor, String autorMusica,
                String autorLetras, String tipo, int puntos,
                int numBandurrias, int numGuitarras) {

        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre " + nombre);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El coro " + nombre + " va caminito del falla");
    }
}

