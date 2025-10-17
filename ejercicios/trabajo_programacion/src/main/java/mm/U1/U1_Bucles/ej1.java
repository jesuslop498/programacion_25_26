package mm.U1.U1_Bucles;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduzca otro número: ");
        int num2 = teclado.nextInt();

        long numeroInvertido1 = 0;
        while (num1 != 0) {
            long digito = num1 % 10;
            numeroInvertido1 = numeroInvertido1 * 10 + digito;
            num1 /= 10;
        }

        long numeroInvertido2 = 0;
        while (num2 != 0) {
            long digito = num2 % 10;
            numeroInvertido2 = numeroInvertido2 * 10 + digito;
            num2 /= 10;
        }

        String cadenaPares = "";
        String cadenaImpares = "";

        while (numeroInvertido1 > 0 || numeroInvertido2 > 0) {
            long rec = numeroInvertido1 % 10;
            long rec1 = numeroInvertido2 % 10;

            if (rec % 2 == 0) {
                cadenaPares += rec;
            } else {
                cadenaImpares += rec;
            }

            if (rec1 %2 == 0) {
                cadenaPares += rec1;
            } else {
                cadenaImpares += rec1;
            }

            numeroInvertido1 /= 10;
            numeroInvertido2 /= 10;
            rec = 0;
            rec1 = 0;
        }

        System.out.println("El número formado por los dígitos pares es "+ cadenaPares);
        System.out.println("El número formado por los dígitos impares es "+ cadenaImpares);
    }
}
