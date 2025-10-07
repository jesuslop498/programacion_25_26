package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la nota del primer alumno: ");
        int nota1 = teclado.nextInt();

        System.out.print("Introduce la nota del segundo alumno: ");
        int nota2 = teclado.nextInt();

        System.out.print("Introduce la nota del tercer alumno: ");
        int nota3 = teclado.nextInt();

        System.out.print("Introduce la nota del cuarto alumno: ");
        int nota4 = teclado.nextInt();

        System.out.print("Introduce la nota del quinto alumno: ");
        int nota5 = teclado.nextInt();

        if (nota1 < 5 || nota2 < 5 || nota3 < 5 || nota4 < 5 || nota5 < 5) {
            System.out.print("Hay suspenso");
        } else {
            System.out.println("No hay suspenso");
        }
    }
}
