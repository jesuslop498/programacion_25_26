package mm.U1.Tarea8b;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Altura para la piramide: ");
        int altura = teclado.nextInt();

        for (int i = 0; i < altura-1; i++) {
            for (int j = 0; j < altura*2-1; j++) {
                if (i+j < altura -1 && j-i > altura -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
