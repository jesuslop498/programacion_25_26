package mm.U1.Tarea6;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor de radio de una circunferencia");
        double radio = teclado.nextDouble();

        System.out.println("1. Calcular diametro");
        System.out.println("2. Calcular perimetro");
        System.out.println("3. Calcular area");
        System.out.println("Introduce una opcion: ");
        int opc = teclado.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Diametro = " + 2* radio);
                break;
            case 2:
                System.out.println("Perimetro = " + 2*Math.PI*radio);
                break;
            case 3:
                System.out.println("Area = " + Math.PI*radio*radio);
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
