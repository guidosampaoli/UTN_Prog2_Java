package tp03;

public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    private boolean validarString(String string) {
        return string != null && !string.equals("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (validarString(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (validarString(especie)) {
            this.especie = especie;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("---- Datos de la mascota ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios() {
        edad += 1;
    }

}