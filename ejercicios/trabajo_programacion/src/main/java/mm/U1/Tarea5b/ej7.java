package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una nota: ");
        int nota1 = teclado.nextInt();

        System.out.println("Introduce una nota: ");
        int nota2 = teclado.nextInt();

        System.out.println("Introduce una nota: ");
        int nota3 = teclado.nextInt();

        int media = (nota1+nota2+nota3)/3;

        if (media <= 4) {
            System.out.print("Nota del boletin: Insuficiente");
        } else if (media == 5) {
            System.out.print("Nota del boletin: Suficiente");
        } else if (media == 6) {
            System.out.print("Nota del boletin: Bien");
        } else if (media >= 7 && media <= 8) {
            System.out.print("Nota del boletin: Notable");
        } else if (media >= 9 && media <= 10) {
            System.out.print("Nota del boletin: Sobresaliente");
        }
    }
}
