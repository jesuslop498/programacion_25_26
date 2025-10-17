package mm.U1.Entregables_Examen.Examen_Modelo_9;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int contador = 0;
        int suma = 0;
        boolean esPrimo;

        System.out.println("Por favor, vaya introduciendo números enteros positivos.");
        System.out.println("Para terminar, introduzca un número primo:");

        do {
            numero = sc.nextInt();

            esPrimo = true;
            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i * i <= numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                break;
            }

            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }

            // Sumamos y contamos
            suma += numero;
            contador++;

        } while (true);

        if (contador == 0) {
            System.out.println("No ha introducido ningún número no primo.");
        } else {
            double media = (double) suma / contador;

            System.out.println();
            System.out.println("Ha introducido " + contador + " números no primos.");
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
            System.out.println("Media: " + media);
        }
    }
}