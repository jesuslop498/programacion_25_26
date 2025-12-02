package mm.U3.Entregables.ExamenMod9;

import java.util.Arrays;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        String frase = "Hola que tal estás hoy martes?";

        char [][] matriz = matrizLetras(frase);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] matrizLetras(String frase) {

        String compacta = frase.replace(" ", "");
        int cols = 5;

        int filas = (int) Math.ceil(compacta.length() / (double) cols);

        char[][] matriz = new char[filas][cols];

        int cont = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                if (cont < compacta.length()) {
                    matriz[i][j] = compacta.charAt(cont++);
                } else {
                    matriz[i][j] = '\0';
                }
            }
        }

        return matriz;
    }
}
