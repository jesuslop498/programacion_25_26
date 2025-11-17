package mm.U3.Entregables.ModeloTablero;

public class ej2 {
    public static void main(String[] args) {

        int x = 6;
        int y = 10;

        int[][] tabla = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                tabla[i][j] = (int) (Math.random() * 1001);
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        int max = 0;
        int min = 1000;

        StringBuilder posicionMax = new StringBuilder();
        StringBuilder posicionMin = new StringBuilder();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tabla[i][j]> max) {
                    max = tabla[i][j];
                    posicionMax.setLength(0);
                    posicionMax.append(String.valueOf(i)).append(" ").append(String.valueOf(j));
                } else if (tabla[i][j] < min) {
                    min = tabla[i][j];
                    posicionMin.setLength(0);
                    posicionMin.append(String.valueOf(i)).append(" ").append(String.valueOf(j));
                }
            }
        }

        System.out.println("La posicion del maximo es: " + posicionMax + " Y el valor es: " + max);
        System.out.println("La posicion del minimo es: " + posicionMin + " Y el valor es: " + min);
    }
}
