package mm.U7.Tarea1;

import java.util.Scanner;
import java.util.TreeSet;

public class ej7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<String> nombres = new TreeSet<>();

        String nombre;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {

            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            nombres.add(nombre);
        }

        System.out.println("Lista de nombres ordenada alfabéticamente:");
        System.out.println(nombres);

        sc.close();
    }
}
