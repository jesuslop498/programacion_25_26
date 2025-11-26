package mm.U3.abu;

import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce las filas: ");
        int x = teclado.nextInt();

        System.out.println("Introduce las columnas: ");
        int y = teclado.nextInt();

        int[][] p = new int[x][y];

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                p[i][j] = (int) (Math.random() * (100 - 50 + 1) + 50);
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("A continuacion vamos a ver la diagonal ordenada de menor a mayor: ");
        System.out.println(Arrays.toString(orden(p)));
        System.out.println("A continuacion vamos a ver el minimo: ");
        System.out.println(minimo(p));

    }

    public static int[] orden(int[][] a) {

        int[] x = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    x[i] = a[i][j];
                }
            }
        }

        Arrays.sort(x);

        return x;
    }

    public static int minimo(int[][] a) {

        int[] x = orden(a);

        int minimo = 101;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < minimo) {
                minimo = x[i];
            }
        }

        return minimo;
    }
}
