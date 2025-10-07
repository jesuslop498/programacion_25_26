package mm.U1.Tarea8b;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int combinacion = 1234;

        int prueba = 0;
        int contador = 0;
        while (contador < 4) {
            prueba = teclado.nextInt();

            if (prueba == combinacion) {
                System.out.println("Acertaste");
                break;
            } else {
                System.out.println("Lo siento, no es la combinacion");
            }
            contador++;
        }

    }
}
