package tp07_herencia_polimorfismo.e03_empleados_polimorfismo;

import java.util.ArrayList;

/**
 * <h2>Título</h2>
 * <p>
 * Escribe un programa en Java que...<br>
 *
 * </p>
 *
 * @author Guido Sampaoli
 * @see
 * <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub
 * - guidosampaoli</a>
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        EmpleadoPlanta emp01 = new EmpleadoPlanta("José López", "31425887", 325000);
        EmpleadoPlanta emp02 = new EmpleadoPlanta("Carmen Gomez", "30314776", 325000);
        EmpleadoTemporal emp03 = new EmpleadoTemporal("Gustavo Arias", "34621439", 295000);
        EmpleadoTemporal emp04 = new EmpleadoTemporal("Lidia Navarro", "31425887", 295000);

        empleados.add(emp01);
        empleados.add(emp02);
        empleados.add(emp03);
        empleados.add(emp04);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombreCompleto()
                    + " | Sueldo base: " + empleado.getSueldoBase()
                    + " | Calcular sueldo: " + empleado.calcularSueldo(empleado));

        }

    }

}
