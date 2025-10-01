package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();

        if (num%2 == 0) {
            System.out.println("El numero es par");
        }

        if (num%5 == 0) {
            System.out.println("Ademas el numero es divisible por 5");
        }
    }
}
