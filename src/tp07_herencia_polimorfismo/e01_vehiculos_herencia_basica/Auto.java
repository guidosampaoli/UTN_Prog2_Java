package tp07_herencia_polimorfismo.e01_vehiculos_herencia_basica;

public class Auto extends Vehiculo {
    
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehiculo{" + "marca=" + marca
                + ", modelo=" + modelo
                + ", CantidadPuertas=" + cantidadPuertas + '}');
    }
    
    

}
