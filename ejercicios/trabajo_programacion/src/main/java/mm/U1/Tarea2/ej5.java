package mm.U1.Tarea2;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una temperatura en grados centigrados: ");
        double centigrados = teclado.nextInt();

        double fa = 9 * centigrados / 5 + 32;

        System.out.print("Equivale a " + fa + " grados Fahrenheit");
    }
}
