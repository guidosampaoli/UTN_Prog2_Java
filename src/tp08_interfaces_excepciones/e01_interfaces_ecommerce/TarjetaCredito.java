package tp08_interfaces_excepciones.e01_interfaces_ecommerce;

public class TarjetaCredito implements Pago {
    
    private Cliente titular;
    private String numero;

    public TarjetaCredito(Cliente titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito...");
        System.out.println("Titular: " + titular.getNombre() + "(" + titular.getEmail() + ")");
        System.out.println("Número de tarjeta: " + numero);
        System.out.println("Monto final: $" + monto);
        return true;
    }
}
