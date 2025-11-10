package mm.U3.Tarea2;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        int centro = frase.length() / 2;

        char caracter = frase.charAt(centro);

        if (caracter == ' ') {
            System.out.print("El caracter central es un espacio");
        } else {
            System.out.print("El caracter central es: " + caracter);
        }
    }
}
