package mm.U3.Entregables.ModeloEx;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int espacio = teclado.nextInt();

        int[] fila = new int[espacio];

        for (int i = 0; i < espacio; i++) {
            fila[i] = (int) (Math.random() * 47) + 18;
        }

        System.out.print("Vector creado: ");
        System.out.println(Arrays.toString(fila));
        System.out.print("Vector cambiado: ");
        System.out.print(Arrays.toString(paresImpares(fila)));
    }

    public static int[] paresImpares(int[] v1) {

        int[] result = new int[v1.length];

        int pos = 0;

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 0) {
                result[pos++] = v1[i];
            }
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 1) {
                result[pos++] = v1[i];
            }
        }

        return result;

    }
}
