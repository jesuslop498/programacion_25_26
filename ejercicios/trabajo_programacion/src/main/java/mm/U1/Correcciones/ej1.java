package mm.U1.Correcciones;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura para las Zs: ");
        int altura = teclado.nextInt();

        while (altura < 3 || altura % 2 == 0) {
            System.out.println("Introduce una altura correcta: ");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 + 3; j++) {
                if (i == 0 && j > altura + 2 || i == 0 && j < altura ||
                        i + j == altura - 1 || i + j == altura * 2 + 2 ||
                        i == altura - 1 && j > altura + 2 || i == altura - 1 && j < altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}