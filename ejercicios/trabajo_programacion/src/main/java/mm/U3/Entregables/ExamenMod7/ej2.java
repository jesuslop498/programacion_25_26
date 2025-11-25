package mm.U3.Entregables.ExamenMod7;

import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {

        int[][] x = new int[2][10];

        for (int j = 0; j < x[0].length; j++) {
            x[0][j] = j;
            x[1][j] = (int) (Math.random() * (89 - 12 + 1) + 12);
        }

        System.out.println("Matriz original:");
        System.out.println(Arrays.toString(x[0]));
        System.out.println(Arrays.toString(x[1]));

        int[] par = new int[10];
        int[] impar = new int[10];
        int cont1 = 0, cont2 = 0;


        for (int j = 0; j < x[1].length; j++) {
            if (x[1][j] % 2 == 0) {
                par[cont1++] = x[1][j];
            } else {
                impar[cont2++] = x[1][j];
            }
        }

        par = Arrays.copyOf(par, cont1);
        impar = Arrays.copyOf(impar, cont2);

        int idx = 0;

        for (int n : par) x[1][idx++] = n;
        for (int n : impar) x[1][idx++] = n;

        System.out.println("\nMatriz final (pares primero):");
        System.out.println(Arrays.toString(x[0]));
        System.out.println(Arrays.toString(x[1]));
    }
}
