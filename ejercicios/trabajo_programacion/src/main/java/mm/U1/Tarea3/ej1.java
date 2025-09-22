package mm.U1.Tarea3;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero de dos cifras: ");

        byte num1 = teclado.nextByte();

        System.out.println("Escribe un numero de dos cifras: ");
        byte num2 = teclado.nextByte();

        System.out.println("La suma es: " + (byte) (num1 + num2));


    }
}
