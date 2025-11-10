package mm.U3.Tarea2;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo (nombre y apellidos): ");
        String nombre = scanner.nextLine();

        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";

        StringBuilder frase = new StringBuilder();

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if (vocales.indexOf(letra) == -1) {
                frase.append(letra);
            }
        }

        System.out.println("Nombre sin vocales: " + frase);
    }
}
