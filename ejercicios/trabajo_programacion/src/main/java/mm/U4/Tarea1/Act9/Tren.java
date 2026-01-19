package mm.U4.Tarea1.Act9;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private int numVagones;
    private Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new Vagon[5]; // máximo 5 vagones
        this.numVagones = 0;
    }

    public void agregarVagon(int capacidadMaxima, int cargaActual, String tipoMercancia) {
        if (numVagones < 5) {
            vagones[numVagones++] = new Vagon(capacidadMaxima, cargaActual, tipoMercancia);
        }
    }
}

