package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();

        System.out.println("Introduce un numero");
        int num2 = teclado.nextInt();

        System.out.println("Introduce un numero");
        int num3 = teclado.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El numero " + num1 + " es el mayor");
            } else {
                System.out.println("El numero " + num3 + " es el mayor");
            }
        } else if (num2 > num3) {
            System.out.println("El mayor es el numero " + num2);
        } else {
            System.out.println("El mayor sera el numero " + num3);
        }
    }
}
