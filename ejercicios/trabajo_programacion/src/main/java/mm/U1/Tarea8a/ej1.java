package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Escribe un numero, (introduce 0 para terminar): ");

        while (true) {
            numero = teclado.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("No es par");
            }

            if (numero > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }

            System.out.println("El numero: " + numero + " al cuadrado es: " + numero * numero);
        }
    }
}
