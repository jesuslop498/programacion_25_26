package mm.U3.Entregables.ExamenMod6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ej4 {
    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        String[][] res = new String[filas + 1][columnas];

        int p = 0;

        for (int i = 0; i < res.length; i++) {
            if (i == pos) {
                for (int j = 0; j < columnas; j++) {
                    res[i][j] = fila[j];
                }
            } else {
                for (int j = 0; j < columnas; j++) {
                    res[i][j] = matriz[p][j];
                }
                p++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[][] tabla = new String[3][3];
        char l = 'a';

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = String.valueOf(l++);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        String[] fila = {"j", "k", "l"};

        System.out.print("Introduce una posicion para la nueva fila: ");
        int pos = teclado.nextInt();
        if (pos > tabla.length) {
            System.out.println("Has introducido una posicion invalida. ");
            return;
        }
        System.out.println();

        System.out.println("El resultado es: ");

        String[][] res = insertarFilaEnMatriz(tabla, fila, pos);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
