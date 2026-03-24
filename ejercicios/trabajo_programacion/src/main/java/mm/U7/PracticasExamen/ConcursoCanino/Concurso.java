package mm.U7.PracticasExamen.ConcursoCanino;

import java.io.*;
import java.util.*;

public class Concurso {
    private String nombre;
    private String localidad;

    // Mapa: raza -> lista de perros
    private Map<String, List<Perro>> perrosPorRaza;

    public Concurso(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.perrosPorRaza = new HashMap<>();
    }

    // Añadir perro
    public void addDog(String raza, Perro perro) {
        if (!perro.getRaza().equalsIgnoreCase(raza)) {
            System.out.println("Error: la raza no coincide");
            return;
        }

        perrosPorRaza.putIfAbsent(raza, new ArrayList<>());
        perrosPorRaza.get(raza).add(perro);
    }

    // Eliminar perro
    public void disqualifyDog(Perro perro) {
        boolean eliminado = false;

        for (List<Perro> lista : perrosPorRaza.values()) {
            if (lista.remove(perro)) {
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("Perro no inscrito");
        }
    }

    // Mostrar perros de un propietario
    public void ownerDogs(int numSocio) {
        boolean encontrado = false;

        for (List<Perro> lista : perrosPorRaza.values()) {
            for (Perro p : lista) {
                if (p.getPropietario().getNumSocio() == numSocio) {
                    System.out.println(p);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Este socio no tiene perros inscritos");
        }
    }

    // Perros por peso (descendente)
    public void perrosPorPeso(String raza) {
        List<Perro> lista = perrosPorRaza.get(raza);

        if (lista == null) return;

        lista.stream()
                .sorted((a, b) -> Double.compare(b.getPeso(), a.getPeso()))
                .forEach(System.out::println);
    }

    // Perros por edad (descendente)
    public void perrosPorEdad(String raza) {
        List<Perro> lista = perrosPorRaza.get(raza);

        if (lista == null) return;

        lista.stream()
                .sorted((a, b) -> Integer.compare(b.getEdad(), a.getEdad()))
                .forEach(System.out::println);
    }

    // Guardar en fichero
    public void guardarPerros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"))) {

            for (List<Perro> lista : perrosPorRaza.values()) {
                for (Perro p : lista) {
                    oos.writeObject(p);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar desde fichero
    public void cargarPerros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"))) {

            while (true) {
                Perro p = (Perro) ois.readObject();
                addDog(p.getRaza(), p);
            }

        } catch (EOFException e) {
            System.out.println("Carga completada");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}