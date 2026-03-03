package mm.U6.Tarea2;

import java.io.*;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce una frase: ");
            String frase = sc.nextLine();

            DataOutputStream dos = new DataOutputStream(new FileOutputStream("frase.dat"));
            dos.writeUTF(frase);
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("frase.dat"));
            String leida = dis.readUTF();
            dis.close();

            System.out.println("Frase leída: " + leida);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}