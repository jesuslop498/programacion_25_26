package mm.U7.Tarea2;

import java.util.HashSet;
import java.util.Set;

public class ej10 {
    public static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2);

        return resultado;
    }
}
