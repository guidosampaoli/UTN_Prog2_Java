package tp05.e12_impuesto_contribuyente_calculadora;

public class Calculadora {

    // Dependencia de uso: Calculadora utiliza Impuesto solo en este método
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        double recargo = monto * 0.21; // Aplicamos IVA del 21%
        double total = monto + recargo;

        System.out.println("💰 Calculando impuesto...");
        System.out.println("Monto base: $" + monto);
        System.out.println("Recargo (21%): $" + recargo);
        System.out.println("Total a pagar: $" + total);
    }
}
