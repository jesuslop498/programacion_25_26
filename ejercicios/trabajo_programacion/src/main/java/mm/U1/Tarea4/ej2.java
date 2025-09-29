package mm.U1.Tarea4;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduce un numero entero: ");
        int num2 = teclado.nextInt();

        int media = (num1 + num2) / 2;
        System.out.println("La media es: " + media);
    }
}
