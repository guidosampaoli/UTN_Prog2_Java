package tp07_herencia_polimorfismo.e02_figuras_geometricas_metodos_abstractos;

public class Circulo extends Figura {
    
    private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }
    
}
