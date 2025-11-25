package tp06_colecciones.e01_sistema_de_stock;

public enum CategoriaProducto {
    
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    private final String descripcion;
    private int contador = 0;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public int incrementarContador() {
        contador++;
        return contador;
    }
    
}
