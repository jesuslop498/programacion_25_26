package mm.U1.Tarea3;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una longitud en millas: ");
        int millas = teclado.nextInt();

        int equivalencia = millas * 1609;
        System.out.print("La equivalencia en metros es la siguiente: " + equivalencia + " metros");

    }
}
