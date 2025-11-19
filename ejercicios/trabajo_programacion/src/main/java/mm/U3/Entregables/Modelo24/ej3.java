package mm.U3.Entregables.Modelo24;

import java.util.Arrays;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce las filas: ");
        int filas = teclado.nextInt();

        System.out.println("Introduce las columnas: ");
        int columnas = teclado.nextInt();

        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = (int) (Math.random() * 64) + 14;
            }
            System.out.println();
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                System.out.print(tabla[i][j]);
                if (j < columnas - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println();

        int indexp = 0;
        int indexi = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    indexp++;
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    indexi++;
                }
            }
        }

        int[] pares = new int[indexp];
        int[] impares = new int[indexi];
        int sumapares = 0;
        int sumaimpares = 0;
        int contador = 0;
        int mediap = 0;
        int mediai = 0;


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    pares[contador++] = tabla[i][j];
                    sumapares += tabla[i][j];
                    mediap++;
                }
            }
        }

        contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    impares[contador++] = tabla[i][j];
                    sumaimpares += tabla[i][j];
                    mediai++;
                }
            }
        }

        int maxp = tabla[0][0];
        int minp = tabla[0][0];
        int maxi = tabla[0][0];
        int mini = tabla[0][0];

        for (int i = 0; i < pares.length; i++) {
            if (pares[i] > maxp) {
                maxp = pares[i];
            }
        }

        for (int i = 0; i < impares.length; i++) {
            if (impares[i] > maxi) {
                maxi = impares[i];
            }
        }

        for (int i = 0; i < pares.length; i++) {
            if (pares[i] < minp) {
                minp = pares[i];
            }
        }

        for (int i = 0; i < impares.length; i++) {
            if (pares[i] < mini) {
                mini = pares[i];
            }
        }


        System.out.println("Pares: ");
        System.out.println(Arrays.toString(pares));
        System.out.println();

        System.out.println("Impares: ");
        System.out.println(Arrays.toString(impares));
        System.out.println();

        System.out.print("Suma pares: ");
        System.out.print(sumapares);
        System.out.println();

        System.out.print("Suma impares: ");
        System.out.print(sumaimpares);
        System.out.println();

        System.out.print("Media pares: ");
        System.out.print(sumapares / mediap);
        System.out.println();

        System.out.print("Media impares: ");
        System.out.print(sumaimpares / mediai);
        System.out.println();

        System.out.print("Maximo de pares: ");
        System.out.print(maxp);
        System.out.println();

        System.out.print("Minimo de pares: ");
        System.out.print(minp);
        System.out.println();

        System.out.print("Maximo de impares: ");
        System.out.print(maxi);
        System.out.println();

        System.out.print("Minimo de impares: ");
        System.out.print(mini);
        System.out.println();
    }
}
