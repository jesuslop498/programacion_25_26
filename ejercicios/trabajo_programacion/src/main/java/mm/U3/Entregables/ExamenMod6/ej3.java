package mm.U3.Entregables.ExamenMod6;

import java.util.Arrays;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica las filas para el Array: ");
        int fila = teclado.nextInt();
        System.out.println("Indica las columnas para el Array: ");
        int col = teclado.nextInt();

        int[][] tabla = new int[fila][col];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                tabla[i][j] = (int) (Math.random() * (78 - 14 + 1) + 14);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        int contPar = 0;
        int contImpar = 0;
        int[] par = new int[fila + col];
        int[] impar = new int[fila + col];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    par[contPar++] = tabla[i][j];
                }
                if (i % 2 == 1 && j % 2 == 1) {
                    impar[contImpar++] = tabla[i][j];
                }
            }
        }

        par = Arrays.copyOf(par,contPar);
        impar = Arrays.copyOf(impar, contImpar);

        System.out.println("Pares: ");
        System.out.println(Arrays.toString(par));
        System.out.println();
        System.out.println("Impares: ");
        System.out.println(Arrays.toString(impar));

    }
}
