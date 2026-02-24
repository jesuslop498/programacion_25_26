package mm.U5.Lopez_Hidalgo_U5_Sevilla;

public class FeriaSevilla extends Evento{

    private Caseta[] feria= new Caseta[10];


    public FeriaSevilla(String codigoIdn, String fechaCelebracion, String nombre, Coordinador coordinador) {
        super(codigoIdn, fechaCelebracion, nombre, coordinador);
    }

    public void addCaseta(Caseta caseta) {
        for (int i = 0; i < feria.length; i++) {
            if (feria[i]== null) {
                feria[i] = caseta;
            }
            break;
        }
    }

    public void deleteCaseta(Caseta caseta) {
        Caseta [] nuevo = new Caseta[feria.length - 1];

        int cont = 0;
        for (int i = 0; i < feria.length; i++) {
            if (feria[i].equals(caseta)) {
            } else {
                nuevo[cont++] = feria[i];
            }
        }

        feria = nuevo;
    }

    @Override
    public void celebrar() {
        System.out.println("Celebrando Feria con " + feria.length +  " casetas");
    }
}
