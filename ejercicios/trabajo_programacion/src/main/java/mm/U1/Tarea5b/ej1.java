package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el dia de la semana: ");
        String dia = teclado.nextLine();

        dia = dia.toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("Base de datos");
                break;
            case "martes":
                System.out.println("Programacion");
                break;
            case "miercoles":
                System.out.println("Programacion");
                break;
            case "jueves":
                System.out.println("Ipe");
                break;
            case "viernes":
                System.out.println("Programacion");
                break;
            default:
                System.out.println("El dia introducido no es correcto");
                break;
        }
    }
}
