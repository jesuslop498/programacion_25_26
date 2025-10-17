package mm.U1.Entregables_Examen.Entregable1;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la nota del primer control: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Introduce la nota del segundo control: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            if (media < 6) {
                System.out.println("Tu nota de Programación es " + media + " - Suficiente");
            } else if (media < 7) {
                System.out.println("Tu nota de Programación es " + media + " - Bien");
            } else if (media < 9) {
                System.out.println("Tu nota de Programación es " + media + " - Notable");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Sobresaliente");
            }
        } else {
            teclado.nextLine();
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String recuperacion = teclado.nextLine();

            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Tu nota de Programación es 5 - Suficiente");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Suspendido");
            }
        }
    }
}
