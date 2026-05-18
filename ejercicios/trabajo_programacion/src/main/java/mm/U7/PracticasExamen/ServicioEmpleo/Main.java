package mm.U7.PracticasExamen.ServicioEmpleo;

public class Main {
    public static void main(String[] args) {

        SAE sae = new SAE();

        // Crear ofertas
        sae.addOferta(new Oferta(1, "Programador Java"));
        sae.addOferta(new Oferta(2, "Administrador Sistemas"));
        sae.addOferta(new Oferta(3, "Analista"));
        sae.addOferta(new Oferta(4, "Soporte IT"));
        sae.addOferta(new Oferta(5, "Ciberseguridad"));

        // Crear trabajadores
        Trabajador t1 = new Trabajador("1", "Juan", "Perez", 30, "DAM");
        Trabajador t2 = new Trabajador("2", "Ana", "Lopez", 25, "DAW");
        Trabajador t3 = new Trabajador("3", "Luis", "Garcia", 35, "ASIR");
        Trabajador t4 = new Trabajador("4", "Marta", "Sanchez", 28, "DAM");
        Trabajador t5 = new Trabajador("5", "Carlos", "Ruiz", 40, "SMR");
        Trabajador t6 = new Trabajador("6", "Lucia", "Diaz", 22, "DAM");
        Trabajador t7 = new Trabajador("7", "Pedro", "Martin", 31, "DAW");
        Trabajador t8 = new Trabajador("8", "Elena", "Navarro", 29, "ASIR");
        Trabajador t9 = new Trabajador("9", "Pablo", "Romero", 27, "DAM");
        Trabajador t10 = new Trabajador("10", "Sara", "Torres", 33, "DAW");

        // Inscripciones
        sae.addTrabajador(1, t1);
        sae.addTrabajador(1, t2);
        sae.addTrabajador(2, t3);
        sae.addTrabajador(2, t4);
        sae.addTrabajador(3, t5);
        sae.addTrabajador(3, t6);
        sae.addTrabajador(4, t7);
        sae.addTrabajador(4, t8);
        sae.addTrabajador(5, t9);
        sae.addTrabajador(5, t10);

        // Pruebas
        System.out.println("Trabajadores oferta 1:");
        sae.mostrarTrabajadores(1);

        System.out.println("\nTrabajadores oferta 1 por edad:");
        sae.mostrarTrabajadoresXEdad(1);

        System.out.println("\nCantidad de ofertas de Juan:");
        System.out.println(sae.cantidadOfertas("1"));

        System.out.println("\nOfertas ordenadas:");
        sae.mostrarOfertas();

        // Guardar / cargar
        sae.guardarDatos();
        sae.cargarDatos();
    }
}
