package mm.U1.Entregables_Examen.Examen_Modelo_9;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String texto = teclado.nextLine();

        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = (texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cadena tiene " + contadorVocales + " vocales.");
    }
}
