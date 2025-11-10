package mm.U3.Tarea2;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase = teclado.nextLine();

        if (frase.charAt(0) == 'J') {
            for (int i = 15; i < frase.length(); i++) {
                if (frase.charAt(i) != ' ') {
                    System.out.print(frase.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < frase.length() - 15; i++) {
                if (frase.charAt(i) != ' ') {
                    System.out.print(frase.charAt(i));
                }
            }
        }
    }
}
