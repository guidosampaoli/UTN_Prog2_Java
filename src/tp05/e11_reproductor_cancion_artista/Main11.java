package tp05.e11_reproductor_cancion_artista;

/**
 * <h2>Ejercicios de Dependencia de Uso</h2>
 * <p>
 * 11. Reproductor - Canción - Artista<br>
 *      a. Asociación unidireccional: Canción → Artista<br>
 *      b. Dependencia de uso: Reproductor.reproducir(Cancion)<br>
 *  Clases y atributos:<br>
 *      i. Canción: titulo.<br>
 *      ii. Artista: nombre, genero.<br>
 *      iii. Reproductor->método: void reproducir(Cancion cancion)
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Main11 {

    public static void main(String[] args) {

        Artista artista = new Artista("Daft Punk", "Electrónica");
        Cancion cancion = new Cancion("Around The World", artista);

        System.out.println(cancion.toString());

        System.out.println("\nEncendiendo el Reproductor...\n");
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
        
    }
}