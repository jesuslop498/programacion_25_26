package mm.U1.Tarea4;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        short num1 = teclado.nextShort();

        System.out.println("Introduce un numero entero: ");
        short num2 = teclado.nextShort();

        System.out.println("Introduce un numero entero: ");
        short num3 = teclado.nextShort();

        short media = (short) (num1 + num2 + num3);
        System.out.println("La media es: " + media / 3);
    }
}
