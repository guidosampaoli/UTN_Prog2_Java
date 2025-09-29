/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Calculadora de Descuento según categoría.</h2>
 * <p>
 * Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).<br>
 * Luego, aplique los siguientes descuentos:<br>
 * Categoría A: 10% de descuento<br>
 * Categoría B: 15% de descuento<br>
 * Categoría C: 20% de descuento<br>
 * El programa debe mostrar el precio original, el descuento aplicado y el precio final.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E04_CalculadoraDescuento {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto, precioFinal;
        char categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        if (categoria == 'A') {            
            System.out.println("Descuento aplicado: 10%");
            precioFinal = precioProducto * 0.90;
            System.out.println("Precio final: " + precioFinal);
        } else if (categoria == 'B') {
            System.out.println("Descuento aplicado: 15%");
            precioFinal = precioProducto * 0.85;
            System.out.println("Precio final: " + precioFinal);
        }else if (categoria == 'C') {
            System.out.println("Descuento aplicado: 20%");
            precioFinal = precioProducto * 0.80;
            System.out.println("Precio final: " + precioFinal);
        } else {
            System.out.println("Ingrese una categoría válida.");
        }
        
    }

}
