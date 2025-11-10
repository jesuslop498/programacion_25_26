package mm.U3.Tarea3;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres introducir: ");
        int cantidad = teclado.nextInt();

        int [] num = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Numero: " + i + " :");
            num[i] = teclado.nextInt();
        }

        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
