package tp05.e13_generadorqr_usuario_codigoqr;

/**
 * <h2>Ejercicios de Dependecia de Creación</h2>
 * <p>
 * 13. GeneradorQR - Usuario - CódigoQR<br>
 *      a. Asociación unidireccional: CódigoQR → Usuario<br>
 *      b. Dependencia de creación: GeneradorQR.generar(String, Usuario)<br>
 *  Clases y atributos:<br>
 *      i. CodigoQR: valor.<br>
 *      ii. Usuario: nombre, email.<br>
 *      iii. GeneradorQR->método: void generar(String valor, Usuario usuario)
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main13 {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("María López", "maria.lopez@example.com");

        GeneradorQR generador = new GeneradorQR();
                
        generador.generar("https://ejemplo.com/usuario/maria", usuario);

    }
}