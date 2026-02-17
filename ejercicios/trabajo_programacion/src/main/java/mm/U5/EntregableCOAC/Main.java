package mm.U5.EntregableCOAC;

public class Main {

    public static void main(String[] args) {

        COAC concurso = new COAC();

        Chirigota ch = new Chirigota("Los Programadores",
                "Juan", "Pedro", "Luis",
                "Informáticos", 250, 3);

        Coro co = new Coro("Voces del Sur",
                "Antonio", "Antonio", "Pepe",
                "Marineros", 300, 12, 8);

        Comparsa comp = new Comparsa("La Resistencia",
                "Miguel", "Miguel", "Carlos",
                "Guerreros", 280, "Atrezzo Cádiz");

        Cuarteto cu = new Cuarteto("Los Cuatro Bits",
                "Ana", "Ana", "Ana",
                "Tecnológicos", 200, 4);

        Romancero ro = new Romancero("El Romance Loco",
                "Paco", "Paco", "Paco",
                "Poeta callejero", "Crítica social");

        concurso.inscribir_agrupacion(ch);
        concurso.inscribir_agrupacion(co);
        concurso.inscribir_agrupacion(comp);
        concurso.inscribir_agrupacion(cu);

        ch.cantar_la_presentacion();
        ch.hacer_tipo();
        ch.amo_a_escucha();
        ch.caminito_del_falla();

        System.out.println("\nOrdenado por puntos:");
        concurso.ordenar_por_puntos();
        System.out.println(concurso);

        System.out.println("\nTotal agrupaciones creadas: " +
                Agrupacion.getTotalAgrupaciones());
    }
}