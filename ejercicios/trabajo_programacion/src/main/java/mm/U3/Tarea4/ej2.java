package mm.U3.Tarea4;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };

        StringBuilder principio = new StringBuilder();

        StringBuilder fin = new StringBuilder();

        String[] palabras = new String[8];

        System.out.println("Escribe un total de 8 palabras: ");

        for (int i = 0; i < 8; i++) {
            System.out.println("Escribe palabra: ");
            palabras[i] = teclado.nextLine();
            boolean color = false;

            for (String s: colores) {
                if(s.equals(palabras[i])) {
                    principio.append(s).append(" ");
                    color = true;
                    break;
                }
            }
            if (!color) {
                fin.append(palabras[i]).append(" ");
            }
        }

        principio.append(fin);

        System.out.println(principio);

    }
}
