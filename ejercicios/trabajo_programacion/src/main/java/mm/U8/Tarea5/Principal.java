package mm.U8.Tarea5;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Futbolista> seleccion = new ArrayList<>();

        seleccion.add(new Futbolista(1, "Casillas",
                new ArrayList<String>() {{
                    add("Portero");
                }},
                "Real Madrid"));
        seleccion.add(new Futbolista(15, "Ramos",
                new ArrayList<String>() {{
                    add("Lateral derecho");
                    add("Medio centro");
                }},
                "Real Madrid"));
        seleccion.add(new Futbolista(3, "Pique",
                new ArrayList<String>() {{
                    add("Central");
                }},
                "FC Barcelona"));

        // Mostrar JSON manual
        System.out.println("JSON generado:\n");

        System.out.println("[");

        for (int i = 0; i < seleccion.size(); i++) {
            System.out.print(seleccion.get(i));

            if (i < seleccion.size() - 1) {
                System.out.println(",");
            }
        }

        System.out.println("\n]");

        // Obtener demarcaciones de Ramos
        ArrayList<String> demarcacionesRamos = new ArrayList<>();

        for (Futbolista f : seleccion) {
            if (f.getNombre().equalsIgnoreCase("Ramos")) {
                demarcacionesRamos = f.getDemarcaciones();
                break;
            }
        }

        System.out.println("\nDemarcaciones de Ramos:");
        System.out.println(demarcacionesRamos);
    }
}