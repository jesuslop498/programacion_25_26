package mm.U1.Entregables_Examen.Entregable1;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        long numero = teclado.nextLong();

        long numeroOriginal = numero;
        long numeroInvertido = 0;

        while (numero != 0) {
            long digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicupa");
        }
    }
}
