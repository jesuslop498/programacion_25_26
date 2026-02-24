package mm.U5.Lopez_Hidalgo_U5_Sevilla;

public class SemanaSanta extends Evento{

    private PasoProcesional[] pasos = new PasoProcesional[15];

    public SemanaSanta(String codigoIdn, String fechaCelebracion, String nombre, Coordinador coordinador) {
        super(codigoIdn, fechaCelebracion, nombre, coordinador);
    }


    public void addPaso(PasoProcesional paso) {
        for (int i = 0; i < pasos.length; i++) {
            if (pasos[i] == null) {
            pasos[i] = paso;
            break;
            }
        }
    }

    public void deletePaso(PasoProcesional paso) {
        int contador = 0;

        PasoProcesional[] nuevo = new PasoProcesional[pasos.length - 1];

        for (int i = 0; i < pasos.length; i++) {
            if (pasos[i] == paso) {
                break;
            } else {
                nuevo[contador++] = pasos[i];
            }
        }

        pasos = nuevo;
    }

    public PasoProcesional[] getPasos() {
        return pasos;
    }

    public void setPasos(PasoProcesional[] pasos) {
        this.pasos = pasos;
    }

    @Override
    public void celebrar() {
        System.out.println("Celebrando Semana Santa con " + pasos.length);
    }
}
