package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor minimo y maximo de un rango");
        int min = teclado.nextInt();
        int max = teclado.nextInt();

        int rango = 0;

        while (rango <min || rango > max) {
            System.out.println("Introduce un numero dentro del rango: ");
            rango = teclado.nextInt();
        }
    }
}
