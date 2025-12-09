package mm.U3.abu;

import java.util.Arrays;

public class ej5 {
    public static void main(String[] args) {
        System.out.println("Creamos un array:  ");

        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (11));
        }

        System.out.println(Arrays.toString(vector));

        System.out.println();
        System.out.print("Vamos a comprobar si existe alguna repiticon: ");
        System.out.println(duplicados(vector));
        System.out.println();
        System.out.println("Vamos a comprobar si conseguimos eliminar los duplicados: ");
        System.out.println(Arrays.toString(eliminaDuplicados(vector)));

    }

    public static boolean duplicados(int[] v1) {
        boolean res = false;

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1.length; j++) {
                if (i != j) {
                    if (v1[i] == v1[j]) {
                        res = true;
                    }
                }
            }
        }

        return res;
    }

    public static int[] eliminaDuplicados(int[] v1) {
        int[] aux = new int[v1.length];
        int cont = 0;

        for (int i = 0; i < v1.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < cont; j++) {
                if (aux[j] == v1[i]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                aux[cont++] = v1[i];
            }
        }

        return Arrays.copyOf(aux, cont);
    }


}
