package mm.U3.Tarea4;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] a = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 501);
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        int n = teclado.nextInt();

        int min = 500;
        int max = 0;
        if (n == 1) {
            for (int j : a) {
                if (j < min) {
                    min = j;
                }
            }
        } else {
            for (int j : a) {
                if (j > max) {
                    max = j;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for (int i : a) {

            if (i == max) {
                System.out.print("**" + i + "** ");
            } else if (i == min) {
                System.out.print("**" + i + "** ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
