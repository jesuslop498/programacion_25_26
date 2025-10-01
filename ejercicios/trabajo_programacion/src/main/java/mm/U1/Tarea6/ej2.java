package mm.U1.Tarea6;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribre un numero del 1 al 10: ");
        int num1 = teclado.nextInt();

        switch (num1) {
            case 1:
                System.out.print("Uno");
                break;
            case 2:
                System.out.print("Dos");
                break;
            case 3:
                System.out.print("Tres");
                break;
            case 4:
                System.out.print("Cuatro");
                break;
            case 5:
                System.out.print("Cinco");
                break;
            case 6:
                System.out.print("Seis");
                break;
            case 7:
                System.out.print("Siete");
                break;
            case 8:
                System.out.print("Ocho");
                break;
            case 9:
                System.out.print("Nueve");
                break;
            case 10:
                System.out.print("Diez");
                break;
            default:
                System.out.print("Numero incorrecto");
        }

    }
}
