package mm.U7.Tarea1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        HashSet<String> repetidas = new HashSet<>();
        HashSet<String> noRepetidas = new HashSet<>();

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        for (String p : palabras) {
            lista.add(p);
        }

        for (String p : lista) {

            int contador = 0;

            for (String q : lista) {
                if (p.equals(q)) {
                    contador++;
                }
            }

            if (contador > 1) {
                repetidas.add(p);
            } else {
                noRepetidas.add(p);
            }
        }

        System.out.println("Palabras repetidas:");
        for (String p : repetidas) {
            System.out.println(p);
        }

        System.out.println("Palabras no repetidas:");
        for (String p : noRepetidas) {
            System.out.println(p);
        }

        sc.close();
    }
}
