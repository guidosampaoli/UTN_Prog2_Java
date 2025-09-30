package tp03;

/**
 * <h2>Simulación de Nave Espacial</h2>
 * <p>
 * Crear una clase NaveEspacial con los atributos: nombre, combustible.<br>
 * Métodos requeridos: despegar(), avanzar(distancia), 
 * recargarCombustible(cantidad), mostrarEstado().<br>
 * Reglas: Validar que haya suficiente combustible antes de avanzar y 
 * evitar que se supere el límite al recargar.<br>
 * Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
 * recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/UTN_Prog2_Java/tree/main/src" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP03_E05_NaveEspacial {
    
    public static void main(String[] args) {
        
        NaveEspacial nave =  new NaveEspacial();
        
        nave.setNombre("Blackbird SR-71");
        nave.setCombustible(50);
        
        System.out.println("Encendiendo la nave y preparando el despegue...\n");
        nave.despegar();
        System.out.println("Ingresando la distancia para avanzar...");
        int distanciaEnMetros = 6400;
        System.out.println("Distancia ingresada: " + distanciaEnMetros + " metros.\n");
        
        nave.avanzar(distanciaEnMetros);
        
        
        System.out.println("Recargando combustible...");
        int unidadesCombustible = 30;
        System.out.println("Unidades a recargar: " + unidadesCombustible);
        nave.recargarCombustible(unidadesCombustible);
        System.out.println("Combustible actual: " + nave.getCombustible());
        
        System.out.println("\nIntentando avanzar nuevamente...");
                
        nave.avanzar(distanciaEnMetros);
        
        nave.mostrarEstado();
    }

}
