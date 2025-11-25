package tp06_colecciones.e01_sistema_de_stock;

public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String nombre, Double precio, int cantidad, CategoriaProducto categoria) {
        this.id = getShortName(categoria) + categoria.incrementarContador();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    private String getShortName(CategoriaProducto categoria) {
        switch (categoria) {
            case ALIMENTOS: return "ALI-";
            case ELECTRONICA: return "ELE-";
            case ROPA: return "ROP-";
            case HOGAR: return "HOG-";
            default: return "XXX-";
        }
    }

    public String getId() {
        return id;
    }
    
    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    } 
    
    public void mostrarInfo() {
        System.out.println("Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}');
    }
    
    
    
    
    
}
