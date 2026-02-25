package mm.U6.Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej4 {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        int numCaracteres = 0;
        int numPalabras = 0;
        int numLineas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numLineas++;
                numCaracteres += linea.length();
                numPalabras += linea.split(" ").length;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Número de líneas: " + numLineas);
    }
}