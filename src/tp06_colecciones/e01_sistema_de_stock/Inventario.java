package tp06_colecciones.e01_sistema_de_stock;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    
    private ArrayList<Producto> productos;
    
    public Inventario () {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public int cantidadProductos() {
        return productos.size();
    }
    
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }
    
    public boolean actualizarStock (String id, int nuevaCantidad) {
        if (nuevaCantidad <= 0) {
            System.out.println("Ingrese un número mayor a cero.");
            return false;
        }
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                resultado.add(p);                
            }
        }
        return resultado;
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto p : productos) {
            totalStock += p.getCantidad();
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        int mayorStock = Integer.MIN_VALUE;
        Producto productoMayorStock = null;
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock) {
                mayorStock = p.getCantidad();
                productoMayorStock = p;                
            }
        }
        return productoMayorStock;
    }
    
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                productosFiltrados.add(p);
            }            
        }
        return productosFiltrados;
    }

}
