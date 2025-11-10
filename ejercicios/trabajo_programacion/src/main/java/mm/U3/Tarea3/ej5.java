package mm.U3.Tarea3;

import java.util.Arrays;

public class ej5 {
    public static void main(String[] args) {

        int[] a = {5, 2, 6, 4, 2, 8};
        Arrays.sort(a);

        int[] b = {3, 7, 4, 5, 6, 1};
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] fusionado = new int[12];

        int i = 0, j = 0, k= 0;

        while (i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                fusionado[k++] = a[i++];
            } else {
                fusionado[k++] = b[j++];
            }
        }

        while (i < a.length) {
            fusionado[k++] = a[i++];
        }

        while (j < b.length) {
            fusionado[k++] = b[j++];
        }

        System.out.println(Arrays.toString(fusionado));
    }
}
