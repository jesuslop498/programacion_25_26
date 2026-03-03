package mm.U6.Tarea2;

import java.io.*;

public class ej9 {
    public static void main(String[] args) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trenes.dat"));

            oos.writeObject(new Tren("AVE", 300));
            oos.writeObject(new Tren("Regional", 150));
            oos.writeObject(new Tren("Mercancías", 50));

            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("trenes.dat"));

            try {
                while (true) {
                    Tren t = (Tren) ois.readObject();
                    System.out.println(t);
                }
            } catch (EOFException e) {
                ois.close();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}