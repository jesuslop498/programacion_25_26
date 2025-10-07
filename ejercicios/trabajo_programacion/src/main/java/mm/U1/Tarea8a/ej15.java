package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int num = teclado.nextInt();
        System.out.println("Lista de números entre 1 y " + num + " y su estado (primo/no primo):");

        for (int i = 1; i <= num; i++) {
            boolean esPrimo = true;
            if (i <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                System.out.println(i + " -> Es primo");
            } else {
                System.out.println(i + " -> No es primo");
            }
        }
    }
}