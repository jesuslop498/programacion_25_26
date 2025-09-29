package mm.U1.Tarea5a;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero 12: ");
        int num = teclado.nextInt();

        if (num == 12) {
            System.out.print("Correcto");
        } else {
            System.out.print("Incorrecto");
        }
    }
}
