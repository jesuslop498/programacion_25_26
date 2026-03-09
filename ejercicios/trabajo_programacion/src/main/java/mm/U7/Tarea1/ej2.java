package mm.U7.Tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ej2 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(100));
        }

        System.out.println("Lista original:");
        System.out.println(lista);

        Collections.sort(lista, Collections.reverseOrder());

        System.out.println("Lista ordenada:");
        System.out.println(lista);
    }
}
