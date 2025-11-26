package tp07_herencia_polimorfismo.e01_vehiculos_herencia_basica;

public class Vehiculo {   
    
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo() {
        System.out.println("Vehiculo{" + "marca=" + marca
                + ", modelo=" + modelo + '}');
    }
    
}
