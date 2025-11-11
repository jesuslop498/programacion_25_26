package mm.U3.Tarea3;

import java.util.Scanner;

public class ej10 {

    public static int rellenaPares(int[] tabla) {
        Scanner sc = new Scanner(System.in);
        int imparesDesechados = 0;
        int contador = 0;

        while (contador < tabla.length) {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                tabla[contador] = numero;
                contador++;
            } else { // si es impar
                imparesDesechados++;
            }
        }

        return imparesDesechados;
    }

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int impares = rellenaPares(numeros);

        System.out.println("\nTabla rellena con pares:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\nImpares desechados: " + impares);
    }
}

