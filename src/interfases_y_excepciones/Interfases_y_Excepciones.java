/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfases_y_excepciones;

/**
 *
 * @author Win
 */
public class Interfases_y_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // --- CREACIÓN DE CLIENTES ---
        Cliente cliente1 = new Cliente("Juan");
        Cliente cliente2 = new Cliente("Jonás");
        Cliente cliente3 = new Cliente("Pedro");

        // --- CREACIÓN DE PEDIDOS ---
        Pedido pedido1 = new Pedido("pendiente de pago", cliente1);
        Pedido pedido2 = new Pedido("pendiente de pago", cliente2);
        Pedido pedido3 = new Pedido("pendiente de pago", cliente3);

        // --- CREACIÓN DE PRODUCTOS ---
        Producto producto1 = new Producto("Radio", 550.50);
        Producto producto2 = new Producto("Heladera", 890550.99);
        Producto producto3 = new Producto("Balanza", 56550.50);

        // --- AGREGAR PRODUCTOS A LOS PEDIDOS ---
        pedido1.agregarPedido(producto1);
        pedido2.agregarPedido(producto2);
        pedido3.agregarPedido(producto3);

        // --- MOSTRAR ESTADO INICIAL DEL PEDIDO 1 ---
        System.out.println("Estado inicial del pedido 1:");
        System.out.println(pedido1.getEstado());

        // --- CALCULAR Y MOSTRAR TOTAL DEL PEDIDO 1 ---
        double totalPedido1 = pedido1.calcularTotal();
        System.out.println("\nTotal del pedido 1: $" + totalPedido1);

        // --- USO DE PAYPAL PARA PROCESAR EL PAGO DEL PEDIDO 1 ---
        System.out.println("\n=== PROCESO DE PAGO CON PAYPAL ===");

        // Crear objeto PayPal
        PayPal paypal = new PayPal();

        // Aplicar un descuento del 10%
        double totalConDescuento = paypal.aplicarDescuento(totalPedido1, 10);
        System.out.println("Total con 10% de descuento: $" + totalConDescuento);

        // Procesar el pago
        paypal.procesarPago(totalConDescuento);

        // Cambiar estado del pedido y del cliente
        pedido1.cambioDeEstado("Pagado");
        System.out.println("Pedido 1 actualizado a: " + pedido1.getEstado());
        System.out.println("Cliente " + pedido1.getCliente() + " ahora tiene estado: " + pedido1.getEstado());

        // --- OPCIONAL: mostrar otros pedidos sin procesar pago ---
        System.out.println("\nEstado de los demás pedidos:");
        System.out.println("Pedido 2: " + pedido2.getEstado() + " | Cliente: " + pedido2.getCliente());
        System.out.println("Pedido 3: " + pedido3.getEstado() + " | Cliente: " + pedido3.getCliente());
    }    
}
