package mm.U1.Tarea5a;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce un numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Introduce un numero: ");
        int num3 = teclado.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es el numero: " + num1);
            } else {
                System.out.println("El mayor es el numero: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("El mayor es el numero: " + num2);
            } else {
                System.out.println("El mayor es el numero: " + num3);
            }
        }

    }
}
