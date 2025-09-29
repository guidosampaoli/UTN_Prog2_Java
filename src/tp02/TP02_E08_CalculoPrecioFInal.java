/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Cálculo del Precio Final con impuesto y descuento.</h2>
 * <p>
 * Crea un método <b>calcularPrecioFinal(double impuesto, double descuento)</b> 
 * que calcule el precio final de un producto en un e-commerce. La fórmula es:<br>
 * PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)<br>
 * Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento,
 * llama al método y muestra el precio final.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E08_CalculoPrecioFInal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double impuesto, descuento, precioBase, precioFinal;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el porcentaje de impuesto como número entero: ");
        impuesto = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el porcentaje de descuento como número entero: ");
        descuento = Integer.parseInt(input.nextLine());
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final de producto es: " + precioFinal);
        
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
}
