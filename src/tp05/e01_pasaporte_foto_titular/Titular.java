package tp05.e01_pasaporte_foto_titular;

public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte; // Asociación bidireccional

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asignarPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Titular{\n"
             + "nombre='" + nombre + '\'' + ", dni=" + dni + '}';
    }
}
