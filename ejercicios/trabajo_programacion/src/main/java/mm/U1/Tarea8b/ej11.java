package mm.U1.Tarea8b;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura para x: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i + j == altura - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
