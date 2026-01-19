package mm.U4.Tarea1.Act10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int h = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int m = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int s = sc.nextInt();

        System.out.print("Introduce la cantidad de segundos a sumar: ");
        int n = sc.nextInt();

        Hora hora = new Hora(h, m, s);

        System.out.println("Hora introducida: " + hora);

        hora.sumarSegundos(n);

        System.out.println("Hora resultante: " + hora);
    }
}


