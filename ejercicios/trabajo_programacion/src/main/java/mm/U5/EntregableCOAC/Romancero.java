package mm.U5.EntregableCOAC;

public class Romancero extends Agrupacion implements Callejera {

    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica,
                     String autorLetras, String tipo, String tematicaCartelon) {

        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre " + nombre);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero " + nombre);
    }
}

