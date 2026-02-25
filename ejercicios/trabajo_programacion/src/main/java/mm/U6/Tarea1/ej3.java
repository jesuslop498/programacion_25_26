package mm.U6.Tarea1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero a duplicar: ");
        String nombreFichero = scanner.nextLine();
        scanner.close();

        String copiaNombre = "copia_de" + nombreFichero;

        try (FileInputStream fis = new FileInputStream(nombreFichero);
             FileOutputStream fos = new FileOutputStream(copiaNombre)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Fichero duplicado correctamente en: " + copiaNombre);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al duplicar el fichero: " + e.getMessage());
        }
    }
}