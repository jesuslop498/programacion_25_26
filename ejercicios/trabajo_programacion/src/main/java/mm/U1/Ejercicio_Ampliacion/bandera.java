package mm.U1.Ejercicio_Ampliacion;

import java.util.Scanner;

public class bandera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la bandera en cm: ");
        double altura = teclado.nextDouble();

        System.out.print("Ahora introduzca la anchura: ");
        double anchura = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Quiere escudo bordado? (s/n): ");
        String bordado = teclado.nextLine();

        System.out.println("Gracias, aqui tiene el desglose de su compra");
        System.out.println();

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

        System.out.println("El precio base de la bandera es: " + precio);
        if (escudo == 2.50) {
            System.out.println("El precio del escudo es: " + escudo);
        } else {
            System.out.println("No se solicito escudo");
        }
        System.out.println("El precio del envio son: " + envio);
        System.out.println("-------------------------------------");
        System.out.println("El total de la compra son: " + (precio + escudo + envio));
    }
}
