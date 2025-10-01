package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera):");
        String jugador1 = teclado.nextLine();

        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera):");
        String jugador2 = teclado.nextLine();

        if (jugador1.equals("piedra") && jugador2.equals("piedra")) {
            System.out.print("Empate");
        } else if (jugador1.equals("piedra") && jugador2.equals("papel")) {
            System.out.print("Gana el jugador 2");
        } else if (jugador1.equals("piedra") && jugador2.equals("tijeras")) {
            System.out.print("Gana el jugador 1");
        } else if (jugador1.equals("papel") && jugador2.equals("piedra")) {
            System.out.print("Gana el jugador 1");
        } else if (jugador1.equals("papel") && jugador2.equals("tijeras")) {
            System.out.print("Gana el jugador 2");
        } else if (jugador1.equals("papel") && jugador2.equals("papel")) {
            System.out.print("Empate");
        } else if (jugador1.equals("tijeras") && jugador2.equals("tijeras")) {
            System.out.print("Empate");
        } else if (jugador1.equals("tijeras") && jugador2.equals("piedra")){
            System.out.println("Gana el jugador 2");
        } else if (jugador1.equals("tijeras") && jugador2.equals("papel")){
            System.out.println("Gana el jugador 1");
        } else {
            System.out.print("Error");
        }

    }
}
