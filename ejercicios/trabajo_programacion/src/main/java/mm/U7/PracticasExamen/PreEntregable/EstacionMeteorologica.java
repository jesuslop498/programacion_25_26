package mm.U7.PracticasExamen.PreEntregable;

import java.io.*;
import java.util.*;

public class EstacionMeteorologica {
    private List<Medicion> lista;
    private Coordenadas coordenadas;

    public EstacionMeteorologica(String nombreFichero, Coordenadas coordenadas) {
        this.lista = new ArrayList<>();
        this.coordenadas = coordenadas;

        // Cargar datos del fichero
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFichero))) {
            while (true) {
                Medicion m = (Medicion) ois.readObject();
                lista.add(m);
            }
        } catch (EOFException e) {
            // Fin del fichero (normal)
        } catch (Exception e) {
            System.out.println("Error al leer fichero: " + e.getMessage());
        }
    }

    public void addMedicion(Medicion m) {
        lista.add(m);
    }

    // Orden natural (temperatura ascendente)
    public void ordenaTemperaturasAsc() {
        Collections.sort(lista);
    }

    // Orden descendente de humedad → necesitamos Comparator
    public void ordenaHumedadesDesc() {
        Collections.sort(lista, new Comparator<Medicion>() {
            @Override
            public int compare(Medicion m1, Medicion m2) {
                return Integer.compare(m2.getHumedad(), m1.getHumedad());
            }
        });
    }

    public Medicion presionMaxima() {
        if (lista.isEmpty()) return null;

        Medicion max = lista.get(0);
        for (Medicion m : lista) {
            if (m.getPresion() > max.getPresion()) {
                max = m;
            }
        }
        return max;
    }

    public boolean buscaMedicion(Medicion m) {
        return lista.contains(m);
    }

    public void guardarFichero(String nombreFichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
            for (Medicion m : lista) {
                oos.writeObject(m);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar fichero: " + e.getMessage());
        }
    }

    public void mostrar() {
        for (Medicion m : lista) {
            System.out.println(m);
        }
    }
}