package tp08_interfaces_excepciones.e01_interfaces_ecommerce;

public class PayPal implements PagoConDescuento {
    
    private String cuenta;
    private Cliente cliente;

    public PayPal(String cuenta, Cliente cliente) {
        this.cuenta = cuenta;
        this.cliente = cliente;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; //5% de descuento al pagar con PayPal
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Procesando pago vía PayPal...");
        System.out.println("Cliente: " + cliente.getNombre() + "(" + cliente.getEmail() + ")");
        System.out.println("Cuenta: " + cuenta);
        System.out.println("Monto: " + montoFinal + "(5% de descuento por método de pago)");
        return true;
    }
}
