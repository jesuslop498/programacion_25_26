package mm.U3.Entregables.ModeloTablero;

import java.util.Arrays;

public class ej8p {
    public static int[] filtraCon8(int x[]) {
        int[] o = new int[x.length];
        int cont = 0;

        for (int num : x) {

            int aux = num;
            boolean tiene8 = false;

            while (aux > 0) {
                if (aux % 10 == 8) {
                    tiene8 = true;
                    break;
                }
                aux /= 10;
            }

            if (tiene8) {
                o[cont] = num;
                cont++;
            }
        }

        return Arrays.copyOf(o, cont);
    }

    public static void main(String[] args) {
        int[] c = {8, 6, 1, 18, 156, 28};

        System.out.println(Arrays.toString(filtraCon8(c)));
    }
}
