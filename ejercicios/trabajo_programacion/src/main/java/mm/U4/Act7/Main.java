package mm.U4.Act7;

public class Main {
    public static void main(String[] args) {

        SintonizadorFM sintonizador = new SintonizadorFM();

        System.out.println("Frecuencia inicial:");
        sintonizador.display();

        System.out.println("Subiendo la frecuencia:");
        sintonizador.up();
        sintonizador.up();
        sintonizador.display();

        System.out.println("Bajando la frecuencia:");
        sintonizador.down();
        sintonizador.display();

        System.out.println("Subiendo hasta superar 108 MHz:");
        for (int i = 0; i < 60; i++) {
            sintonizador.up();
        }
        sintonizador.display();

        System.out.println("Bajando hasta superar 80 MHz:");
        for (int i = 0; i < 60; i++) {
            sintonizador.down();
        }
        sintonizador.display();
    }
}
