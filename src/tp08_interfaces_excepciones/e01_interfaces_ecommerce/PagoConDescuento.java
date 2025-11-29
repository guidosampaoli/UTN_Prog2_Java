package tp08_interfaces_excepciones.e01_interfaces_ecommerce;

public interface PagoConDescuento extends Pago {    
    double aplicarDescuento(double monto);    
}
