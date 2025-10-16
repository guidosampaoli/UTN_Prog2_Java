package tp05.e05_computadora_placamadre_propietario;

public class Computadora {

    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;   // Composición
    private Propietario propietario; // Asociación bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPlaca, 
            String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // Composición: la placa madre solo existe dentro de la computadora
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
        this.propietario = propietario;
        // Asociación bidireccional: se asigna un propietario para esa computadora
        propietario.asignarComputadora(this);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void mostrarDatos() {
        System.out.println("----- Datos de la Computadora -----");
        System.out.println("Marca: " + marca);
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println("Placa madre: " + placaMadre.getModelo() +
                " | Chipset: " + placaMadre.getChipset());
        System.out.println("Propietario: " + propietario.getNombre() +
                " | DNI: " + propietario.getDni());
        System.out.println("-----------------------------------");
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario + '}';
    }
}