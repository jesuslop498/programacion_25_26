package mm.U1.Tarea4;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        short num1 = 32767;
        System.out.println("El numero maximo para short es: " + num1);

        System.out.println("Esto ocurre si le sumamos 1: " + (short) (num1 + 1));
    }
}
