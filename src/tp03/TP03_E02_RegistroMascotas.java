package tp03;

/**
 * <h2>Registro de Mascotas</h2>
 * <p>
 * Crear una clase Mascota con los atributos: nombre, especie, edad.<br>
 * Métodos requeridos: mostrarInfo(), cumplirAnios().<br>
 * Tarea: Crear una mascota, mostrar su información, 
 * simular el paso del tiempo y verificar los cambios.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" 
 * target="_blank">GitHub - guidosampaoli</a>
 */

public class TP03_E02_RegistroMascotas {
    
    public static void main(String[] args) {
        Mascota m = new Mascota();
        
        m.setNombre("Ramón");
        m.setEspecie("Perro");
        m.setEdad(8);
        
        m.mostrarInfo();
        
        System.out.println("\nAl cabo de algunos años...\n");
        
        int anios = 5;//Establecer cuantos años pasaron.
        
        for (int i = 1; i <= anios; i++) {
            m.cumplirAnios();
        }
        
        m.mostrarInfo();
    }

}
