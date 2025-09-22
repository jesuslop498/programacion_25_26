package mm.U1.Tarea3;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe 1 o 2: ");
        int num = teclado.nextInt();

        if (num == 1) {
            System.out.print("Hola");
        } else {
            System.out.print("Adios");
        }
    }
}
