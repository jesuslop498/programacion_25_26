package mm.U3.Entregables.ModeloTablero;

import java.util.Arrays;

public class ej4 {

    public static void main(String[] args) {

        String prueba = "158759";

        System.out.println("Ahora el array, con dicho String: ");
        System.out.println(Arrays.toString(convierteArrayEnString(prueba)));

        int[] x = new int[prueba.length()];
    }

    public static int[] convierteArrayEnString(String a) {

        int[] x = new int[a.length()];

        for (int i = 0; i < a.length(); i++) {
            x[i] = a.charAt(i) - '0';
        }

        return x;
    }
}
