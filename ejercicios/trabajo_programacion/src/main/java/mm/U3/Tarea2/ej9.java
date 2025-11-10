package mm.U3.Tarea2;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 5000;

        StringBuilder frase = new StringBuilder();

        frase.append("Manteca colorá");
        System.out.println(frase);
        System.out.println("Capacidad inicial " + frase.capacity());
        System.out.println("Longitud inicial " + frase.length());
        frase.replace(0, frase.length(), "Chicharrones de Chiclana");
        System.out.println(frase);
        frase.replace(0, frase.length(), "Hay " + num + " Chicharrones");
        System.out.println(frase);
        frase.append(" en Chiclana");
        System.out.println(frase);
        String ultimo = frase.substring(frase.length() - 4, frase.length());
        System.out.println(ultimo);
        System.out.println("Capacidad final " + frase.capacity());
        System.out.println("Longitud final " + frase.length());
    }
}
