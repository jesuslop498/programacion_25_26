package mm.U3.Entregables.ExamenMod6;

import java.util.Scanner;

public class ej1 {
    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {
        char[] resultado = resultado_parcial.toCharArray();

        for (int i = 0; i < cadena_a_adivinar.length(); i++) {
            if (cadena_a_adivinar.charAt(i) == letra) {
                resultado[i] = letra;
            }
        }

        return new String(resultado);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la palabra para adivinar: ");
        String palabra = teclado.nextLine();

        String resultadoParcial = "-".repeat(palabra.length());

        while (true) {
            System.out.println("El resultado actual es: " + resultadoParcial);

            if (resultadoParcial.equals(palabra)) {
                System.out.println("Has adivinado la palabra: " + palabra);
                break;
            }

            System.out.println("Introduce una letra: ");
            String entrada = teclado.nextLine();

            if (entrada.length() == 1) {
                char letra = entrada.charAt(0);

                resultadoParcial = palabraAhorcado(palabra, resultadoParcial, letra);
            }
        }
    }
}
