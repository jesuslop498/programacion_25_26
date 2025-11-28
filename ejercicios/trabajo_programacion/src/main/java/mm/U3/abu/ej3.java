package mm.U3.abu;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la anchura de la J, siendo impar: ");
        int num = teclado.nextInt();

        String [][] j = new String[num][num/2];

        for (int i = 0; i < num/2; i++) {
            for (int k = 0; k < num; k++) {
                if (i == 0 || k == num/2 || i == num /2-1 && k <= num/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
