package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Elige un sabor (manzana, fresa o chocolate): ");
        String sabor = teclado.nextLine();

        System.out.print("¿Quiere nata? (si o no): ");
        String nata = teclado.nextLine();

        System.out.print("¿Quiere ponerle nombre? (si o no): ");
        String nombre = teclado.nextLine();

        double manPrecio = 18;
        double fresaPrecio = 16;
        double chocoNegro = 14;
        double chocoBlanco = 15;
        double nataPrecio = 2.5;
        double nombrePrecio = 2.75;
        double total = 0;

        switch (sabor) {
            case "manzana":
                System.out.print("Tarta de manzana: " + manPrecio + "€");
                total += manPrecio;
                break;
            case "fresa":
                System.out.print("Tarta de fresa: " + fresaPrecio + "€");
                total += fresaPrecio;
                break;
            case "chocolate":
                System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
                String chocolate = teclado.nextLine();

                if (chocolate.equals("negro")) {
                    System.out.println("Tarta de chocolate negro: " + chocoNegro + "€");
                    total += chocoNegro;
                } else if (chocolate.equals("blanco")) {
                    System.out.println("Tarta de chocolate blanco: " + chocoBlanco + "€");
                    total += chocoBlanco;
                }
            default:
        }
        switch (nata) {
            case "si":
                System.out.println("Con nata: " + nataPrecio + "€");
                total += nataPrecio;
                break;
            case "no":
                System.out.println("Sin nata");
                break;
            default:
        }

        switch (nombre) {
            case "si":
                System.out.println("Con nombre: " + nombrePrecio + "€");
                total += nombrePrecio;
                break;
            case "no":
                System.out.println("Sin nombre");
                break;
            default:
        }

        System.out.print("Total: " + total + "€");
    }
}
