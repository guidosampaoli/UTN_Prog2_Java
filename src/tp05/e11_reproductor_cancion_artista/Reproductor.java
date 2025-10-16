package tp05.e11_reproductor_cancion_artista;

public class Reproductor {

    // Dependencia de uso: Reproductor utiliza Cancion solo dentro del método reproducir()
    public void reproducir(Cancion cancion) {
        System.out.println("🎵 Reproduciendo canción: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Género: " + cancion.getArtista().getGenero());
    }
}
