package mm.U1.Tarea8b;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = teclado.nextInt();

        System.out.println(" n | n^2 | n^3");

        for (int i = num; i < num + 5; i++) {
            System.out.println(" " + i + " | " + (i * i) + " | " + (i * i * i));
        }
    }
}