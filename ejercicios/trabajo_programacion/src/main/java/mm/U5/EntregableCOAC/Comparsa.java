package mm.U5.EntregableCOAC;

public class Comparsa extends AgrupacionOficial {

    private String empresaAtrezzo;

    public Comparsa(String nombre, String autor, String autorMusica,
                    String autorLetras, String tipo, int puntos,
                    String empresaAtrezzo) {

        super(nombre, autor, autorMusica, autorLetras, tipo, puntos);
        this.empresaAtrezzo = empresaAtrezzo;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre " + nombre);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La comparsa " + nombre + " va caminito del falla");
    }
}

