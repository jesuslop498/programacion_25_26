package mm.U3.examen_U3;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] tabla = new int[4][5];


        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print("Escribe un numero para la posicion " + i + " " + j + " :");
                tabla[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Vamos a observar la tabla sin realizar calculos: ");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        int[][] calculo = new int[5][6];

        System.out.println();
        System.out.println();
        System.out.println("Vamos a observar la tabla con los calculos realizados: ");
        int sumFila = 0;
        int sumCol = 0;
        int total = 0;

//        Creacion de la nueva tabla y los totales de las filas
        for (int i = 0; i < calculo.length; i++) {
            sumFila = 0;
            for (int j = 0; j < calculo[0].length; j++) {
                if (i < tabla.length && j < tabla[0].length) {
                    calculo[i][j] = tabla[i][j];
                    sumFila += calculo[i][j];
                }

                if (j == calculo[0].length - 1 && i < calculo.length - 1) {
                    calculo[i][j] = sumFila;
                }
            }
        }

//        Totales de las columnas
        for (int j = 0; j < calculo[0].length; j++) {
            sumCol = 0;
            for (int i = 0; i < calculo.length; i++) {
                if (j < calculo.length && i < calculo[0].length) {
                    sumCol += calculo[i][j];
                }
                if (i == calculo.length - 1 && j < calculo[0].length - 1) {
                    calculo[i][j] = sumCol;
                }

            }
        }

//        Total
        for (int i = 0; i < calculo.length; i++) {
            for (int j = 0; j < calculo[0].length; j++) {
                if (i == calculo.length - 1 && j < calculo[0].length - 1) {
                    total+= calculo[i][j];
                }

                if (j == calculo[0].length - 1 && i < calculo.length - 1) {
                    total+= calculo[i][j];
                }

                calculo[calculo.length - 1][calculo[0].length - 1] = total;
            }
        }

        for (int i = 0; i < calculo.length; i++) {
            for (int j = 0; j < calculo[0].length; j++) {
                System.out.print(calculo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
