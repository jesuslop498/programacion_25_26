package mm.U3.Tarea4;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] tablero = new String[8][8];
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] num = {"8", "7", "6", "5", "4", "3", "2", "1"};

        for (int fila = 0; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                tablero[fila][col] = letras[col] + num[fila];
                System.out.print(tablero[fila][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Introduce la posición del alfil:");
        String pos = teclado.nextLine();

        int columna = -1;
        int fila = -1;

        for (int x = 0; x < letras.length; x++) {
            if (pos.substring(0, 1).equalsIgnoreCase(letras[x])) {
                columna = x;
                break;
            }
        }

        for (int x = 0; x < num.length; x++) {
            if (pos.substring(1).equals(num[x])) {
                fila = x;
                break;
            }
        }

        if (fila == -1 || columna == -1) {
            System.out.println("Posición no válida.");
            return;
        }

        System.out.println("Movimientos del alfil desde " + pos + ":");

        int f = fila, c = columna;
        while (f > 0 && c > 0) {
            f--; c--;
            System.out.print(tablero[f][c] + " ");
        }

        f = fila; c = columna;
        while (f > 0 && c < 7) {
            f--; c++;
            System.out.print(tablero[f][c] + " ");
        }

        f = fila; c = columna;
        while (f < 7 && c > 0) {
            f++; c--;
            System.out.print(tablero[f][c] + " ");
        }

        f = fila; c = columna;
        while (f < 7 && c < 7) {
            f++; c++;
            System.out.print(tablero[f][c] + " ");
        }
    }
}
