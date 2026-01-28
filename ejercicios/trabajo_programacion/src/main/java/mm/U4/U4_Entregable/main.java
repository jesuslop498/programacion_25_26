package mm.U4.U4_Entregable;

public class Main {
    public static void main(String[] args) {
        //Creacion de los capitulos de manera correcta
        Capitulo c1 = new Capitulo(10, "Malasa", Formato.TEXTO);
        Capitulo c2 = new Capitulo(13, "Pensar", Formato.INTERACTIVO);
        Capitulo c3 = new Capitulo(1, "Leer", Formato.ILUSTRADO);
        Capitulo c4 = new Capitulo(2, "Escribir", Formato.TEXTO);
        Capitulo c5 = new Capitulo(3, "Soñar", Formato.INTERACTIVO);
        Capitulo c6 = new Capitulo(4, "Imaginar", Formato.ILUSTRADO);

        //Creacion de los libros e implementacion de los capitulos correspondientes
        Libro l1 = new Libro("Estrella", "Velazquez", 2001);
        l1.addCapitulo(c1);
        l1.addCapitulo(c2);

        Libro l2 = new Libro("Oriente", "Cristobal", 2005);
        l2.addCapitulo(c3);
        l2.addCapitulo(c4);

        Libro l3 = new Libro("Paisaje", "Paco", 2009);
        l3.addCapitulo(c5);
        l3.addCapitulo(c6);

        //Creacion de la biblioteca e implementeacion de los libros
        Biblioteca b1 = new Biblioteca("Sevillana");
        b1.addLibros(l1);
        b1.addLibros(l2);
        b1.addLibros(l3);

        //Mostramos informacion de todas las clases
        System.out.println();
        b1.mostrar_informacion();

        System.out.println();
        l1.mostrar_informacion();

        System.out.println();
        c1.mostrar_informacion();

        //PRUEBAS
        System.out.println();

        //Añadir capitulo con mismo numero que otro capitulo en un libro
        Capitulo c10 = new Capitulo(10, "Error", Formato.TEXTO);
        l1.addCapitulo(c10);
        System.out.println();

        //Eliminar capitulo de un libro y mostrar capitulos
        l1.eliminarCapitulo(10);
        l1.mostrar_capitulos();
        System.out.println();

        //Mostrar libros de biblioteca
        b1.mostrar_libros();
        System.out.println();

        //Mostrar detalles del capitulo, es equivalente al mostrar informacion del mismo
        c4.mostrar_informacion();
        System.out.println();

        //Crearemos otra biblioteca para comprobar si el responsable sigue siendo el mismo
        Biblioteca b2 = new Biblioteca("Marsella");
        b2.addLibros(l3);
        b2.mostrar_informacion();
    }
}
