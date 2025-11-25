package tp06_colecciones.e01_sistema_de_stock;

import java.util.List;

/**
 * <h2>Sistema de stock</h2>
 * <p>
 * Se debe desarrollar un sistema de stock que permita gestionar productos en una tienda,
 * controlando su disponibilidad, precios y categorías.<br>
 * La información se modelará utilizando clases, colecciones dinámicas y enumeraciones en Java.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Principal {
    
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        Producto camisa = new Producto("Camisa negra", 22696.0, 28, CategoriaProducto.ROPA);
        Producto auriculares = new Producto("Auriculares in-ear", 16290.0, 18, CategoriaProducto.ELECTRONICA);
        Producto harina = new Producto("Harina 0000", 1862.78, 78, CategoriaProducto.ALIMENTOS);
        Producto harina2 = new Producto("Harina 000", 1852.20, 70, CategoriaProducto.ALIMENTOS);
        Producto heladera = new Producto("Heladera 174L No Frost", 584999.99, 15, CategoriaProducto.HOGAR);
        Producto tv = new Producto("TV Smart LG 65\"", 1655999.99, 10, CategoriaProducto.HOGAR);
        Producto aceite = new Producto("Aceite de girasol 900cc", 2934.0, 20, CategoriaProducto.ALIMENTOS);
        
        
        inventario.agregarProducto(camisa);
        inventario.agregarProducto(auriculares);
        inventario.agregarProducto(harina);
        inventario.agregarProducto(harina2);
        inventario.agregarProducto(heladera);
        inventario.agregarProducto(tv);
        inventario.agregarProducto(aceite);
        
        System.out.println("Cantidad de productos en inventario: " + inventario.cantidadProductos());
        System.out.println("Listando productos en inventario:");
        inventario.listarProductos();
        
        //implementación del método buscarProductoPorId(id)
        System.out.println("\n**********************\n");
        String id = "ROP-1";
        System.out.println("Buscando producto con ID: " + id);
        if (inventario.buscarProductoPorId(id) != null) {
            System.out.println("Producto encontrado:");
            inventario.buscarProductoPorId(id).mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        System.out.println("\n**********************\n");
        id = "ALI-1";        
        System.out.println("Buscando producto con ID: " + id);
        if (inventario.eliminarProducto(id)) {
            System.out.println("El producto con ID " + id + " ha sido eliminado.");
        } else {
            System.out.println("No se pudo eliminar el producto.");
        }        
        System.out.println("Cantidad de productos en inventario: " + inventario.cantidadProductos());
        System.out.println("Listando productos en inventario:");
        inventario.listarProductos();
        
        //implementación del método actualizarStock(id, nuevaCantidad)
        System.out.println("\n**********************\n");
        id = "ALI-2";
        int nuevaCantidad = 16;
        System.out.println("Actualizando el stock del producto con ID: " + id);
        System.out.println("Agregando " + nuevaCantidad + " unidades...");
        if (inventario.actualizarStock(id, nuevaCantidad)) {
            System.out.println("Stock actualizado correctamente.");
            System.out.println("Nuevo stock: " + harina2.getCantidad());
        } else {
            System.out.println("No se pudo actualizar el stock");
        }
        
        //implementación del método filtrarPorCategoria(categoria)
        System.out.println("\n**********************\n");
        CategoriaProducto categoria = CategoriaProducto.HOGAR;
        System.out.println("Productos en la categoría " + categoria + ":");
        List<Producto> listaProductos = inventario.filtrarPorCategoria(categoria);
        for (Producto p : listaProductos) {
            p.mostrarInfo();
        }
        
        //implementación del método obtenerTotalStock()
        System.out.println("\n**********************\n");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Cantidad total de productos en el inventario: " + totalStock);
        
        
        //implementación del método obtenerProductoConMayorStock()
        System.out.println("\n**********************\n");
        System.out.println("Obteniendo producto con mayor stock...");
        System.out.println("Producto obtenido:");
        Producto pms = inventario.obtenerProductoConMayorStock();
        pms.mostrarInfo();
        
        //implementación del método filtrarProductosPorPrecio(min, max)
        System.out.println("\n**********************\n");
        System.out.println("Filtrando productos con precios entre $1000 y $3000...");
        System.out.println("Lista de productos:");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }
        
        System.out.println("\n**********************\n");
        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
        
    }

}
