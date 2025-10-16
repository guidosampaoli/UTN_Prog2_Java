package tp05.e02_celular_bateria_usuario;

/**
 * <h2>Ejercicios de Relaciones 1 a 1</h2>
 * <p>
 * 1. Celular - Batería - Usuario<br>
 *      a. Agregación: Celular → Batería<br>
 *      b. Asociación bidireccional: Celular ↔ Usuario<br>
 * Clases y atributos:<br>
 *      i. Celular: imei, marca, modelo<br>
 *      ii. Batería: modelo, capacidad<br>
 *      iii. Usuario: nombre, dni
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main {
    
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Juan Carlos Álvarez", "26233403");
        Bateria bateria = new Bateria("Li-ion", "5000 mAh");
        Celular celular = new Celular("110022554612235548", "Xiaomi", bateria, usuario);
        
        
        celular.mostrarInfo();
        
        System.out.println("\nVerificar imei del celular desde el Usuario:");
        System.out.println(usuario.getCelular().getImei());
        
    }

}
