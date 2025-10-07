package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();

        int producto = 1;

        for (int i = num; i > 0; i--) {
            if (i != 1) {
                System.out.print(i + "x");
            } else {
                System.out.println(i);
            }
            producto = producto * i;
        }
        System.out.println("EL factorial de " + num + " es " + producto);
    }
}

