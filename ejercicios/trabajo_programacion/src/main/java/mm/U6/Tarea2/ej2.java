package mm.U6.Tarea2;

import java.io.*;

public class ej2 {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("numero.dat"));
            double num = dis.readDouble();
            dis.close();

            System.out.println("Número leído: " + num);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
