package tp07_herencia_polimorfismo.e02_figuras_geometricas_metodos_abstractos;

import java.util.ArrayList;

/**
 * <h2>2. Figuras geométricas y métodos abstractos</h2>
 * <p>
 * ● Clase abstracta: Figura con método calcularArea() y atributo nombre<br>
 * ● Subclases: Círculo y Rectángulo implementan el cálculo del área<br>
 * ● Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Figura> figurasGeometricas = new ArrayList<>();
        
        Circulo circulo = new Circulo("Circulo", 5.8);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 3.25, 4.08);
        
        figurasGeometricas.add(circulo);
        figurasGeometricas.add(rectangulo);
        
        for (Figura figura : figurasGeometricas) {
            System.out.print("Área del " + figura.getNombre() + ": ");
            System.out.println(figura.calcularArea());            
        }
        
        
    }

}
