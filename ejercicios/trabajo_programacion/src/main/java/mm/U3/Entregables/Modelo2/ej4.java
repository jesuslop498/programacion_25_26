package mm.U3.Entregables.Modelo2;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño del tablero: ");
        int size = teclado.nextInt();

        String[][] tablero = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int temp = (int) (Math.random() * 2); // 0 o 1
                if (temp == 0) {
                    tablero[i][j] = " x ";
                } else {
                    tablero[i][j] = " - ";
                }
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        boolean bomba = false;

        System.out.println("Introduce coordenadas (x y) entre 0 y " + (size - 1));

        do {
            System.out.print("Posición: ");
            int x = teclado.nextInt();
            int y = teclado.nextInt();
            int bombasCercanas = 0;

            if (x < 0 || x >= size || y < 0 || y >= size) {
                System.out.println("Coordenadas fuera del tablero. Intenta de nuevo.");
                continue;
            }

            if (tablero[x][y].equals(" x ")) {
                bomba = true;
                System.out.println("Has encontrado una bomba");
            } else {
                System.out.println("Casilla segura.");
                if (x + 1 < size && tablero[x + 1][y].equals(" x ")) bombasCercanas++;
                if (x - 1 >= 0 && tablero[x - 1][y].equals(" x ")) bombasCercanas++;
                if (y + 1 < size && tablero[x][y + 1].equals(" x ")) bombasCercanas++;
                if (y - 1 >= 0 && tablero[x][y - 1].equals(" x ")) bombasCercanas++;
                if (x + 1 < size && y + 1 < size && tablero[x + 1][y + 1].equals(" x ")) bombasCercanas++;
                if (x - 1 >= 0 && y - 1 >= 0 && tablero[x - 1][y - 1].equals(" x ")) bombasCercanas++;
                if (x + 1 < size && y - 1 >= 0 && tablero[x + 1][y - 1].equals(" x ")) bombasCercanas++;
                if (x - 1 >= 0 && y + 1 < size && tablero[x - 1][y + 1].equals(" x ")) bombasCercanas++;
                System.out.println("La posición " + x + "," + y + " tiene " + bombasCercanas + " bombas en los alrededores");
            }
            bombasCercanas = 0;

        } while (!bomba);

        teclado.close();
    }
}
