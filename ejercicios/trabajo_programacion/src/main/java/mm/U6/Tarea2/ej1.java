package mm.U6.Tarea2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número double: ");
            double num = sc.nextDouble();

            DataOutputStream dos = new DataOutputStream(new FileOutputStream("numero.dat"));
            dos.writeDouble(num);
            dos.close();

            System.out.println("Número guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
