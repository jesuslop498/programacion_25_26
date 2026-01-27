package mm.U4.Entregables.ObraVivienda;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Material.setIva(21);

        // ===== VIVIENDA 1 (con dos baños) =====
        Vivienda v1 = new Vivienda("Calle Mayor 10", 120);
        v1.addEstancia(Estancias.SALON);
        v1.addEstancia(Estancias.COCINA);
        v1.addEstancia(Estancias.BANO);
        v1.addEstancia(Estancias.BANO);
        v1.addEstancia(Estancias.DORMITORIO);

        ManoDeObra m1 = new ManoDeObra(
                "Reformas López",
                "Reforma integral del baño",
                80,
                3
        );

        Obra o1 = new Obra(
                v1,
                m1,
                Estancias.BANO,
                Calendar.getInstance()
        );

        Material mat1 = new Material("Azulejos", "Cerámicas SA", 50, 20);
        Material mat2 = new Material("Cemento", 10, 8);

        o1.addMaterial(mat1);
        o1.addMaterial(mat2);
        o1.eliminarMaterial(0); // eliminamos azulejos


        // ===== VIVIENDA 2 =====
        Vivienda v2 = new Vivienda("Avenida Andalucía 25", 90);
        v2.addEstancia(Estancias.SALON);
        v2.addEstancia(Estancias.DORMITORIO);
        v2.addEstancia(Estancias.COCINA);
        v2.addEstancia(Estancias.BALCON);

        ManoDeObra m2 = new ManoDeObra(
                "Construcciones Pérez",
                "Cambio de suelo",
                40,
                2
        );

        Obra o2 = new Obra(
                v2,
                m2,
                Estancias.SALON,
                Calendar.getInstance()
        );

        Material mat3 = new Material("Tarima flotante", "Maderas SL", 30, 25);
        Material mat4 = new Material("Rodapié", 20, 5);

        o2.addMaterial(mat3);
        o2.addMaterial(mat4);
        o2.eliminarMaterial(1); // eliminamos rodapié


        // ===== VIVIENDA 3 =====
        Vivienda v3 = new Vivienda("Plaza España 3", 150);
        v3.addEstancia(Estancias.SALON);
        v3.addEstancia(Estancias.COMEDOR);
        v3.addEstancia(Estancias.DORMITORIO);
        v3.addEstancia(Estancias.TERRAZA);

        ManoDeObra m3 = new ManoDeObra(
                "Obras del Sur",
                "Reforma de terraza",
                60,
                4
        );

        Obra o3 = new Obra(
                v3,
                m3,
                Estancias.TERRAZA,
                Calendar.getInstance()
        );

        Material mat5 = new Material("Baldosas exterior", "Pavimentos SL", 40, 18);
        Material mat6 = new Material("Mortero", 15, 7);

        o3.addMaterial(mat5);
        o3.addMaterial(mat6);

        // Cambiamos el IVA de nuevo
        Material.setIva(10);

        // Mostrar estancias posibles (método de clase)
        Vivienda.mostrarEstancias();

        System.out.println("Programa de prueba finalizado correctamente.");
    }
}