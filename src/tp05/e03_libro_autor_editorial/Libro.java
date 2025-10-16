package tp05.e03_libro_autor_editorial;

public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor;         // Asociación unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    
    public void mostrarDatos() {
        System.out.println("---- Datos del libro ----");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor.getNombre()+
                " (" + autor.getNacionalidad() + ")");
        System.out.println("Editorial: " + editorial.getNombre() +
                " | Dirección: " + editorial.getDireccion());
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn +
                ", autor=" + autor + ", editorial=" + editorial + '}';
    }

}
