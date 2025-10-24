package mm.U1.U1_Entregable;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero entero positivo: ");
        int numEntero = teclado.nextInt();

        System.out.println("Escribe una cifra entre 0 y 9 (ambos inclusive): ");
        int cifra = teclado.nextInt();

        long numeroInvertido = 0;
        while (numEntero != 0) {
            long digito = numEntero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numEntero /= 10;
        }

        int posiciones = 1;
        int ocurrencias = 0;

        long numero = numeroInvertido;
        while (numeroInvertido > 0) {
            long rest = numeroInvertido % 10;

            if (rest == cifra) {
                ocurrencias++;
            }

            numeroInvertido /= 10;
        }
        System.out.println("Resultado: ");
        System.out.println(ocurrencias + " Ocurrencias");

        System.out.print("Posiciones: ");

        while (numero > 0) {
            long rest = numero % 10;
            if (rest == cifra) {
                if (ocurrencias == 1) {
                    System.out.print(posiciones);
                } else {
                    System.out.print(posiciones + " - ");
                }
                ocurrencias--;
            }

            posiciones++;
            numero/=10;
        }


    }
}
