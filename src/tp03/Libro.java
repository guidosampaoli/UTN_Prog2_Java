package tp03;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    private boolean validarString(String string) {
        return string != null && !string.equals("");
    }
    
    private boolean validarAnio(int anio) {        
        return anio >= 1000 && anio <= 3000;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (validarString(titulo)) {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (validarString(autor)) {
            this.autor = autor;
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void mostrarInfo() {
        System.out.println("---- Información del Libro ----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("-------------------------------");
    }

    public void setAnioPublicacion(int anioPublicacion) {
        System.out.println("Año de publicación ingresado: " + anioPublicacion);
        if (validarAnio(anioPublicacion)) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("¡Dato del año de publicación del libro actualizado con éxito!\n");
        } else {
            System.out.println("ERROR. Ingrese un año de publicación válido.\n");
        } 
    }
    
}
