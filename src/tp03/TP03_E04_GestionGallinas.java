package tp03;

/**
 * <h2>Gestión de Gallinas en Granja Digital</h2>
 * <p>
 * Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.<br>
 * Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().<br>
 * Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), 
 * y mostrar su estado.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP03_E04_GestionGallinas {
    
    public static void main(String[] args) {
        
        Gallina g1 = new Gallina();
        g1.setIdGallina();
        
        Gallina g2 = new Gallina();
        g2.setIdGallina();
        
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.envejecer();
        g2.ponerHuevo();
        g1.envejecer();
        g2.envejecer();
        g1.ponerHuevo();        
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        
        g1.mostrarEstado();
        g2.mostrarEstado();                
        
    }

}
