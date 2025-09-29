/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Actualización de stock a partir de venta y recepción de productos.</h2>
 * <p>
 * Crea un método <b>actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida)</b>,
 * que calcule el nuevo stock después de una venta y recepción de productos:<br>
 * <b>NuevoStock = StockActual − CantidadVendida + CantidadRecibida</b><br>
 * <b>NuevoStock = CantidadVendida + CantidadRecibida</b><br>
 * Desde main(), solicita al usuario el stock actual, la cantidad vendida y 
 * la cantidad recibida, y muestra el stock actualizado.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E10_ActualizacionStock {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        System.out.print("Ingrese el stock del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return (stockActual - cantidadVendida) + cantidadRecibida;
    }

}
