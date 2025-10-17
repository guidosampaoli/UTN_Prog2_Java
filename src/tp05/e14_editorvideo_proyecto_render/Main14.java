package tp05.e14_editorvideo_proyecto_render;

/**
 * <h2>Título</h2>
 * <p>
 * 14. EditorVideo - Proyecto - Render<br>
 *      a. Asociación unidireccional: Render → Proyecto<br>
 *      b. Dependencia de creación: EditorVideo.exportar(String, Proyecto)<br>
 *  Clases y atributos:<br>
 *      i. Render: formato.<br>
 *      ii. Proyecto: nombre, duracionMin.<br>
 *      iii. EditorVideo -> método: void exportar(String formato, Proyecto proyecto)
 * </p>
 * @author Guido Sampaoli
 * @see
 * <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub
 * - guidosampaoli</a>
 */

public class Main14 {

    public static void main(String[] args) {

        Proyecto proyecto = new Proyecto("Cortometraje Documental", 25);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
        
    }
    
}