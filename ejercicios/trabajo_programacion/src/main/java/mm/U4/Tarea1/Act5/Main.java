package mm.U4.Tarea1.Act5;

public class Main {
    public static void main(String[] args) {

        Texto t = new Texto(20);

        t.cadenaAlPrincipio(" hola ");
        t.cadenaAlFinal("mundo ");
        t.caracterAlPrincipio('a');
        t.caracterAlFinal('b');


        System.out.println("Texto actual: " + t.obtenerTexto());
        System.out.println("Cantidad de vocales: " + t.contarVocales());

    }
}
