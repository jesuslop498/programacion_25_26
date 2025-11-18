package mm.U3.Entregables.Modelo5;

import java.util.Arrays;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero para generar un array bidimensional cuadrado: ");
        int x = teclado.nextInt();

        int[][] tabla = new int[x][x];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = (int) (Math.random() * (68 - 18 + 1) + 18);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        int[] diagonal = new int[x];
        int max = 18;
        int min = 68;
        int suma = 0;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if (i == j) {
                    diagonal[i] = tabla[i][j];
                    if (diagonal[i] > max) {
                        max = diagonal[i];
                    } else if (diagonal[i] < min) {
                        min = diagonal[i];
                    }
                    suma += diagonal[i];
                }
            }
        }

        int media = suma/x;

        System.out.println();
        System.out.println("Los numeros de la diagonal son: " + Arrays.toString(diagonal));
        System.out.println("El numero maximo de dicha diagonal es: " + max);
        System.out.println("El numero minimmo de dicho diagonal es: " + min);
        System.out.print("La media de la diagonal es: " + media);
    }
}
