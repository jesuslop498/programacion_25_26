package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int hora = teclado.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = teclado.nextInt();

        int horaSegundos = hora * 3600;

        int minutosSegundos = minutos * 60;

        int sumaSegundos = horaSegundos + minutosSegundos;

        int segundosRestantes = 86400 - sumaSegundos;

        System.out.print("Quedarian un total de " + segundosRestantes + " segundos");
    }
}
