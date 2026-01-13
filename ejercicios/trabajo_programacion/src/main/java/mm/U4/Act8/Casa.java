package mm.U4.Act8;

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
}
