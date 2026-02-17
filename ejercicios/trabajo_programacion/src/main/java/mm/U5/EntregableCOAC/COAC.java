package mm.U5.EntregableCOAC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class COAC {

    private ArrayList<AgrupacionOficial> agrupaciones;

    public COAC() {
        agrupaciones = new ArrayList<>();
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
        agrupaciones.add(agrupacion);
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
        return agrupaciones.remove(agrupacion);
    }

    public void ordenar_por_puntos() {
        Collections.sort(agrupaciones, Comparator.comparingInt(a -> a.puntos));
    }

    public void ordenar_por_nombre() {
        Collections.sort(agrupaciones);
    }

    public void ordenar_por_autor() {
        Collections.sort(agrupaciones,
                Comparator.comparing(a -> a.autor));
    }

    @Override
    public String toString() {
        return agrupaciones.toString();
    }
}