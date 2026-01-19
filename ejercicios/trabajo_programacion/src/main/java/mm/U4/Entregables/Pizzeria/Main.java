package mm.U4.Entregables.Pizzeria;

public class Main {

    public static void main(String[] args) {

        // Mostrar tamaños disponibles
        System.out.println("Tamaños de pizza disponibles:");
        Pizza.mostrarTamanosDisponibles();
        System.out.println();

        // Crear una pizzería con capacidad inicial por defecto (5)
        Pizzeria pizzeria = new Pizzeria();

        // Crear ingredientes
        Ingrediente jamon = new Ingrediente("Jamón", 280);
        Ingrediente champinon = new Ingrediente("Champiñón", 30);
        Ingrediente aceitunas = new Ingrediente("Aceitunas", 150);

        // Crear una pizza mediana
        Pizza pizza1 = new Pizza(Size.MEDIANA);
        pizza1.addIngrediente(jamon);
        pizza1.addIngrediente(champinon);
        pizza1.addIngrediente(aceitunas);

        // Crear pedido normal
        Pedido pedido1 = new Pedido(pizza1);
        pizzeria.addPedido(pedido1);

        // Crear pizza por defecto (familiar)
        Pizza pizza2 = new Pizza();
        pizza2.addIngrediente(new Ingrediente()); // queso por defecto
        pizza2.addIngrediente(jamon);

        Pedido pedido2 = new Pedido(pizza2);
        pizzeria.addPedido(pedido2);

        // Crear pedido estrella (familiar con jamón ibérico y queso)
        Pedido pedidoEstrella = Pedido.pedidoEstrella();
        pizzeria.addPedido(pedidoEstrella);

        // Mostrar todos los pedidos realizados
        System.out.println("PEDIDOS REALIZADOS:");
        pizzeria.mostrarPedidos();

        // Mostrar cantidad total de pedidos
        System.out.println("Total de pedidos realizados: " + pizzeria.getCantidadPedidos());
    }
}

