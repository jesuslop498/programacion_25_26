package mm.U1.Tarea3;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento: ");
        short fecha = teclado.nextShort();

        System.out.println("Introduce la fecha actual: ");
        short actual = teclado.nextShort();

        System.out.println("Tienes " + (short ) (actual - fecha) + " años");

    }
}
