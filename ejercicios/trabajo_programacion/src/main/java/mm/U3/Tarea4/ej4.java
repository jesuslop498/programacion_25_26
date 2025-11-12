package mm.U3.Tarea4;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] tablero = new String[8][8];
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] num = {"8", "7", "6", "5", "4", "3", "2", "1"};

        for (int x = 0; x < 8; x++) {
            for (int j = 0; j < 8; j++) {
                tablero[x][j] = letras[j] + num[x] + " ";
                System.out.print(tablero[x][j]);
            }
            System.out.println();
        }

        System.out.println("Introduce la posicion del alfil: ");
        String pos = teclado.nextLine();

        int columna = -1;
        int fila = -1;

        for (int x = 0; x < letras.length; x++) {
            if (pos.substring(0, 1).equals(letras[x])) {
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

        int i = columna;
        int j = fila;
        while (i > 0 && j > 0) {
            i--;
            j--;
            System.out.print(tablero[i][j] + " ");
        }

        i = columna;
        j = fila;
        while (i < 7 && j > 0) {
            i++;
            j--;
            System.out.print(tablero[i][j] + " ");
        }

        i = columna;
        j = fila;
        while (i > 0 && j < 7) {
            i--;
            j++;
            System.out.print(tablero[i][j] + " ");
        }

        i = columna;
        j = fila;
        while (i < 7 && j < 7) {
            i++;
            j++;
            System.out.print(tablero[i][j] + " ");
        }
    }
}
