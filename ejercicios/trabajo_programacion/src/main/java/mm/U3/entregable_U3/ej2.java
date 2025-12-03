package mm.U3.entregable_U3;

import java.util.Arrays;

public class ej2 {
    public static int [] insertarValor (int [] v1, int valor, int pos) {
        int [] res = new int[v1.length+1];

        if (pos> v1.length) {
            System.out.println("La posicion no es correcta.");
            return v1;
        }

        int aux = 0;

        for (int i = 0; i < v1.length; i++) {
            if (i != pos) {
                res[aux++] = v1[i];
            } else {
                res[aux++] = valor;
                res[aux++] = v1[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int [] v= { 1 , 2 , 3 , 4 , 5 };

        System.out.println("Ejemplo correcto: ");
        System.out.println(Arrays.toString(insertarValor(v, 8, 3)));
        System.out.println("Ejemplo incorrecto: ");
        System.out.println(Arrays.toString(insertarValor(v, 8, 10)));
    }
}
