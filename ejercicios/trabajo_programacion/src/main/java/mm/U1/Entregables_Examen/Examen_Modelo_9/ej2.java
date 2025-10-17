package mm.U1.Entregables_Examen.Examen_Modelo_9;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero entero positivo: ");
        long num = teclado.nextLong();

        System.out.println("Introduce la posicion a partir de la cual quiere partir el numero:");
        int pos = teclado.nextInt();

        long longitud = 0;

        long temp = num;
        while (temp > 0) {
            temp /= 10;
            longitud++;
        }

        long divisor = 1;
        for (int i = 0; i < (longitud -pos + 1); i++) {
            divisor*=10;
        }

        long primeraParte = num / divisor;
        long segundaParte = num % divisor;

        System.out.println("Los números partidos son el " + primeraParte + " y el " + segundaParte + ".");

    }
}
