package tp03;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    private boolean validarString(String string) {
        return string != null && string != "";
    }
    
    private boolean validarCalificacion(double puntos) {
        return calificacion + puntos <= 10 || calificacion - puntos >= 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (validarString(nombre)) {
            this.nombre = nombre;            
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (validarString(apellido)) {
            this.apellido = apellido;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (validarString(curso)) {
            this.curso = curso;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0) {
            this.calificacion = calificacion;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + apellido + ", " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public double subirCalificacion(double puntos) {
        return validarCalificacion(puntos) ? calificacion += puntos : 0;
    }
    
    public double bajarCalificacion(double puntos) {
        return validarCalificacion(puntos) ? calificacion -= puntos : -1;
    }
    
}
