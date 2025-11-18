package mm.U3.Entregables.Modelo5;

public class ej2 {
    public static void main(String[] args) {

        int [] numero = new int [20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * (101));
        }

        int [] cuadrado = new int [20];

        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }

        int [] cubo = new int [20];

        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
        }

        int x = 1;

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(numero[i] + " ");
                System.out.print(cuadrado[i] + " ");
                System.out.print(cubo[i] + " ");
            }
            System.out.println();
        }
    }
}
