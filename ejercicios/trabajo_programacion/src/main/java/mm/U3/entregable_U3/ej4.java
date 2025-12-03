package mm.U3.entregable_U3;

import java.util.Scanner;

public class ej4 {
    public static int nEsimo(int[][] n, int posicion){
        int aux = -1;
        int res = -1;

        for (int[] ints : n) {
            for (int j = 0; j < n[0].length; j++) {
                aux++;
                if (posicion == aux) {
                    res = ints[j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [][] tabla = new int [4][6];

        System.out.println("Aqui podemos ver la tabla generada: ");

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = (int) (Math.random() * (100 - 10 + 1) + 10);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Introduce un numero para el nEsimo: ");
        int num = teclado.nextInt();

        System.out.println("Su correspondencia es: ");
        System.out.println(nEsimo(tabla, num));
    }
}
