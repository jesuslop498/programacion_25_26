package mm.U7.Tarea1;

import java.util.ArrayList;
import java.util.Random;

public class ej3 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {

            int num = random.nextInt(10);

            int j = 0;

            while (j < lista.size() && lista.get(j) > num) {
                j++;
            }

            lista.add(j, num);
        }

        System.out.println("Lista ordenada de forma decreciente:");
        System.out.println(lista);
    }
}