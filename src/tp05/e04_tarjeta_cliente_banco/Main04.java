package tp05.e04_tarjeta_cliente_banco;

/**
 * <h2>Ejercicios de Relaciones 1 a 1</h2>
 * <p>
 * 4. TarjetaDeCrédito - Cliente - Banco<br>
 *      a. Asociación bidireccional: TarjetaDeCrédito ↔ Cliente<br>
 *      b. Agregación: TarjetaDeCrédito → Banco<br>
 *  Clases y atributos:<br>
 *      i. TarjetaDeCrédito: numero, fechaVencimiento<br>
 *      ii. Cliente: nombre, dni<br>
 *      iii. Banco: nombre, cuit
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main04 {

    public static void main(String[] args) {
        
        Banco banco = new Banco("Banco Central", "30-12345678-9");
        Cliente cliente = new Cliente("Ana Pérez", "30123456");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/29", cliente, banco);

        // Mostrar info desde la tarjeta
        tarjeta.mostrarDatos();

        System.out.println("\nVerificar tarjeta desde el Cliente:");
        System.out.println("cliente.getTarjeta().getNumero() = " +
                cliente.getTarjeta().getNumero());
    }
}
