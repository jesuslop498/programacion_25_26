package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la bandera en cm: ");
        double altura = teclado.nextDouble();

        System.out.print("Ahora introduzca la anchura: ");
        double anchura = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String bordado = teclado.nextLine();

        System.out.println("Gracias, aqui tiene el desglose de su compra");

        double bandera = altura * anchura;

        double precio = bandera / 100;

        double escudo = 0;
        switch (bordado) {
            case "s":
                escudo = 2.50;
                break;
            case "n":
                escudo = 0;
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

        double envio = 3.25;

        System.out.println("Bandera de " + (altura * anchura) + "cm2: " + precio);
        System.out.println("Escudo: " + escudo);
        System.out.println("Gastos de envio: " + envio);
        System.out.println("Total: " + (precio + escudo + envio));
    }
}
