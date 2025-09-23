package mm.U1.Tarea5a;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = teclado.nextInt();

        if (num%2 == 0) {
            System.out.print("Tu numero es par");
        } else {
            System.out.println("Tu numero es impar");
        }

    }
}
