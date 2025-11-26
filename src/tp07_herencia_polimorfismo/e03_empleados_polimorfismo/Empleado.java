package tp07_herencia_polimorfismo.e03_empleados_polimorfismo;

public abstract class Empleado {
    
    protected String nombreCompleto;
    protected String dni;
    protected double sueldoBase;

    public Empleado(String nombreCompleto, String dni, double sueldoBase) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return sueldoBase + 200000.00;            
        } else if (e instanceof EmpleadoTemporal) {
            return sueldoBase + 175000.00;
        }else {
            return 0;
        }
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", sueldoBase=" + sueldoBase + '}';
    }
    
    
    
}
