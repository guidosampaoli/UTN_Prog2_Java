package tp05.e03_libro_autor_editorial;

/**
 * <h2>Ejercicios de Relaciones 1 a 1</h2>
 * <p>
 * 3. Libro - Autor - Editorial<br>
 *      a. Asociación unidireccional: Libro → Autor<br>
 *      b. Agregación: Libro → Editorial<br>
 * Clases y atributos:<br>
 *      i. Libro: titulo, isbn<br>
 *      ii. Autor: nombre, nacionalidad<br>
 *      iii. Editorial: nombre, direccion
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main03 {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor("Gabriel García Márquez", "Colombia");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");

        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", autor, editorial);

        libro.mostrarDatos();

    }

}