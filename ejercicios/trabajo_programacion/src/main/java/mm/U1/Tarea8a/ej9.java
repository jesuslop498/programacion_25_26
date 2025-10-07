package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        int max = Integer.MIN_VALUE;
        int idArbolmax = -1;
        int idArbol = 0;

        System.out.print("Introduce las alturas de los arboles en centimetros (introduce -1 para terminar): ");

        while (true) {
            System.out.print("Arbol " + idArbol + ": ");
            altura = teclado.nextInt();

            if (altura == -1) {
                break;
            }

            if (altura > max) {
                max = altura;
                idArbolmax = idArbol;
            }
            idArbol++;
        }
        if (idArbolmax != -1) {
            System.out.println("El arbol mas alto es el arbol: " + idArbolmax);
        }

    }
    }

