package tp03;

public class Gallina {
    
    private static int idContador = 1;
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }
    public void setIdGallina() {
        this.idGallina = idContador;
        idContador++;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    public void ponerHuevo() {
        huevosPuestos += 1;
        System.out.println("Gallina #" + idGallina + " puso un huevo."
                + " Total: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad +=1;
        System.out.println("Gallina #" + idGallina + " cumplió un año más."
                + " Edad actual: " + edad);
    }
    
    public void mostrarEstado() {
        System.out.println("\n---- Estado de la gallina ----");
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-----------------------------");
    }
    

}
