package mm.U4.Tarea1.Act8;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private List<Bombilla> bombillas;
    private List<Boolean> estadoPrevioBombillas;
    private boolean luzGeneralActivada;

    public Casa(int cantidadBombillas) {
        bombillas = new ArrayList<>();
        estadoPrevioBombillas = new ArrayList<>();
        for (int i = 0; i < cantidadBombillas; i++) {
            bombillas.add(new Bombilla());
            estadoPrevioBombillas.add(false);
        }
        luzGeneralActivada = false;
    }

    public void activarLuzGeneral() {
        luzGeneralActivada = true;
        restaurarEstadoBombillas();
    }

    public void desactivarLuzGeneral() {
        luzGeneralActivada = false;
        guardarEstadoBombillas();
        apagarTodasLasBombillas();
    }

    private void restaurarEstadoBombillas() {
        for (int i = 0; i < bombillas.size(); i++) {
            if (estadoPrevioBombillas.get(i)) {
                bombillas.get(i).encender();
            } else {
                bombillas.get(i).apagar();
            }
        }
    }

    private void guardarEstadoBombillas() {
        for (int i = 0; i < bombillas.size(); i++) {
            estadoPrevioBombillas.set(i, bombillas.get(i).estaEncendida());
        }
    }

    private void apagarTodasLasBombillas() {
        for (Bombilla bombilla : bombillas) {
            bombilla.apagar();
        }
    }

    public void controlarBombilla(int indice, boolean encender) {
        if (indice >= 0 && indice < bombillas.size()) {
            if (luzGeneralActivada) {
                if (encender) {
                    bombillas.get(indice).encender();
                } else {
                    bombillas.get(indice).apagar();
                }
            }
        }
    }

    public void controlarInterruptorBombilla(int indice, boolean activar) {
        if (indice >= 0 && indice < bombillas.size()) {
            if (activar) {
                bombillas.get(indice).activarInterruptor();
            } else {
                bombillas.get(indice).desactivarInterruptor();
            }
        }
    }

    public void mostrarEstadoBombillas() {
        for (int i = 0; i < bombillas.size(); i++) {
            System.out.println("Bombilla " + (i + 1) + ": " + bombillas.get(i).estado());
        }
    }
}
