package mm.U6.Tarea2;
import java.io.*;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("enteros.dat"));
            int num;

            do {
                System.out.print("Introduce entero positivo (negativo para terminar): ");
                num = sc.nextInt();
                if (num >= 0) {
                    dos.writeInt(num);
                }
            } while (num >= 0);

            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("enteros.dat"));
            System.out.println("Números guardados:");

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
