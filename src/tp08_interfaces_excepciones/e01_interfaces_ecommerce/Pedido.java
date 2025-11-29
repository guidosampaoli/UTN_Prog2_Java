package tp08_interfaces_excepciones.e01_interfaces_ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    public enum Estado {CREADO, PAGADO, ENVIADO, CANCELADO}
    
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private Estado estado = Estado.CREADO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El pedido cambió a estado: " + nuevoEstado);
        }
    }

    public Estado getEstado() {
        return estado;
    }
    
}
