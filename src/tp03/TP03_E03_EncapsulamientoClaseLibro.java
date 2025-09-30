package tp03;

/**
 * <h2>Encapsulamiento con la Clase Libro</h2>
 * <p>
 * Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.<br>
 * Métodos requeridos: Getters para todos los atributos. Setter con 
 * validación para añoPublicacion.<br>
 * Tarea: Crear un libro, intentar modificar el año con un valor inválido y 
 * luego con uno válido, mostrar la información final.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP03_E03_EncapsulamientoClaseLibro {
    
    public static void main(String[] args) {
        Libro l = new Libro();
        
        l.setTitulo("El príncipe");
        l.setAutor("Nicolás Maquiavelo");
        
        l.mostrarInfo();
        
        System.out.println("\nPor favor ingresar el año de publicación del libro.");
        System.out.println("Actualizando dato...\n");
        
        int a = 532;
        l.setAnioPublicacion(a);
        
        System.out.println("Actualizando dato (nuevamente)...\n");
        
        a = 1532;
        l.setAnioPublicacion(a);
        
        l.mostrarInfo();
               
    }
}
