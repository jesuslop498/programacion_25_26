package mm.U3.Entregables.Modelo5;

import java.util.Arrays;

public class ej1 {
    public static void main(String[] args) {
        int[] x = {9, 5, 4, 6, 2, 7, 8, 1, 3};
        int[] y = {7, 6, 1, 4, 5, 2, 3, 8, 9};

        System.out.println("Coincidencias ordenadas: ");
        System.out.println(Arrays.toString(interseccionVectores(x, y)));
    }

    public static int[] interseccionVectores(int[] a, int[] b) {

        int[] res = new int[a.length];
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int temp = a[i];
                if (temp == b[j]) {
                    res[cont++] = temp;
                }
            }
        }

        int[] ints = Arrays.copyOf(res, cont);
        Arrays.sort(ints);
        return ints;
    }
}
