package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i + j < altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
