package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int condicionados = 0;
        int notas = 0;

        int aprobados = 0;
        int suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduce una nota entre 0 y 10: ");
            notas = teclado.nextInt();

            if (notas == 4) {
                condicionados++;
            } else {
                if (notas > 4) {
                    aprobados++;
                } else {
                    suspensos++;
                }
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Condicionados: " + condicionados);
    }
}
