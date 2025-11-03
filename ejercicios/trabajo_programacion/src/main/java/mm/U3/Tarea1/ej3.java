package mm.U3.Tarea1;

import java.util.Scanner;

public class ej3 {

    public static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        System.out.print("Introduce 1 para calcular el area o 2 para calcular el volumen: ");
        int num = teclado.nextInt();

        if (num == 1) {
            area();
        } else {
            volumen();
        }
    }

    public static void area() {
        System.out.print("Introduce el radio: ");
        double r = teclado.nextDouble();
        System.out.print("Introduce la altura: ");
        double a = teclado.nextDouble();

        double area = 2 * Math.PI * r * (a + r);

        System.out.print("El area es: " + area);
    }

    public static void volumen() {
        System.out.print("Introduce el radio: ");
        double r = teclado.nextDouble();
        System.out.print("Introduce la altura: ");
        double a = teclado.nextDouble();

        double volumen = Math.PI * (r * r) * a;

        System.out.println("El volumen es: " + volumen);
    }
}
