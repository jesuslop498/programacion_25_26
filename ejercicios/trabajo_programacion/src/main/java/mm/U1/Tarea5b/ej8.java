package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a resolver una ecuación de segundo grado del tipo ax^2 + bx + c = 0");

        System.out.print("Introduce el valor de a: ");
        double a = teclado.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = teclado.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c = teclado.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("La ecuación tiene infinitas soluciones.");
                } else {
                    System.out.println("La ecuación no tiene solución.");
                }
            } else {
                double x = -c / b;
                System.out.println("Es una ecuación de primer grado. La solución es x = " + x);
            }
        } else {
            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales: x1 = " + x1 + " y x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real doble: x = " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }
    }
}
