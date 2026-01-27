package mm.U4.Entregables.ObraVivienda;

import java.util.Arrays;

public class Vivienda {

    private String direccion;
    private int metrosCuadrados;
    private Estancias[] estancias;

    public Vivienda(String direccion, int metrosCuadrados) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.estancias = new Estancias[0];
    }

    public void addEstancia(Estancias estancia) {
        estancias = Arrays.copyOf(estancias, estancias.length + 1);
        estancias[estancias.length - 1] = estancia;
    }

    public void eliminarEstancia(int indice) {
        if (indice < 0 || indice >= estancias.length) {
            return;
        }

        Estancias[] nuevo = new Estancias[estancias.length - 1];

        for (int i = 0, j = 0; i < estancias.length; i++) {
            if (i != indice) {
                nuevo[j++] = estancias[i];
            }
        }

        estancias = nuevo;
    }

    public static void mostrarEstancias() {
        System.out.println(Arrays.toString(Estancias.values()));
    }
}

