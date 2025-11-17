package mm.U3.Entregables.ModeloTablero;

import java.util.Arrays;

public class ej3 {
    public static int[] filtraCon8(int x[]) {
        if (x.length == 0) {
            return x;
        }

        Arrays.sort(x);

        int cont = 1;

        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1]) {
                cont++;
            }
        }

        int[] result = new int[cont];
        int index = 0;

        result[index++] = x[0];

        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1]) {
                result[index++] = x[i];
            }
        }
        return result;
    }
}

