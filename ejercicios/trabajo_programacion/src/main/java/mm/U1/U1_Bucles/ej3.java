package mm.U1.U1_Bucles;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura para el reloj de arena: ");
        int altura = teclado.nextInt();
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: la altura debe ser un número impar mayor o igual que 5.");
            return;
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == altura - 1 || i <= j && i + j <= altura - 1 || i >= j && i + j >= altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
