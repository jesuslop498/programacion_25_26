package mm.U7.Tarea2;

import java.util.LinkedList;
import java.util.List;

public class ej13 {
    public static <E extends Comparable<E>> List<E> fusion(List<E> lista1, List<E> lista2) {
        List<E> resultado = new LinkedList<>();

        int i = 0;
        int j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i).compareTo(lista2.get(j)) <= 0) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }
}