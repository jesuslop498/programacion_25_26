package mm.U3.Entregables.ExamenMod9;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el tamaño para el array: ");
        int num = teclado.nextInt();

        int[] vector = new int[num];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (65 - 18 + 1) + 18);
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        System.out.println("Promabos la funcion: ");
        System.out.println(Arrays.toString(paresImpares(vector)));

    }

    public static int[] paresImpares(int[] v1) {
        int[] res = new int[v1.length];

        int cont = 0;
        //Añadiremos los pares
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 0) {
                res[cont++] = v1[i];
            }
        }

        //Añadimos los impares
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 1) {
                res[cont++] = v1[i];
            }
        }

        return res;
    }
}
