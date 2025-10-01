package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Programador Junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");

        System.out.println("Introduce el cargo del empleado (1 - 3)");
        int cargo = teclado.nextInt();

        System.out.println("¿Cuantos dias ha estado viajando visitando clientes? ");
        int dias = teclado.nextInt();

        System.out.println("Introduce su estado civil (1 - Soltero, 2 - Casado) ");
        int civil = teclado.nextInt();

        int sueldo = 0;
        switch (cargo) {
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;
            default:
                System.out.print("Cargo introducido incorrecto");
        }

        int irpf = 0;
        switch (civil) {
            case 1:
                irpf = 25;
                break;
            case 2:
                irpf = 20;
                break;
            default:
                System.out.print("Estado civil incorrecto");
        }
        int bruto = sueldo + (dias * 30);
        int retencion = (bruto * irpf) / 100;
        System.out.println("| -------------------------- |");
        System.out.println("| Sueldo base: " + sueldo);
        System.out.println("| Dietas  ( " + dias + " viajes) " + (30 * dias));
        System.out.println("| -------------------------- |");
        System.out.println("| Sueldo bruto " + bruto);
        System.out.println("| Retencion IRPF " + "(" + irpf + "%) " + retencion);
        System.out.println("| ------------------------------------ |");
        System.out.println("| Sueldo neto " + (bruto - retencion));
    }
}
