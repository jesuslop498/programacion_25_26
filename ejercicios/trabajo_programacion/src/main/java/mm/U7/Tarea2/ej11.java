package mm.U7.Tarea2;

import java.util.HashSet;
import java.util.Set;

public class ej11 {
    public static <E> Set<E> diferencia(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.removeAll(conjunto2);

        return resultado;
    }
}
