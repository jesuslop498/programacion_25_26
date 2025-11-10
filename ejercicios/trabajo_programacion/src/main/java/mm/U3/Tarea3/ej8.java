package mm.U3.Tarea3;

public class ej8 {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;
        int[][] tabla = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                tabla[i][j] = i + j;
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
