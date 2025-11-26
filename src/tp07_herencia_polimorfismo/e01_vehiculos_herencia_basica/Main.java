package tp07_herencia_polimorfismo.e01_vehiculos_herencia_basica;

/**
 * <h2> 1. Vehículos y herencia básica</h2>
 * <p>
 * ● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()<br>
 * ● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()<br>
 * ● Tarea: Instanciar un auto y mostrar su información completa.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main {
    
    public static void main(String[] args) {
        
        Auto auto = new Auto ("Renault", "Clio", 4);
        
        auto.mostrarInfo();

    }

}
