package mm.U6.Tarea2;

import java.io.*;

public class ej5 {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("tabla.dat"));

            System.out.println("Contenido del archivo:");

            try {
                while (true) {
                    System.out.println(dis.readDouble());
                }
            } catch (EOFException e) {
                dis.close();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
