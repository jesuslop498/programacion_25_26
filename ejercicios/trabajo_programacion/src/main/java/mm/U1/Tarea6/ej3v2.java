package mm.U1.Tarea6;

import java.util.Scanner;

public class ej3v2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        boolean par = true;

        par = numero % 2 == 0;

        System.out.println(par);
    }
}
