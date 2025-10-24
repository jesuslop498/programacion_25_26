package mm.U1.U1_Entregable;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero con una cantidad de cifras pares: ");
        int cifra = teclado.nextInt();

        int num = cifra;

        int contador = 0;

        while (num > 0) {
            contador++;
            num /= 10;
        }

        if (contador % 2 == 1) {
            System.out.println("Introduce de nuevo un numero valido: ");
            cifra = teclado.nextInt();
        }

        int numeroInvertido = 0;
        while (cifra != 0) {
            int digito = cifra % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            cifra /= 10;
        }

        int mitad1 = contador / 2;
        int primeraMitad = 0;
        while (mitad1 > 0) {
            int rest = numeroInvertido % 10;
            primeraMitad = (primeraMitad * 10) + rest;
            numeroInvertido /= 10;
            mitad1--;
        }

        int segundaMitad = 0;
        int mitad2 = contador / 2;
        while (mitad2 > 0) {
            int rest = numeroInvertido %10;
            segundaMitad = (segundaMitad*10) + rest;
            numeroInvertido/= 10;
            mitad2--;
        }

        if (primeraMitad % 2 == 0 || primeraMitad % 3 == 0 || primeraMitad % 5 == 0 || primeraMitad % 7 == 0 || primeraMitad % 11 == 0) {
            System.out.println(primeraMitad + " - No es primo");
        } else {
            System.out.println(primeraMitad + " - Si es primo");
        }
        if (segundaMitad % 2 == 0 || segundaMitad % 3 == 0 || segundaMitad % 5 == 0 || segundaMitad % 7 == 0 || segundaMitad % 11 == 0) {
            System.out.println(segundaMitad + " - No es primo");
        } else {
            System.out.println(segundaMitad + " - Si es primo");
        }
    }
}