package tp05.e04_tarjeta_cliente_banco;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco;     // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;

        // Asociar también desde el lado del cliente
        cliente.asignarTarjeta(this);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void mostrarDatos() {
        System.out.println("----- Datos de la Tarjeta -----");
        System.out.println("Número: " + numero);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        System.out.println("Cliente: " + cliente.getNombre() +
                " | DNI: " + cliente.getDni());
        System.out.println("Banco: " + banco.getNombre() +
                " | CUIT: " + banco.getCuit());
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento +
               ", cliente=" + cliente.getNombre() + ", banco=" + banco.getNombre() + '}';
    }
}
