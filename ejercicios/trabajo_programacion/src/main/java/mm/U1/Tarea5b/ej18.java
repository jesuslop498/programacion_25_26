package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media < 5) {
            System.out.print("¿Cual ha sido el resultado de tu recuperacion? (1 para ser apto/ 2 para no apto): ");
            int res1 = teclado.nextInt();
            if (res1 == 1) {
                media = 5;
            }
        }
        System.out.println("Su nota media es de: " + media);
    }
}