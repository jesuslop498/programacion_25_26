package mm.U3.Entregables.Modelo2;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para averiguar el morse: ");
        int num = teclado.nextInt();

        System.out.println("El morse del numero introducido es: ");
        System.out.println(convierteEnMorse(num));
    }

    public static String convierteEnMorse(int n) {
        int num = n;
        StringBuilder morse = new StringBuilder();

        int numeroInvertido = 0;
        while (num != 0) {
            int digito = num % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            num /= 10;
        }

        while (numeroInvertido > 0) {
            int res = numeroInvertido % 10;
            switch (res) {
                case 1:
                    morse.append(". _ _ _ _ ");
                    break;
                case 2:
                    morse.append(". . _ _ _ ");
                    break;
                case 3:
                    morse.append(". . . _ _ ");
                    break;
                case 4:
                    morse.append(". . . . _ ");
                    break;
                case 5:
                    morse.append(". . . . . ");
                    break;
                case 6:
                    morse.append("_ . . . . ");
                    break;
                case 7:
                    morse.append("_ _ . . . ");
                    break;
                case 8:
                    morse.append("_ _ _ . . ");
                    break;
                case 9:
                    morse.append("_ _ _ _ . ");
                    break;
                case 0:
                    morse.append("_ _ _ _ _ ");
                    break;
            }
            numeroInvertido /= 10;
        }
        return morse.toString();
    }
}

