package mm.U3.Entregables.Modelo5;

import java.util.Arrays;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[][] a = new int[3][3];

        System.out.println("Array bidimensional original: ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * (11));
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Introduce el desplazamiento deseado: ");
        int des = teclado.nextInt();

        System.out.println("El resultado es: ");
        System.out.println(Arrays.deepToString(desplazarMatriz(a, des)));
    }

    public static int[][] desplazarMatriz(int[][] a, int desplazar) {

        int n = a.length;
        int[][] rotar = new int[n][n];

        desplazar = desplazar % n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                int nuevaCol = (j + desplazar) % n;
//                rotar[i][nuevaCol] = a[i][j];
            }
        }
        return rotar;
    }
}
