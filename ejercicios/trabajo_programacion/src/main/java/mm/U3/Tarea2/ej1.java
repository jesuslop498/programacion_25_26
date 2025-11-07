package mm.U3.Tarea2;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String s1 = teclado.nextLine();

        System.out.print("Introduce una nueva palabra: ");
        String s2 = teclado.nextLine();

        if (s1.length() < s2.length()) {
            System.out.print("La mas corta es " + s1);
        } else {
            System.out.print("La mas corta es " + s2);
        }
    }
}
