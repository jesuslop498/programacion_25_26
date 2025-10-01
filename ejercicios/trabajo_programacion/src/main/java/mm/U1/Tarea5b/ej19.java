package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un dia de la semana, lunes a viernes:");
        String dia = teclado.nextLine();

        System.out.println("Introduce una hora: ");
        int hora = teclado.nextInt();

        System.out.println("Introduce minutos: ");
        int mins = teclado.nextInt();

        int diatotal = 24;
        int minstotal = 60;
        switch (dia) {
            case "lunes":
                diatotal -= hora;
                minstotal -= mins;
                minstotal += diatotal*60;
                minstotal += 72*60;
                minstotal += 15*60;
                System.out.println("Faltan " + minstotal + " minutos para el finde");
            break;
            case "martes":
                diatotal -= hora;
                minstotal -= mins;
                minstotal += diatotal*60;
                minstotal += 48*60;
                minstotal += 15*60;
                System.out.println("Faltan " + minstotal + " minutos para el finde");
            break;
            case "miercoles":
                diatotal -= hora;
                minstotal -= mins;
                minstotal += diatotal*60;
                minstotal += 24*60;
                minstotal += 15*60;
                System.out.println("Faltan " + minstotal + " minutos para el finde");
            break;
            case "jueves":
                diatotal -= hora;
                minstotal -= mins;
                minstotal += diatotal*60;
                minstotal += 15*60;
                System.out.println("Faltan " + minstotal + " minutos para el finde");
            break;
            case "viernes":
                diatotal = 15;
                diatotal -= hora;
                minstotal -= mins;
                minstotal += diatotal*60;
                System.out.println("Faltan " + minstotal + " minutos para el finde");
        }
    }
}
