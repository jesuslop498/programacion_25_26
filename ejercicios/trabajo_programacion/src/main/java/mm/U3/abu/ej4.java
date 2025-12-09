package mm.U3.abu;

import java.util.Arrays;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe el tamaño del array: ");
        int num = teclado.nextInt();

        int [] vector = new int[num];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (68 - 18 + 1) + 18);
        }

        System.out.println(Arrays.toString(vector));

        System.out.println("Ahora probaremos la funcion de pares/impares: ");
        System.out.println(Arrays.toString(paresImpares(vector)));
    }

    public static int[] paresImpares(int [] v1) {
        int cont = 0;

        int [] res = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] %2 == 0) {
                res[cont++] = v1[i];
            }
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 1) {
                res[cont++] = v1[i];
            }
        }

        return res;
    }

}
