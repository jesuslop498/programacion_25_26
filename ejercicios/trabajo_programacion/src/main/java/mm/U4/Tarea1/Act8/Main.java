package mm.U4.Tarea1.Act8;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa(5);

        System.out.println("Estado inicial de las bombillas:");
        casa.mostrarEstadoBombillas();

        casa.controlarInterruptorBombilla(0, true);
        casa.controlarBombilla(0, true);

        casa.controlarInterruptorBombilla(2, true);
        casa.controlarBombilla(2, true);

        System.out.println("\nEstado después de encender algunas bombillas:");
        casa.mostrarEstadoBombillas();

        casa.desactivarLuzGeneral();

        System.out.println("\nIntentando encender bombillas cuando la luz general está apagada:");
        casa.controlarBombilla(1, true);
        casa.mostrarEstadoBombillas();

        casa.activarLuzGeneral();

        System.out.println("\nEstado después de reparar el fusible y activar la luz general:");
        casa.mostrarEstadoBombillas();
    }

}
