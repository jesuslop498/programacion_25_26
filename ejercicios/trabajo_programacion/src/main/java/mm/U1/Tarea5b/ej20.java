package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base impobible: ");
        double base = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = teclado.nextLine();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String tipoPromo = teclado.nextLine();


        int IVAnum = 0;
        switch (tipoIVA) {
            case "general":
                IVAnum = 21;
                break;
            case "reducido":
                IVAnum = 10;
                break;
            case "superreducido":
                IVAnum = 4;
                break;
            default:
                System.out.println("El tipo de IVA no es correcto");
        }
        double iva = base * IVAnum / 100;
        double sinDescuento = base + iva;

        double descuento = 0;

        switch (tipoPromo) {
            case "nopro":
                break;
            case "mitad":
                descuento = sinDescuento / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = sinDescuento * 0.05;
                break;
            default:
                System.out.println("El codigo promocional introducido es incorrecto");
        }

        double total = sinDescuento - descuento;

        System.out.println("Base imponible: " + base);
        System.out.println("IVA: " + IVAnum);
        System.out.println("Precio del IVA: " + iva);
        System.out.println("Cod. promo. " + "(" + tipoPromo + ")");
        System.out.println("TOTAL: " + total);
    }
}
