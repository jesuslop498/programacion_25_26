package mm.U7.PracticasExamen.ServicioEmpleo;

import java.io.*;
import java.util.*;

public class SAE implements Serializable {

    private Map<Integer, Oferta> ofertas;

    public SAE() {
        ofertas = new TreeMap<>();
    }

    // 1. Añadir oferta
    public boolean addOferta(Oferta o) {
        if (ofertas.containsKey(o.getCodigo())) return false;
        ofertas.put(o.getCodigo(), o);
        return true;
    }

    // 2. Añadir trabajador a oferta
    public boolean addTrabajador(Integer codigo, Trabajador t) {
        Oferta o = ofertas.get(codigo);
        if (o == null) return false;
        return o.getTrabajadores().add(t);
    }

    // 3. Eliminar trabajador
    public boolean removeTrabajador(Integer codigo, Trabajador t) {
        Oferta o = ofertas.get(codigo);
        if (o == null) return false;
        return o.getTrabajadores().remove(t);
    }

    // 4. Mostrar trabajadores (orden natural)
    public void mostrarTrabajadores(Integer codigo) {
        Oferta o = ofertas.get(codigo);
        if (o == null || o.getTrabajadores().isEmpty()) {
            System.out.println("No hay trabajadores");
            return;
        }
        o.getTrabajadores().forEach(System.out::println);
    }

    // 5. Mostrar trabajadores por edad
    public void mostrarTrabajadoresXEdad(Integer codigo) {
        Oferta o = ofertas.get(codigo);
        if (o == null || o.getTrabajadores().isEmpty()) {
            System.out.println("No hay trabajadores");
            return;
        }

        o.getTrabajadores().stream()
                .sorted(Comparator
                        .comparingInt(Trabajador::getEdad)
                        .thenComparing(Trabajador::getNombre))
                .forEach(System.out::println);
    }

    // 6. Cantidad de ofertas de un trabajador
    public int cantidadOfertas(String dni) {
        return (int) ofertas.values().stream()
                .filter(o -> o.getTrabajadores().stream()
                        .anyMatch(t -> t.getDni().equals(dni)))
                .count();
    }

    // 7. Mostrar ofertas ordenadas por nº trabajadores
    public void mostrarOfertas() {
        ofertas.values().stream()
                .sorted((o1, o2) ->
                        Integer.compare(o2.getTrabajadores().size(),
                                o1.getTrabajadores().size()))
                .forEach(o -> System.out.println(
                        o.getCodigo() + " - " +
                                o.getDescripcion() + " - " +
                                o.isCubierta()
                ));
    }

    // 8. Guardar datos
    public void guardarDatos() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("sae.dat"))) {
            oos.writeObject(ofertas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 9. Cargar datos
    public void cargarDatos() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("sae.dat"))) {
            ofertas = (Map<Integer, Oferta>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
