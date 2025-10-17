package tp05.e12_impuesto_contribuyente_calculadora;

/**
 * <h2>Ejercicios de Dependencia de uso</h2>
 * <p>
 * 12. Impuesto - Contribuyente - Calculadora<br>
 *     a. Asociación unidireccional: Impuesto → Contribuyente<br>
 *     b. Dependencia de uso: Calculadora.calcular(Impuesto)<br>
 *  Clases y atributos:<br>
 *     i. Impuesto: monto<br>
 *     ii. Contribuyente: nombre, cuil<br>
 *     iii. Calculadora -> método: void calcular(Impuesto impuesto)
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main12 {

    public static void main(String[] args) {

        Contribuyente contribuyente = new Contribuyente("María Gómez", "27-35648965-2");
        Impuesto impuesto = new Impuesto(18500.75, contribuyente);

        impuesto.mostrarDatos();

        System.out.println("\n----- Usando la Calculadora -----");
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}
