package mm.U6.Tarea1;

import java.io.*;
import java.util.*;

public class ej5 {
    public static void main(String[] args) {
        String nombreArchivo = "numeros.txt";
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea.trim());
                    if (numero < menor) menor = numero;
                    if (numero > mayor) mayor = numero;
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido en el archivo: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        if (menor == Integer.MAX_VALUE || mayor == Integer.MIN_VALUE) {
            System.out.println("No se encontraron números válidos en el archivo.");
        } else {
            System.out.println("Número menor: " + menor);
            System.out.println("Número mayor: " + mayor);
        }
    }
}