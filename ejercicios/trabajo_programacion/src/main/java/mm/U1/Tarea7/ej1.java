package mm.U1.Tarea7;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce el valor para a:");
        int a = teclado.nextInt();

        System.out.println("Introduce el valor para b:");
        int b = teclado.nextInt();

        int c = 0;

        c = a;
        a = b;
        b = c;
        System.out.println("A corresponde: " + a + " y  b corresponde " + b);
    }
}
