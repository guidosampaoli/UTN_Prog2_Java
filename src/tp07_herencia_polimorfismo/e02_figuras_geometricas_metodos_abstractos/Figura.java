package tp07_herencia_polimorfismo.e02_figuras_geometricas_metodos_abstractos;

public abstract class Figura {
    
    protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularArea();
    
}
