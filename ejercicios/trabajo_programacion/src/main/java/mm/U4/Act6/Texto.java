package mm.U4.Act6;

public class Texto {
    private String cadena;
    private int longitudMax;

    public Texto(int longitudMax) {
        this.cadena = "";
        this.longitudMax = longitudMax;
    }

    public void caracterAlPrincipio (char caracter) {
        if (cadena.length() < longitudMax) {
            cadena = caracter + cadena;
        } else {
            System.out.println("La cadena posee el maximo de caracteres.");
        }
    }

    public void caracterAlFinal (char caracter) {
        if (cadena.length() < longitudMax) {
            cadena = cadena + caracter;
        } else {
            System.out.println("La cadena posee el maximo de caracteres.");
        }
    }

    public void cadenaAlPrincipio (String texto) {
        if (cadena.length() + texto.length() <= longitudMax) {
            cadena = texto + cadena;
        } else {
            System.out.println("La cadena posee el maximo de caracteres.");
        }
    }

    public void cadenaAlFinal (String texto) {
        if (cadena.length() + texto.length() <= longitudMax) {
            cadena = cadena + texto;
        } else {
            System.out.println("La cadena posee el maximo de caracteres.");
        }
    }

    public int contarVocales () {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cadena.length(); i++) {
                if (vocales.indexOf(cadena.charAt(i)) != 1){
                    contador++;
                }
        }
        return contador;
    }
    public String obtenerTexto() {
        return cadena;
    }
}
