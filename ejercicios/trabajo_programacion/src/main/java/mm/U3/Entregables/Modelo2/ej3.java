package mm.U3.Entregables.Modelo2;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la dimensión del Array: ");
        int num = teclado.nextInt();

        int[][] a = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                a[i][j] = (int) (Math.random() * (200 - 100 + 1)) + 100;
            }
        }

        System.out.println("Array original:");
        mostrarMatriz(a);

        int[][] r = rotar90(a);

        System.out.println("Array rotado 90 grados:");
        mostrarMatriz(r);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotar90(int[][] matriz) {
        int n = matriz.length;
        int[][] rotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotada[j][n - 1 - i] = matriz[i][j];
            }
        }
        return rotada;
    }
}
