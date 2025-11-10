package mm.U3.Tarea2;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.print("Contiene " + contador + " espacios");
    }
}
