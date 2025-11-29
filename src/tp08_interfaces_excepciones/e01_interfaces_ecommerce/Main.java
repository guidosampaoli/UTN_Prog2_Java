package tp08_interfaces_excepciones.e01_interfaces_ecommerce;

/**
 * <h2>Interfaces en un sistema de E-commerce</h2>
 * <p>
 * 1. Crear una interfaz Pagable con el método calcularTotal().<br>
 * 2. Clase Producto: tiene nombre y precio, implementa Pagable.<br>
 * 3. Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido.
 * 4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios de pago (TarjetaCredito, PayPal),<br>
 * con métodos procesarPago(double) y aplicarDescuento(double).
 * 5. Crear una interfaz Notificable para notificar cambios de estado. 
 *    La clase Cliente implementa dicha interfaz y Pedido debe notificarlo al cambiar de estado.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ana Pérez", "anaperez@gmail.com");

        Producto p1 = new Producto("Auriculares", 82000.78);
        Producto p2 = new Producto("Mouse", 20450.99);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        
        //Listar productos
        System.out.println("Lista de productos en el carrito:\n");
        for (Producto p : pedido.getProductos()) {
            System.out.println(p);
        }

        //Calcular el total del pedido
        System.out.println("Total del pedido: $" + pedido.calcularTotal() + "\n");

        //Procesar pago con tarjeta de crédito
        TarjetaCredito t = new TarjetaCredito(cliente, "4128-2511-6891-0213");
        if (t.procesarPago(pedido.calcularTotal())) {
            pedido.cambiarEstado(Pedido.Estado.PAGADO);
        }        
        System.out.println("");

        //Cambiar el estado del pedido y notificar al cliente
        pedido.cambiarEstado(Pedido.Estado.ENVIADO);
        System.out.println("");

        //Procesar pago con PayPal
        System.out.println("//Ejemplo de pago a través de PayPal");
        PayPal pp = new PayPal("CuentaFalsa123", cliente);
        pp.procesarPago(pedido.calcularTotal());
    }
}