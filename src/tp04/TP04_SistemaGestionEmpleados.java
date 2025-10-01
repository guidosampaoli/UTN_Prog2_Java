package tp04;

/**
 * <h2>Sistema de Gestión de Empleados</h2>
 * <p>
 * Modelar una clase <b>Empleado</b> que represente a un trabajador en una
 * empresa.<br>
 * Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y
 * el uso de atributos aplicando encapsulamiento y métodos estáticos para llevar
 * control de los objetos creados.
 * </p>
 * @author Guido Sampaoli
 * @see
 * <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP04_SistemaGestionEmpleados {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("José", "Developer");
        Empleado e2 = new Empleado(8, "Ana", "Data Analyst", 6934);
        Empleado e3 = new Empleado(2, "Esteban", "IT Support", 4926.5);
        Empleado e4 = new Empleado("Carla", "QA Tester");
        Empleado e5 = new Empleado("Iara", "Product Owner");
        
        // Aplico aumento de salario del 11% con valor int
        boolean nuevoSalario = e2.actualizarSalario(11);
        if (nuevoSalario) {
            System.out.println("Salario de " + e2.getNombre()
                    + " actualizado a: " + e2.getSalario());
        }
        
        // Se aplica aumento de valor fijo con double
        if (e5.actualizarSalario(5132.6)) {
            System.out.println("Se ha actualizado en la base de datos\n"
                    + "el salario de " + e5.getNombre() + ", quien ocupará\n"
                    + "el cargo de " + e5.getPuesto() + ".");
        }

        // Creo un array con las instancias para imprimir la información
        // con toString() usando un for y así evitar repetir código.
        Empleado[] empleados = {e1, e2, e3, e4, e5};

        for (Empleado e : empleados) {
            System.out.println(e);
        }

        // Se llama al método estático de la clase Empleado
        // sin instanciar ningún objeto
        Empleado.mostrarTotalEmpleados();

    }

}
