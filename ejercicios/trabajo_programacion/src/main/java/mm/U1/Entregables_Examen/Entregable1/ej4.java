package mm.U1.Entregables_Examen.Entregable1;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura de la flecha (número impar ≥ 3): ");
        int altura = teclado.nextInt();

        // Comprobar que la altura es impar y mayor o igual a 3
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Error: la altura debe ser un número impar mayor o igual que 3.");
            return;
        }

        int mitad = altura / 2;

        for (int i = 0; i < mitad; i++) {
            // Primera flecha
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.print("*");
            // Espacio entre flechas
            for (int j = 0; j < 5; j++) System.out.print(" ");
            // Segunda flecha
            System.out.println("*");
        }

        // Línea central
        for (int j = 0; j < mitad; j++) System.out.print(" ");
        System.out.print("*");
        for (int j = 0; j < 5; j++) System.out.print(" ");
        System.out.println("*");

        // Parte inferior de la flecha
        for (int i = mitad - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < 5; j++) System.out.print(" ");
            System.out.println("*");
        }
    }
}
