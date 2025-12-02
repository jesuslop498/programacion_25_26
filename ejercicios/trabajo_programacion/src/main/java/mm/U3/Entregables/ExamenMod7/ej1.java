package mm.U3.Entregables.ExamenMod7;

import java.util.Scanner;

public class ej1 {
    public static boolean esPuntoDeSilla(int[][] x, int i, int j) {
        int valor = x[i][j];

        for (int col = 0; col < x[0].length; col++) {
            if (x[i][col] < valor) {
                return false;
            }
        }

        for (int fila = 0; fila < x.length; fila++) {
            if (x[fila][j] > valor) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero de filas: ");
        int filas = teclado.nextInt();

        System.out.println("Introduce un numero de columnas: ");
        int columnas = teclado.nextInt();

        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = (int) (Math.random() * (1003 - 11 + 1) + 11);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("Introduce la fila a comprobar: ");
        int i = teclado.nextInt();
        System.out.print("Introduce la columna a comprobar: ");
        int y = teclado.nextInt();
        System.out.print("Comprobemos el punto de silla: ");
        System.out.println(esPuntoDeSilla(tabla, i, y));
    }
}
