package mm.U3.Tarea2;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        StringBuilder frase = new StringBuilder();

        String palabra;

        while (true) {
            System.out.println("Introduce una nueva palabra o, (fin, para terminar: )");
            palabra = teclado.nextLine();

            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            if (frase.length() > 0) {
                frase.append(" ");
            }

            frase.append(palabra);
        }

        System.out.print("La frase es: " + frase);

    }
}
