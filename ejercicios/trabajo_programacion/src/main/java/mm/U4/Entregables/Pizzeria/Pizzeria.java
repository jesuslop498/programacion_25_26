package mm.U4.Entregables.Pizzeria;

public class Pizzeria {

    private Pedido[] pedidos;
    private int numPedidos;

    public Pizzeria() {
        this(5);
    }

    public Pizzeria(int capacidadInicial) {
        pedidos = new Pedido[capacidadInicial];
        numPedidos = 0;
    }

    public void addPedido(Pedido pedido) {
        if (numPedidos == pedidos.length) {
            ampliarCapacidad();
        }
        pedidos[numPedidos++] = pedido;
    }

    private void ampliarCapacidad() {
        Pedido[] nuevo = new Pedido[pedidos.length * 2];
        for (int i = 0; i < pedidos.length; i++) {
            nuevo[i] = pedidos[i];
        }
        pedidos = nuevo;
    }

    public void mostrarPedidos() {
        for (int i = 0; i < numPedidos; i++) {
            pedidos[i].mostrarPedido();
            System.out.println("-------------------");
        }
    }

    public int getCantidadPedidos() {
        return numPedidos;
    }
}

