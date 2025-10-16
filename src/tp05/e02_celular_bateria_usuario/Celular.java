package tp05.e02_celular_bateria_usuario;

public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
        
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        
        usuario.comprarCelular(this);
    }
    
    public String getImei() {
        return imei;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public Bateria getBateria() {
        return bateria;
    }
    
    public Usuario usuarioDelCelular() {
        return usuario;
    }
    
    public void mostrarInfo() {
        System.out.println("----- Celular -----");
        System.out.println("Imei: " + imei);
        System.out.println("Marca: " + marca + " " + modelo);
        System.out.println("Batería: " + bateria.getModelo() + " | Capacidad: " + bateria.getCapacidad());
        System.out.println("Usuario: " + usuario.getNombre() + " | DNI: " + usuario.getDni());        
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
}
