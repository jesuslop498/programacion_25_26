package mm.U3.Tarea4;

import java.util.Arrays;

public class ej5 {
    public static void main(String[] args) {

        int [][]tabla = new int[10][10];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = (int) (Math.random() * (300 - 200 + 1 )) + 200;
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int [] diagonal = new int[10];
        int x = 0;
        int y = 0;
        int suma = 0;
        while (x <=  9 && y <= 10) {
            System.out.print(tabla[x][y] + " ");
            diagonal[x] = tabla[x][y];
            suma += tabla[x][y];
            x++;
            y++;
        }

        Arrays.sort(diagonal);

        System.out.println();
        System.out.println("El numero mas grande es: " + diagonal[9]);
        System.out.println("El numero mas pequeño es: " + diagonal[0]);
        System.out.println("La media es: " + suma/10);
    }
}
