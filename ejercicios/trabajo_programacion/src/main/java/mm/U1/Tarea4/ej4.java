package mm.U1.Tarea4;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un numero decimal: ");
    float num1 = teclado.nextFloat();

    System.out.print("El numero redondeado es: " + (Math.round(num1)));
}
}
