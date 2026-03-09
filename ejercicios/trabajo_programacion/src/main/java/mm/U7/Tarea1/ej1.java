package mm.U7.Tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ej1 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        // Generar 20 números aleatorios menores de 100
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(100));
        }

        // Mostrar lista original
        System.out.println("Lista original:");
        System.out.println(lista);

        // Ordenar lista
        Collections.sort(lista);

        // Mostrar lista ordenada
        System.out.println("Lista ordenada:");
        System.out.println(lista);

    }
}
