package mm.U1.Ejercicio_Ampliacion;

import java.util.Scanner;

public class Barra {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cifra: ");
        int cifra = teclado.nextInt();
        System.out.println(cifra);

        int copiaCifra = cifra;
        int invertido = 0;

        while (copiaCifra > 0) {
            invertido = (invertido * 10) + (copiaCifra % 10);
            copiaCifra /= 10;
        }

        int i;
        while (invertido > 0) {
            int resto = invertido % 10;
            for (i = 0; i < resto; i++) {
                System.out.print("*");
            }
            if (invertido > 10) {
                System.out.print("_");
            }
            invertido /= 10;
        }
    }
}
