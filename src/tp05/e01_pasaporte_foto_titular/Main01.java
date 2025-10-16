package tp05.e01_pasaporte_foto_titular;

/**
 * <h2>Ejercicios de Relaciones 1 a 1</h2>
 * <p>
 * 1. Pasaporte - Foto - Titular<br>
 *      a. Composición: Pasaporte → Foto<br>
 *      b. Asociación bidireccional: Pasaporte ↔ Titular<br>
 * Clases y atributos:<br>
 *      i. Pasaporte: numero, fechaEmision<br>
 *      ii. Foto: imagen, formato<br>
 *      iii. Titular: nombre, dni
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

import java.time.LocalDate;

public class Main01 {
    public static void main(String[] args) {
        Titular titular = new Titular("David Gómez", 48355625);
        Foto foto = new Foto("foto.jpg", "JPG");
        Pasaporte pasaporte = new Pasaporte(123456, LocalDate.of(2025, 10, 10), titular, foto);

        pasaporte.mostrarDatos();

        System.out.println("\nVerificación desde el titular:");
        System.out.println(titular.getPasaporte().getNumero());
    }
}
