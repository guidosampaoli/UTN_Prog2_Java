package tp05.e01_pasaporte_foto_titular;

import java.time.LocalDate;

public class Pasaporte {
    private int numero;
    private LocalDate fechaEmision;
    private Foto foto;           // Composición
    private Titular titular;     // Asociación bidireccional

    public Pasaporte(int numero, LocalDate fechaEmision, Titular titular, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = foto;

        // Asociar también desde el lado del titular
        titular.asignarPasaporte(this);
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrarDatos() {
        System.out.println("Pasaporte Nº " + numero);
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Titular: " + titular.getNombre() + " (DNI " + titular.getDni() + ")");
        System.out.println("Foto: " + foto.getImagen() + " - Formato: " + foto.getFormato());
    }
}
