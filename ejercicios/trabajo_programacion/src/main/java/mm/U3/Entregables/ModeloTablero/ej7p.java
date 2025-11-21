package mm.U3.Entregables.ModeloTablero;

public class ej7p {
    public static void main(String[] args) {

        int x = 6;
        int y = 10;
        int[][] tabla = new int[x][y];
        boolean[] usados = new boolean[1001];


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                int num = 0;

                do {
                    num = (int) (Math.random() * 1001);
                } while (usados[num]);

                usados[num] = true;
                tabla[i][j] = num;

                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }


        int max = 0;
        int min = 1000;
        StringBuilder posMax = new StringBuilder();
        StringBuilder posMin = new StringBuilder();

        System.out.println();


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (tabla[i][j] < min) {
                    min = tabla[i][j];
                    posMin.setLength(0);
                    posMin.append(String.valueOf(i)).append(" ").append(String.valueOf(j));
                } else if (tabla[i][j] > max) {
                    max = tabla[i][j];
                    posMax.setLength(0);
                    posMax.append(String.valueOf(i)).append(" ").append(String.valueOf(j));
                }
            }
        }

        System.out.println("El numero max es: " + max + " en la pos: " + posMax);
        System.out.println("El numero min es: " + min + " en la pos: " + posMin);
    }
}
