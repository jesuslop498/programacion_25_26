package mm.U3.Entregables.ModeloTablero;

import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {
        int [] a = {8, 18, 9, 12, 28};

        System.out.println(Arrays.toString(filtraCon8(a)));
    }

    public static int[] filtraCon8(int[] x) {

        int[] temp = new int[x.length];
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
                temp[cont] = num;
                cont++;
            }
        }

        return Arrays.copyOf(temp, cont);
    }
}
