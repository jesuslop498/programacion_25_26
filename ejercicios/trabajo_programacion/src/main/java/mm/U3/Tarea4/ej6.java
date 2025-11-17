package mm.U3.Tarea4;

public class ej6 {
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
        System.out.println();
        System.out.println("Posiciones del maximo y el minimo: ");
        int max = 0;
        int min = 1000;

        String posicionMax = "";
        String posicionMin = "";

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                    posicionMax = String.valueOf(i) + " " + String.valueOf(j);
                } else if (tabla[i][j] < min){
                    min = tabla[i][j];
                    posicionMin = String.valueOf(i) + " " + String.valueOf(j);
                }
            }
        }

        System.out.println("Max: " + posicionMax + " con valor: " + max);
        System.out.println("Min: " + posicionMin + " con valor: " + min);
    }
}
