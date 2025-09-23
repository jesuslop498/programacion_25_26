package mm.U1.Tarea5a;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int num1 = teclado.nextInt();

        if (num1 > 0) {
            System.out.print("Es positivo");
        } else {
            System.out.print("Su numero no es positivo");
        }
    }
}
