package mm.U7.Tarea1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> nombres = new LinkedHashSet<>();

        String nombre;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {

            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            nombres.add(nombre);
        }

        System.out.println("Lista de nombres:");
        System.out.println(nombres);

        sc.close();
    }
}
