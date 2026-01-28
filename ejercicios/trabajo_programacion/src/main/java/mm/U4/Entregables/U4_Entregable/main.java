package mm.U4.Entregables.U4_Entregable;

public class main {
    public static void main(String[] args) {

        // Creamos el festival
        Festival f1 = new Festival();

        // Creamos 3 conciertos
        Concierto c1 = new Concierto("Cocacola", "20 de marzo");
        Concierto c2 = new Concierto("Cocacola", "21 de marzo");
        Concierto c3 = new Concierto("Cocacola", "22 de marzo");

        // Los agregamos al festival
        f1.agregarConcierto(c1);
        f1.agregarConcierto(c2);
        f1.agregarConcierto(c3);

        // Escenarios
        Escenario c1e1 = new Escenario("Brillo", "Este", 2500);
        Escenario c1e2 = new Escenario("Oscuridad", "Oeste", 2500);
        Escenario c1e3 = new Escenario("Luz", "Sur", 2500);

        Escenario c2e1 = new Escenario("Brillo", "Este", 2500);
        Escenario c2e2 = new Escenario("Oscuridad", "Oeste", 2500);
        Escenario c2e3 = new Escenario("Luz", "Sur", 2500);

        Escenario c3e1 = new Escenario("Brillo", "Este", 2500);
        Escenario c3e2 = new Escenario("Oscuridad", "Oeste", 2500);
        Escenario c3e3 = new Escenario("Luz", "Sur", 2500);

        // Agregamos escenarios a conciertos
        c1.agregarEscenario(c1e1);
        c1.agregarEscenario(c1e2);
        c1.agregarEscenario(c1e3);

        c2.agregarEscenario(c2e1);
        c2.agregarEscenario(c2e2);
        c2.agregarEscenario(c2e3);

        c3.agregarEscenario(c3e1);
        c3.agregarEscenario(c3e2);
        c3.agregarEscenario(c3e3);

        // Cantantes
        Cantante serko = new Cantante("Pedro", "Serko", 25, "Terrassa");
        Cantante munin = new Cantante("Federico", "Munin", 27, "Segovia");

        // Añadimos cantantes a TODOS los escenarios
        Escenario[] escenarios = {
                c1e1, c1e2, c1e3,
                c2e1, c2e2, c2e3,
                c3e1, c3e2, c3e3
        };

        for (Escenario e : escenarios) {
            e.agregarCantante(serko);
            e.agregarCantante(munin);
        }

        // Canciones (representamos TODOS los géneros)
        Cancion s1 = new Cancion("Gol", 2.13, genero.TRAP, serko);
        Cancion s2 = new Cancion("Mareas", 2.47, genero.EMORAP, serko);

        Cancion m1 = new Cancion("Noche", 3.01, genero.NEOPERREO, munin);
        Cancion m2 = new Cancion("Sombras", 2.55, genero.TRAP, munin);

        // Añadimos canciones a cantantes
        serko.insertarCancion(s1);
        serko.insertarCancion(s2);

        munin.insertarCancion(m1);
        munin.insertarCancion(m2);

        // PRUEBAS POR CONSOLA
        System.out.println("===== FESTIVAL =====");
        f1.mostrar_informacion();

        System.out.println("===== CARTELERA CONCIERTO 1 =====");
        c1.mostrarCartelera();

        System.out.println("===== CANCIONES DE SERKO =====");
        serko.mostrarListaCanciones();

        System.out.println("===== DATOS ESCENARIO =====");
        c1e1.datosEscenario();

        c1.programarConcierto("25 de marzo");

        System.out.println("===== ELIMINAMOS UNA CANCIÓN DE SERKO =====");
        serko.eliminarCancionPorTitulo("Gol");
        serko.mostrarListaCanciones();

        System.out.println("===== INFORMACIÓN COMPLETA DEL FESTIVAL =====");
        f1.mostrar_informacion();


    }
}
