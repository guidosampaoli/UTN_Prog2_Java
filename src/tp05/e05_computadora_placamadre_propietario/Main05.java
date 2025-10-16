package tp05.e05_computadora_placamadre_propietario;

/**
 * <h2>Ejercicios de Relaciones 1 a 1</h2>
 * <p>
 * 5. Computadora - PlacaMadre - Propietario<br>
 *      a. Composición: Computadora → PlacaMadre<br>
 *      b. Asociación bidireccional: Computadora ↔ Propietario<br>
 *  Clases y atributos:<br>
 *      i. Computadora: marca, numeroSerie<br>
 *      ii. PlacaMadre: modelo, chipset<br>
 *      iii. Propietario: nombre, dni
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main05 {

    public static void main(String[] args) {

        Propietario propietario = new Propietario("Carolina López", "29800444");
        Computadora computadora = new Computadora("Lenovo", "SN5568A77", "ASUS Prime B550M", "AMD B550", propietario);

        computadora.mostrarDatos();

        System.out.println("\nVerificar número de serie desde el Propietario:");
        System.out.println("propietario.getComputadora().getNumeroSerie() = " +
                propietario.getComputadora().getNumeroSerie());
    }
}