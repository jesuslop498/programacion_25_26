package mm.U7.U7_Examen;

import mm.U7.PracticasExamen.Filmafinnity.Filmaffinity;

import java.io.*;
import java.util.*;

public class GestorMilitar implements Serializable {
    Map<String, Set<Aeronave>> aeronave = new HashMap<>();
    Map<String, Set<Armamento>> armamento = new HashMap<>();
    Map<Aeronave, Set<Armamento>> AeronaveArmamento = new HashMap<>();
    Map<Armamento, Set<Aeronave>> ArmamentoAeronave = new HashMap<>();


    public void addEquipamiento(Aeronave a, Armamento arm) {
        Set<Armamento> conjunto_armamento = AeronaveArmamento.get(a);

        if (conjunto_armamento == null) {
            conjunto_armamento = new HashSet<>();
            conjunto_armamento.add(arm);
            AeronaveArmamento.put(a, conjunto_armamento);
        } else {
            conjunto_armamento.add(arm);
        }
    }

    public List<Armamento> getArmamento(Aeronave a) {
        List<Armamento> lista = new ArrayList<>(AeronaveArmamento.getOrDefault(a, new HashSet<>()));

        lista.sort(Comparator.comparing(Armamento::getNombre));
        return lista;
    }

    public List<Aeronave> getAeronaves(Armamento arm) {
        List<Aeronave> lista = new ArrayList<>(ArmamentoAeronave.getOrDefault(arm, new HashSet<>()));

        lista.sort(Comparator.comparing(Aeronave::getNombre));

        return lista;
    }

    public Aeronave getAeronave(String designacion) {
        return (Aeronave) aeronave.get(designacion);
    }

    public void removeAeronave(String designacion) {
        Set<Aeronave> conjunto_Aeronave = aeronave.get(designacion);

        Iterator<Aeronave> it = conjunto_Aeronave.iterator();

        boolean aeronave_encontrada = false;

        while (it.hasNext()) {
            Aeronave a = it.next();
            if (a.equals(designacion)) {
                aeronave_encontrada = true;
                it.remove();
                System.out.println("Aeronave eliminada");
                break;
            }
        }

        if (aeronave_encontrada) {
            if (conjunto_Aeronave.isEmpty()) {
                aeronave.remove(designacion);
            }
        } else {
            System.out.println("No se ha encontrado la aeronave");
        }
    }

    public Armamento getArmamentoPorNombre(String nombre) {
        return (Armamento) armamento.get(nombre);
    }

    public void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("inventario_militar.dat"))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("inventario_militar.dat"))) {
            ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "GestorMilitar{" +
                "aeronave=" + aeronave +
                ", armamento=" + armamento +
                ", AeronaveArmamento=" + AeronaveArmamento +
                ", ArmamentoAeronave=" + ArmamentoAeronave +
                '}';
    }
}
