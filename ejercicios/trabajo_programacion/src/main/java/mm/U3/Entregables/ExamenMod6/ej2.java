package mm.U3.Entregables.ExamenMod6;

import java.util.Arrays;

public class ej2 {
    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        int suma = v1.length + v2.length;

        int[] vec = new int[suma];

        if (pos < 0) {
            vec = v1;
            return Arrays.copyOf(vec, v1.length);
        }

        if (pos > v1.length) {
            vec = v2;
            return Arrays.copyOf(vec, v2.length);
        }

        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < suma; i++) {
            if (i < pos) {
                vec[i] = v1[cont1++];
            }
            if (i >= v2.length + pos) {
                vec[i] = v1[cont1++];
            }
            if (i >= pos && i < v2.length + pos) {
                vec[i] = v2[cont2++];
            }
        }

        return vec;
    }

    public static void main(String[] args) {
        int[] v1 = {1, 3, 4};
        int[] v2 = {2, 5, 6, 4};
        int pos = 1;

        System.out.println("Vectores fusionados: ");
        System.out.println(Arrays.toString(insertarEnVector(v1,v2,pos)));

    }
}
