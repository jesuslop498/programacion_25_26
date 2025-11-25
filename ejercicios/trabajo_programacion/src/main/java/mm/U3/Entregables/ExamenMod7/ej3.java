package mm.U3.Entregables.ExamenMod7;

import java.util.Arrays;

public class ej3 {
    public static String[] invertir(String cadena) {

        cadena = cadena.toUpperCase();

        String [] texto = new String[cadena.length()];

        for (int i = 0; i < texto.length; i++) {
            texto[i] = String.valueOf(cadena.charAt(i));
        }

        for (int i = 0; i < texto.length / 2; i++) {
            String temp = texto[i];
            texto[i] = texto[texto.length - 1 - i];
            texto[texto.length - 1 - i] = temp;
        }


        return texto;

    }
    public static String[] desplazarVocales(String cadena) {
        cadena = cadena.toLowerCase();

        String [] texto = new String[cadena.length()];

        for (int i = 0; i < texto.length; i++) {
            texto[i] = String.valueOf(cadena.charAt(i));
        }

        for (int i = 0; i < texto.length; i++) {
            switch (texto[i]) {
                case "a":
                    texto[i] = "e";
                    break;
                case "e":
                    texto[i] = "i";
                    break;
                case "i":
                    texto[i] = "o";
                    break;
                case "o":
                    texto[i] = "u";
                    break;
                case "u":
                    texto[i] = "a";
                    break;
            }
        }

        return texto;
    }

    public static void main(String[] args) {
        String hola = "hola";

        System.out.println(Arrays.toString(invertir(hola)));
        System.out.println(Arrays.toString(desplazarVocales(hola)));
    }


}
