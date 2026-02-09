package mm.U5.Tarea3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ej1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        System.out.println("Lista original: " + numeros);

        numeros.sort(Comparator.reverseOrder());

        System.out.println("Lista ordenada (decreciente): " + numeros);
    }
}
