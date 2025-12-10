package mm.U3.examen_U3;

import java.util.Arrays;

public class ej1 {
    public static void main(String[] args) {
        System.out.println("Vamos a mezclar vectores: ");

        int[] v1 = {8, 9, 0};
        int[] v2 = {1, 2, 3};
        System.out.println("Prueba 1: ");
        System.out.println(Arrays.toString(mezcla(v1, v2)));

        int[] v3 = {4, 3};
        int[] v4 = {7, 8, 9, 10};
        System.out.println("Prueba 2:");
        System.out.println(Arrays.toString(mezcla(v3, v4)));

        int[] v5 = {8, 9, 0, 3};
        int[] v6 = {1};
        System.out.println("Prueba 3: ");
        System.out.println(Arrays.toString(mezcla(v5, v6)));

        int [] v7 ={ };
        int [] v8 = {1, 2, 3};
        System.out.println("Prueba 4: ");
        System.out.println(Arrays.toString(mezcla(v7, v8)));
    }

    public static int[] mezcla(int[] a, int[] b) {

        int[] res = new int[a.length + b.length];

        int contA = 0;
        int auxA = 0;
        int auxB = 0;
        for (int i = 0; i < res.length; i++) {
            if (auxA < a.length) {
                res[contA++] = a[auxA++];
            }

            if (auxB < b.length) {
                res[contA++] = b[auxB++];
            }
        }

        return res;
    }
}
