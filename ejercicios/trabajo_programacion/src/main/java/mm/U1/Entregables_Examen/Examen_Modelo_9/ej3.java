package mm.U1.Entregables_Examen.Examen_Modelo_9;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long numero, n;
        int digito;
        boolean aparece;

        System.out.print("Introduzca un número entero: ");
        numero = sc.nextLong();

        if (numero < 0) {
            numero = -numero; // convertir en positivo
        }

        // --- DÍGITOS QUE APARECEN ---
        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 0; i <= 9; i++) {
            n = numero;
            aparece = false;

            // Si el número es 0, solo aparece el dígito 0
            if (numero == 0 && i == 0) {
                aparece = true;
            }

            // Recorremos los dígitos del número
            while (n > 0 && !aparece) {
                digito = (int)(n % 10);
                if (digito == i) {
                    aparece = true;
                }
                n = n / 10;
            }

            if (aparece) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // --- DÍGITOS QUE NO APARECEN ---
        System.out.print("Dígitos que no aparecen: ");
        for (int i = 0; i <= 9; i++) {
            n = numero;
            aparece = false;

            if (numero == 0 && i == 0) {
                aparece = true;
            }

            while (n > 0 && !aparece) {
                digito = (int)(n % 10);
                if (digito == i) {
                    aparece = true;
                }
                n = n / 10;
            }

            if (!aparece) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}