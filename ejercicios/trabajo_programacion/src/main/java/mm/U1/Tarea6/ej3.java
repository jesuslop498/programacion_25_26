package mm.U1.Tarea6;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        int par = 0;

        if (numero % 2 == 0) {
            par += 1;
        }
        System.out.println(par);
    }
}
