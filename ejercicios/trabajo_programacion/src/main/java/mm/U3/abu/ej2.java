package mm.U3.abu;

import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x = 5;
        int y = 5;

        int [][] tabla = new int[x][y];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = (int) (Math.random() * (10));
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Introduce el numero de desplazamientos: ");
        int num = teclado.nextInt();

        System.out.println("La matriz desplazada quedaria: ");
        System.out.print(Arrays.deepToString(desplazar(tabla, num)));

    }

    public static int [][] desplazar (int [][] tab, int des) {

        des = des % tab.length;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                int nuevaCol = (j + des) % tab.length;
                tab[i][nuevaCol] = tab[i][j];
            }
        }

        return tab;
    }
}
