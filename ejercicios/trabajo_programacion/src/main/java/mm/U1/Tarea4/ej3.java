package mm.U1.Tarea4;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        float num1 = teclado.nextFloat();

        System.out.println("Introduce un numero entero: ");
        float num2 = teclado.nextFloat();

        System.out.println("Introduce un numero entero: ");
        float num3 = teclado.nextFloat();

        float media = (int) (num1 + num2 + num3);
        System.out.println("La media es: " + media / 3);
    }
}
