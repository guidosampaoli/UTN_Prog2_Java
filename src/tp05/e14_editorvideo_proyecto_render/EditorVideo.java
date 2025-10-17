package tp05.e14_editorvideo_proyecto_render;

public class EditorVideo {
    // Dependencia de creación: se crea el objeto en un método y se usa
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Se ha exportado el proyecto: " +
                proyecto.getNombre() + " en formato " + formato);
        System.out.println("Render generado: " + render);
    }

}
