package mm.U6.Tarea2;

import java.io.*;

public class ej6 {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("tabla.dat"));

            try {
                while (true) {
                    double num = dis.readDouble();
                    System.out.println(num);
                }
            } catch (EOFException e) {
                System.out.println("Fin del fichero.");
                dis.close();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}