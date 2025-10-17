package mm.U1.U1_Bucles;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número entero positivo: ");
        long numero = teclado.nextLong();

        long numeroOriginal = numero;
        long numeroInvertido = 0;
        int sumaPar = 0;
        int sumaImpar = 0;

        while (numero != 0) {
            long digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        String pares = "";
        String impares = "";

        while (numeroInvertido > 0) {
            long rec = numeroInvertido % 10;

            if (rec % 2 == 0) {
                sumaPar += (int) rec;
                pares += rec + " ";
            } else {
                sumaImpar += (int) rec;
                impares += rec + " ";
            }

            numeroInvertido /= 10;
            rec = 0;
        }

        System.out.println("Digitos pares: " + pares);
        System.out.println("Digitos impares: " + impares);
        System.out.println("Suma de los dígitios pares: " + sumaPar);
        System.out.println("Suma de los dígitos impares: " + sumaImpar);
    }
}
