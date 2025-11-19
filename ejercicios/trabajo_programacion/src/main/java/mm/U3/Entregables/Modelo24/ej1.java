package mm.U3.Entregables.Modelo24;

import java.util.Scanner;

public class ej1 {
    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {
        char[] resultadoArray = resultado_parcial.toCharArray();

        for (int i = 0; i < cadena_a_adivinar.length(); i++) {
            if (cadena_a_adivinar.charAt(i) == letra) {
                resultadoArray[i] = letra;
            }
        }

        return new String(resultadoArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la palabra a adivinar: ");
        String palabra = scanner.nextLine();

        String resultadoParcial = "-".repeat(palabra.length());

        while (true) {
            System.out.println("Resultado actual: " + resultadoParcial);

            if (resultadoParcial.equals(palabra)) {
                System.out.println("Has adivinado la palabra: " + palabra);
                break;
            }

            System.out.print("Introduce una letra a buscar: ");
            String entrada = scanner.nextLine();

            if (entrada.length() == 1) {
                char letra = entrada.charAt(0);

                resultadoParcial = palabraAhorcado(palabra, resultadoParcial, letra);
            }
        }
    }
}
