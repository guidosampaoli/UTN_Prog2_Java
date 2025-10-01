package tp04;

/**
 * <h2>Sistema de Gestión de Empleados</h2>
 * <p>
 * Modelar una clase <b>Empleado</b> que represente a un trabajador en una empresa.<br>
 * Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y 
 * el uso de atributos aplicando encapsulamiento y métodos estáticos 
 * para llevar control de los objetos creados.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    
    // CONSTRUCTORES
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }    
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salarioSegunPuesto(puesto);
    }
    
    // MÉTODOS
    private static double salarioSegunPuesto(String puesto) {
        switch (puesto) {
            case "Developer": return 7450;
            case "QA Tester": return 5600;
            case "Data Analyst": return 6934;
            case "IT Support": return 4926.5;
            default: return 3000;
        }
    }
    private boolean validarString(String string) {
        if (string != null && !string.isBlank()) {
            return true;            
        } else {
            System.out.println("ERROR. Ingrese una cadena de texto válida.");
            return false;
        }
    }
    private boolean validarPositivo(double valor) {
        if (valor > 0) {
            return true;
        } else {
            System.out.println("ERROR: El valor debe ser mayor a 0.");
            return false;
        }
    }    
    public boolean actualizarSalario(int porcentajeAumento) {
        if (validarPositivo(porcentajeAumento)) {
            salario += salario * porcentajeAumento / 100;
            return true;        
        }
        return false;
    }    
    public boolean actualizarSalario(double cantidadAumento) {
        if (validarPositivo(cantidadAumento)) {
            salario += cantidadAumento;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Empleado {" + 
               "\n  ID: " + id +
               "\n  Nombre: " + nombre +
               "\n  Puesto: " + puesto +
               "\n  Salario: " + salario +
               "\n}";
    }    
    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados: " + totalEmpleados);
    }
    
    // GETTERS Y SETTERS
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (validarString(nombre)) {
            this.nombre = nombre;
        }
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        if (validarString(puesto)) {
            this.puesto = puesto;
        }
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (validarPositivo(salario)) {            
            this.salario = salario;
        }
    }    

}
