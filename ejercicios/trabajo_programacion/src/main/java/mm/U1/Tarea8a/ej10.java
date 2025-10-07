package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;

        do {
            System.out.print("Introduce un numero entre el 1 y el 10: ");
            num = teclado.nextInt();
        } while (num < 1 || num > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
