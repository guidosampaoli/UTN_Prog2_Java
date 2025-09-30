package tp03;

/**
 * <h2>Registro de Estudiantes</h2>
 * <p>
 * Crear una clase <b>Estudiante</b> con los atributos: 
 * nombre, apellido, curso, calificación.<br>
 * Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), 
 * bajarCalificacion(puntos).<br>
 * Tarea: Instanciar a un estudiante, mostrar su información, 
 * aumentar y disminuir calificaciones.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" 
 * target="_blank">GitHub - guidosampaoli</a>
 */

public class TP03_E01_RegistroEstudiantes {
    
    public static void main(String[] args) {
        Estudiante e =  new Estudiante();
        
        e.setNombre("Guido");
        e.setApellido("Sampaoli");
        e.setCurso("Programación II");
        e.setCalificacion(8.47);
        e.mostrarInfo();
        
        System.out.println("\nAumento la calificación:\n");
        double sc = e.subirCalificacion(0.53);
        
        if (sc == 0) {
            System.out.println("Error. No se puede superar la calificación máxima de 10.");
        }
        
        System.out.println("Calificación: " + e.getCalificacion());
                
        System.out.println("\nBajo la calificación:\n");
        double bc = e.bajarCalificacion(5);
        
        if (bc == -1) {
            System.out.println("Error. La calificación no puede ser menor a 0");            
        }

        System.out.println("Calificación: " + e.getCalificacion());
    }

}
