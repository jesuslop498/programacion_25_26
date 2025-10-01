package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int primera = 0;

        System.out.println("Introduce un numero entero que tenga como maximo 5 cifras");
        int num1 = teclado.nextInt();

        if (num1 < 10) {
            primera = num1;
        }

        if ((num1 >= 10) && (num1 < 100)) {
            primera = num1 / 10;
        }

        if ((num1 >= 100) && (num1 < 1000)) {
            primera = num1 / 100;
        }

        if ((num1 >= 1000) && (num1 < 10000)) {
            primera = num1 / 1000;
        }

        if (num1 >= 10000) {
            primera = num1 / 10000;
        }

        System.out.println("La primera cifra del numero introducido es : " + primera);
    }
}
