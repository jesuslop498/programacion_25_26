package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int num = teclado.nextInt();

        for (int i = 1; i < num; i++) {
            System.out.println(i);
        }
    }
}
