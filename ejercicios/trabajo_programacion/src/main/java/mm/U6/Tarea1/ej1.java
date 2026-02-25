package mm.U6.Tarea1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero (por defecto 'prueba.txt'): ");
        String nombreFichero = scanner.nextLine();

        if (nombreFichero.isEmpty()) {
            nombreFichero = "prueba.txt";
        }

        String texto = "";
        try {
            FileReader in = new FileReader(nombreFichero);
            int c = in.read();
            while (c != -1) {
                texto += (char) c;
                c = in.read();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("\nContenido del archivo:");
        System.out.println(texto);
    }
}