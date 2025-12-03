package mm.U3.entregable_U3;

import java.util.Scanner;

public class ej3 {
    public static boolean jaque(String posRey, String posReina) {
        String[][] tablero = new String[8][8];
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] num = {"8", "7", "6", "5", "4", "3", "2", "1"};

        for (int fila = 0; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                tablero[fila][col] = letras[col] + num[fila];
            }
        }

        int columna = -1;
        int fila = -1;

        for (int x = 0; x < letras.length; x++) {
            if (posReina.substring(0, 1).equalsIgnoreCase(letras[x])) {
                columna = x;
                break;
            }
        }

        for (int x = 0; x < num.length; x++) {
            if (posReina.substring(1).equals(num[x])) {
                fila = x;
                break;
            }
        }

        int columnaRey = -1;
        int filaRey = -1;

        for (int x = 0; x < letras.length; x++) {
            if (posRey.substring(0, 1).equalsIgnoreCase(letras[x])) {
                columnaRey = x;
                break;
            }
        }

        for (int x = 0; x < num.length; x++) {
            if (posRey.substring(1).equals(num[x])) {
                filaRey = x;
                break;
            }
        }

//Comprobacion de las diagonales.
        int f = fila, c = columna;
        while (f > 0 && c > 0) {
            f--;
            c--;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }

        f = fila;
        c = columna;
        while (f > 0 && c < 7) {
            f--;
            c++;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }

        f = fila;
        c = columna;
        while (f < 7 && c > 0) {
            f++;
            c--;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }

        f = fila;
        c = columna;
        while (f < 7 && c < 7) {
            f++;
            c++;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }

//Comprobacion de las horizontales/verticales.
        f = fila;
        c = columna;
        while (c > 0) {
            c--;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }
        c = columna;
        while (c < 7) {
            c++;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }
        c = columna;
        while (f > 0) {
            f--;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }
        f = fila;
        while (f < 7) {
            f++;
            if (f == filaRey && c == columnaRey) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("A continuaacion veras el tablero: ");
        System.out.println();
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

        System.out.println("Introduce la posicion del rey: ");
        String rey = teclado.nextLine();

        System.out.println("Introduce la posicion de la reina: ");
        String reina = teclado.nextLine();

        System.out.println("Ahora vamos a comprobar si se encuentra en posicion de jaque: ");
        System.out.println(jaque(rey, reina));
    }

}
