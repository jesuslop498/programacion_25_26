package mm.U4.Tarea1.Act9;

public class Main {
    public static void main(String[] args) {

        // ===== PERSONAL =====
        Maquinista maquinista = new Maquinista(
                "Juan Pérez Gómez",
                "12345678A",
                2500.0,
                "Senior"
        );

        Mecanico mecanico = new Mecanico(
                "Luis Martínez",
                "600123456",
                "Frenos"
        );

        JefesEstacion jefe = new JefesEstacion(
                "Ana Rodríguez",
                "87654321B"
        );

        // ===== MAQUINARIA =====
        Locomotora locomotora = new Locomotora(
                "LOC-2024",
                3200,
                2018,
                mecanico
        );

        Tren tren = new Tren(locomotora, maquinista);

        // ===== VAGONES =====
        tren.agregarVagon(10000, 8000, "Carbón");
        tren.agregarVagon(12000, 6000, "Madera");
        tren.agregarVagon(8000, 5000, "Cemento");

        System.out.println("Tren creado correctamente con maquinista y vagones.");
    }
}

