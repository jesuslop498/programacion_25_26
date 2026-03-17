package mm.U7.Tarea2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ej14 {
    public static List<Character> leeCadena() {
        Scanner sc = new Scanner(System.in);
        List<Character> lista = new LinkedList<>();

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        for (char c : cadena.toCharArray()) {
            lista.add(c);
        }

        return lista;
    }
}