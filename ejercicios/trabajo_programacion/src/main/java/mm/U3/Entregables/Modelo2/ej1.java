package mm.U3.Entregables.Modelo2;

import java.util.Arrays;

public class ej1 {

    public static int[] filtrarPrimos(int[] enteros) {

        int[] result = new int[enteros.length];

        int contador = 0;

        for (int a : enteros) {
            if (esPrimo(a)) {
                result[contador] = a;
                contador++;
            }
        }

        if (contador == 0) {
            return new int[]{-1};
        }

        return Arrays.copyOf(result, contador);

    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] origen = {22, 22, 22, 15, 21, 6};
        System.out.println(Arrays.toString(filtrarPrimos(origen)));
    }
}
