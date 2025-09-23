package mm.U1.Tarea5a;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce un numero: ");
        int num2 = teclado.nextInt();

        if (num1%2 == 0) {
            System.out.print("Tu numero es par");
        } else {
            System.out.println("Tu numero es impar");
        }

        if (num2%2 == 0) {
            System.out.print("Tu numero es par");
        } else {
            System.out.println("Tu numero es impar");
        }
    }
}
