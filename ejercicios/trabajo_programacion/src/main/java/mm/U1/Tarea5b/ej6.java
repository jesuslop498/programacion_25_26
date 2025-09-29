package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una nota: ");
        int nota1 = teclado.nextInt();

        System.out.println("Introduce una nota: ");
        int nota2 = teclado.nextInt();

        System.out.println("Introduce una nota: ");
        int nota3 = teclado.nextInt();

        int media = (nota1+nota2+nota3)/3;

        System.out.println("La media es: " + media);
    }
}
