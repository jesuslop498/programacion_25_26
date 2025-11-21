package mm.U3.Entregables.ModeloTablero;

import java.util.Arrays;

public class ej10p {
    public static int[] aleatorioDeArray(int a, int b, int cantidad) {
        int[] x = new int[cantidad];

        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        return x;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(aleatorioDeArray(10,20,10)));
    }
}
