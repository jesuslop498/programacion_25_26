package mm.U3.Entregables.ModeloTablero;

import java.util.Scanner;

public class ej6p {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] tablero = new String[8][8];
        String[] num = {"8", "7", "6", "5", "4", "3", "2", "1" };
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h" };

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = letras[j] + num[i];
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Escribe la posicion del alfil: ");
        String pos = teclado.nextLine();

        int columna = -1;
        int fila = -1;


        for (int i = 0; i < letras.length; i++) {
            if (pos.substring(0, 1).equalsIgnoreCase(letras[i])) {
                columna = i;
                break;
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (pos.substring(1).equals(num[i])) {
                fila = i;
                break;
            }
        }

        if (columna == -1 && fila == -1) {
            System.out.println("Posicion no valida");
            return;
        }

        System.out.println("Movimientos del alfil desde " + pos + " : ");

        int f = fila, c = columna;
        while (f > 0 && c > 0) {
            f--;
            c--;
            System.out.print(tablero[f][c] + " ");
        }

        f = fila;
        c = columna;
        while (f > 0 && c < 7) {
            f--;
            c++;
            System.out.print(tablero[f][c] + " ");
        }

        f = fila;
        c = columna;
        while (f < 7 && c > 0) {
            f++;
            c--;
            System.out.print(tablero[f][c] + " ");
        }

        f = fila;
        c = columna;
        while (f < 7 && c < 7) {
            f++;
            c++;
            System.out.print(tablero[f][c] + " ");
        }
    }
}
