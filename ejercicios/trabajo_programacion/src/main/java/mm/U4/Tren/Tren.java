package mm.U4.Tren;

public class Tren {
    private Locomotora locomotora;
    private Vagones[] vagones;
    private int numVagones;
    private Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new Vagones[5];
        this.numVagones = 0;
    }

    public void agregarVagon (int capacidadMaxima, int cargaActual, String tipoMercancia) {
        if (numVagones < 5) {
            vagones[numVagones++] = new Vagones(capacidadMaxima, cargaActual, tipoMercancia);
        }
    }
}
