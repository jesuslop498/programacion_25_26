package mm.U3.Tarea1;

import java.util.Scanner;

public class ej6 {
    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);

        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0);

        if (esVocal(caracter)) {
            System.out.println("El carácter '" + caracter + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + caracter + "' no es una vocal.");
        }
    }
}
