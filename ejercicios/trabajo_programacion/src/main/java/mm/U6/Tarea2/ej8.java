package mm.U6.Tarea2;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class ej8 {
    public static void main(String[] args) {
        try {
            Random r = new Random();
            int[] tabla = new int[10];

            for (int i = 0; i < tabla.length; i++) {
                tabla[i] = r.nextInt(100);
            }

            Arrays.sort(tabla);

            DataOutputStream dos = new DataOutputStream(new FileOutputStream("aleatorios.dat"));
            for (int num : tabla) {
                dos.writeInt(num);
            }
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("aleatorios.dat"));
            System.out.println("Números recuperados:");

            try {
                while (true) {
                    System.out.println(dis.readInt());
                }
            } catch (EOFException e) {
                dis.close();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
