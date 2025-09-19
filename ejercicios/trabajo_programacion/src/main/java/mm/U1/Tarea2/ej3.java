package mm.U1.Tarea2;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.println("El resultado de la division es: " + num1 / num2);
    }
}
