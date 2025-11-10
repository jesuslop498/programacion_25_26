package mm.U3.Tarea3;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[5];


        System.out.println("Ingresa 5 numeros decimales: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        System.out.println("Los numeros ingresados son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}
