package mm.U3.Tarea2;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Player 1");
        System.out.print("Introduce la contraseña para ser adivinada: ");
        String contra = teclado.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Player 2");
        System.out.println("Intenta adivinar la contraseña con las siguientes pistas");
        System.out.println("Numero de caracteres: " + contra.length());
        System.out.println("Primer caracter: " + contra.charAt(0) + " Ultimo caracter: " + contra.charAt(contra.length() - 1));


        while (true) {
            String intento = teclado.nextLine();

            if (contra.equals(intento)) {
                System.out.println("Acertaste");
                break;
            } else {
                System.out.println("Error");
            }
        }
    }
}
