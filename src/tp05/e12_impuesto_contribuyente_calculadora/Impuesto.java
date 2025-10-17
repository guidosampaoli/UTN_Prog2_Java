package tp05.e12_impuesto_contribuyente_calculadora;

public class Impuesto {

    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void mostrarDatos() {
        System.out.println("----- Datos del Impuesto -----");
        System.out.println("Monto: $" + monto);
        System.out.println("Contribuyente: " + contribuyente.getNombre() +
                " | CUIL: " + contribuyente.getCuil());
        System.out.println("------------------------------");
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
}
