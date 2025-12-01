package mm.U3.Entregables.ExamenMod9;

import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {
        System.out.println("Creamos un array:  ");

        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (11));
            System.out.print(vector[i] + " ");
        }

        System.out.println();

        System.out.print("Comprobemos si hay algun repetido: ");
        System.out.println(duplicados(vector));

        System.out.println("Ahora veamos el array sin repetidos: ");
        System.out.println(Arrays.toString(eliminaDuplicados(vector)));
    }

    public static boolean duplicados(int[] v1) {
        for (int i = 0; i < v1.length; i++) {
            for (int j = i + 1; j < v1.length; j++) {
                if (v1[i] == v1[j]) {
                    return true;
                }
            }
        }
        return false;
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
