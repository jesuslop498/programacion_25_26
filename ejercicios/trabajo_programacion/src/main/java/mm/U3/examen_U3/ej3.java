package mm.U3.examen_U3;

import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {
        int[][] tabla = new int[4][6];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = (int) (Math.random() * (100 - 10) + 10);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Aqui podemos ver el resultado de la corteza: ");
        System.out.println(Arrays.toString(corteza(tabla)));
    }

    public static int[] corteza(int[][] n) {

        int[] res = new int[(n.length * 2) + (n[0].length * 2) - 3];

        int cont = 0;

//        Parte superior
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (i == 0) {
                    res[cont++] = n[i][j];
                }
            }
        }

//        Parte derecha
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (i > 0 && j == n[0].length - 1) {
                    res[cont++] = n[i][j];
                }
            }
        }

//        Parte inferior
//        Inversion de la parte inferior
        int[] aux = new int[n[0].length - 1];
        int contAux = n[0].length - 2;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (i == n.length - 1 && j < n[0].length - 1) {
                    aux[contAux--] = n[i][j];
                }
            }
        }

        for (int j : aux) {
            res[cont++] = j;
        }

//        Parte izquierda
//        Inversion de la parte inzquierda
        int [] col = new int[n.length - 1];
        int auxCol = n.length - 3;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (i < n.length - 1 && i > 0 && j == 0) {
                    col[auxCol--] = n[i][j];
                }
            }
        }

        for (int j : col) {
            res[cont++] = j;
        }

//        Ajustando tamaño para mostrar correctamente
        int x = (n.length * 2) + (n[0].length * 2) - 4;
        res = Arrays.copyOf(res, x);
        return res;
    }
}
