package mm.U7.Tarea1;

import java.util.ArrayList;
import java.util.Random;

public class ej5 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        while (lista.size() < 20) {

            int num = random.nextInt(100);

            if (!lista.contains(num)) {

                int i = 0;

                while (i < lista.size() && lista.get(i) > num) {
                    i++;
                }

                lista.add(i, num);
            }
        }

        System.out.println("Lista ordenada de forma decreciente:");
        System.out.println(lista);
    }
}