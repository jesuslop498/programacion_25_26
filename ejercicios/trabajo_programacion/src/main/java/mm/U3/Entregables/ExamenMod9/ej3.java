package mm.U3.Entregables.ExamenMod9;

public class ej3 {
    public static void main(String[] args) {
        int[][] tabla = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        System.out.println(cuadroMagico(tabla));

    }

    public static boolean cuadroMagico(int[][] tabla) {

        int n = tabla.length;
        int sumaObjetivo = 0;

        // Suma de la primera fila como referencia
        for (int j = 0; j < n; j++) {
            sumaObjetivo += tabla[0][j];
        }

        // Comprobar filas
        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += tabla[i][j];
            }
            if (sumaFila != sumaObjetivo) return false;
        }

        // Comprobar columnas
        for (int j = 0; j < n; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += tabla[i][j];
            }
            if (sumaCol != sumaObjetivo) return false;
        }

        return true;
    }

}
