package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿que ha tomado de comer? (palmera, donut o pitufo): ");
        String comer = teclado.nextLine();

        String pitufo = " ";

        switch (comer) {
            case "pitufo":
                System.out.print("¿Con que se ha tomato el pitufo? (aceite o tortilla): ");
                pitufo = teclado.nextLine();
                break;
            default:
        }

        System.out.print("¿Que ha tomado de beber? (zumo o cafe): ");
        String beber = teclado.nextLine();

        double palmeraPrecio = 1.4;
        double donutPrecio = 1;
        double aceitePrecio = 1.2;
        double tortillaPrecio = 1.6;
        double zumoPrecio = 1.5;
        double cafePrecio = 1.2;
        double total = 0;

        switch (comer) {
            case "palmera":
                System.out.println("Palmera: " + palmeraPrecio);
                total += palmeraPrecio;
                break;
            case "donut":
                System.out.println("Donut: " + donutPrecio);
                total += donutPrecio;
                break;
            case "pitufo":
                if (pitufo.equals("aceite")) {
                    System.out.println("Pitufo con aceite: " + aceitePrecio);
                    total += aceitePrecio;
                } else if (pitufo.equals("tortilla")) {
                    System.out.println("Pitufo con tortilla: " + tortillaPrecio);
                    total += tortillaPrecio;
                }
                break;
            default:
                System.out.println("Respuesta incorrecta");
        }

        switch (beber) {
            case "zumo":
                System.out.println("Zumo: " + zumoPrecio);
                total += zumoPrecio;
                break;
            case "cafe":
                System.out.println("Cafe: " + cafePrecio);
                total += cafePrecio;
                break;
            default:
                System.out.println("Respuesta incorrecta");
        }
        System.out.print("Total desayuno: " + total);

    }
}
