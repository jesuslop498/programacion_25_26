package mm.U6.Tarea2;

import java.io.*;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("¿Cuántos números quieres introducir? ");
            int n = sc.nextInt();

            double[] tabla = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                tabla[i] = sc.nextDouble();
            }

            DataOutputStream dos = new DataOutputStream(new FileOutputStream("tabla.dat"));
            for (double d : tabla) {
                dos.writeDouble(d);
            }
            dos.close();

            System.out.println("Tabla guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

