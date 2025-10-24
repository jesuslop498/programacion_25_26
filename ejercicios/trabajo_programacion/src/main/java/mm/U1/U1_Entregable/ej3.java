package mm.U1.U1_Entregable;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double precioBase = 8;
        double diaEspectador = 5;
        double diaPareja = 11;
        double precioFinal = 0;

        System.out.println("Venta de entradas CineCampa");

        System.out.println("Numero de entradas: ");
        int personas = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dia de la semana: ");
        String dia = teclado.nextLine();

        System.out.println("¿Tiene tarjeta CineCampa? (s/n)");
        String descuento = teclado.nextLine();

        precioFinal = personas * precioBase;

        switch (dia) {
            case "miercoles":
                precioFinal = personas * diaEspectador;
                break;
            case "jueves":
                if (personas % 2 == 0) {
                    precioFinal = (personas / 2) * diaPareja;
                } else {
                    precioFinal = ((personas / 2) * diaPareja) + precioBase;
                }
        }

        double total = precioFinal;

        double desc = 0.00;

        switch (descuento) {
            case "s":
                desc = precioFinal * 0.10;
                precioFinal = precioFinal - desc;
                break;
            case "n":
                desc = 0;
        }

        System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
        if (dia.equals("jueves")) {
            System.out.println("Entradas de pareja: " + personas / 2);
            System.out.println("Precio por entrada de pareja: " + diaPareja + "€");
        } else {
            System.out.println("Numero de entradas: " + personas);
            if (dia.equals("miercoles")) {
                System.out.println("Precio por entrada individual: " + diaEspectador + "€");
            } else {
                System.out.println("Precio por entrada individual: " + precioBase + "€");
            }
        }
        System.out.println("Total: " + total + "€");
        System.out.println("Descuento: " + desc + "€");
        System.out.println("A pagar: " + precioFinal + "€");

    }
}

