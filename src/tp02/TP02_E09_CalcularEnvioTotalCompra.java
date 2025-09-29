/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Composición de funciones para calcular costo de envío y total de compra.</h2>
 * <p>
 * a. <b>calcularCostoEnvio(double peso, String zona)</b>:
 * Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.<br>
 *  - Nacional: $5 por kg<br>
 *  - Internacional: $10 por kg<br>
 * b. <b>calcularTotalCompra(double precioProducto, double costoEnvio)</b>:
 * Usa <i>calcularCostoEnvio</i> para sumar el costo del producto con el costo de envío.<br>
 * Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto.
 * Luego, muestra el total a pagar.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E09_CalcularEnvioTotalCompra {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, precioProducto, costoEnvio, totalCompra;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional / Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("\nCalculando...\n");
        System.out.println("El costo del envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);

    }
    
    static double calcularCostoEnvio( double peso, String zona) {
        switch (zona) {
            case "Nacional": case "nacional":
                return peso * 5;
            case "Internacional": case "internacional":
                return peso * 10;                
            }
        return 0;
        }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

}