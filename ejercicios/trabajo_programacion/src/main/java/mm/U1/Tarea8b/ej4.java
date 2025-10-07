package mm.U1.Tarea8b;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una lista de 10 numeros enteros: ");

        int pos = 0;
        int neg = 0;

        for (int i = 1; i <= 10; i++) {
            int lista = teclado.nextInt();
            if (lista > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println("Hay un total de " + pos + " numeros positivos y " + neg + " numeros negativos");

    }
}
