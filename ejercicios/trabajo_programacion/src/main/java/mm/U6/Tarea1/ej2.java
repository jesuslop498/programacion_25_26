package mm.U6.Tarea1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        String edad = scanner.nextLine();

        try (FileWriter writer = new FileWriter("datos.txt", false)) {
            writer.write("Nombre: " + nombre + "\n");
            writer.write("Edad: " + edad + "\n");
            System.out.println("Datos guardados correctamente en datos.txt.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar los datos: " + e.getMessage());
        }
    }
}