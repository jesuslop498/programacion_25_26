package mm.U1.Tarea8b;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para mostrarlo invertido: ");
        int num = teclado.nextInt();

        int invertido = 0;
        while (num != 0) {
            int dig = num %10;
            invertido = invertido *10 + dig;
            num /= 10;
        }

        System.out.println(invertido);
    }

}
