package tp03;

public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    
    private boolean validarString(String string) {
        return string != null && !string.equals("");
    }
    
    private boolean validarInt(int Int) {
        return Int > 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (validarString(nombre)) {            
            this.nombre = nombre;
        }
    }

    public int getCombustible() {
        return combustible;
    }
    public void setCombustible(int combustible) {
        if (validarInt(combustible)) {            
            this.combustible = combustible;
        }
    }    
    
    public void despegar() {
        System.out.println("La nave espacial \"" + nombre + "\" ha despegado.\n");
    }
    
    public void avanzar(int distancia) {
        if (!validarInt(distancia)) {
            System.out.println("ERROR. Ingrese una distancia válida.");            
        } else if (distancia < (combustible * 100)) {
            System.out.println("La nave avanza " + distancia + " metros.\n");
            combustible -= distancia / 100;
        } else {
            System.out.println("No hay suficiente combustible para avanzar.\n"
            + "Combustible actual: " + combustible + " unidades.\n"
            + "Distancia posible de avance: " + combustible * 100 + " metros.\n"
            + "Necesario recargar combustible.\n");
        } 
    }
    
    public void recargarCombustible(int cantidad) {
        if (!validarInt(cantidad)) {
            System.out.println("ERROR. Ingrese una cantidad válida.");
        } else if (combustible + cantidad > 100) {
            System.out.println("ADVERTENCIA. No se puede superar el límite de"
                    + " 100 unidades de combustible.");
        } else {
            combustible += cantidad;
            System.out.println("¡Recarga de combustible realizada con éxito!");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("---- Estado de la Nave ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible restante: " + combustible + " u.");
        System.out.println("---------------------------");
    }

}
