/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Cálculo de descuento especial usando variable global.</h2>
 * <p>
 * Declara una variable global <b>descuento: = 0.10</b>.
 * Luego, crea un método <b>calcularDescuentoEspecial(double precio)</b>
 * que use la variable global para calcular el descuento especial del 10%.<br>
 * Dentro del método, declara una variable local <b>descuentoAplicado</b>,
 * almacena el valor del descuento y muestra el precio final con descuento.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E11_CalculoDescuentoVariableGlobal {
    
    static double descuento = 0.10; //Variable Global
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto, precioFinal, descuentoEspecial;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = input.nextInt();
        
        System.out.println("\nCalculando descuento...\n");
        
        descuentoEspecial = calcularDescuentoEspecial(precioProducto);
        
        System.out.println("El descuento especial aplicado es: " + descuentoEspecial);
        
        precioFinal = precioProducto - descuentoEspecial;
        
        System.out.println("El precio final con descuento es: " + precioFinal);
        
    }
    
    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento;
        return descuentoAplicado;
    }

}
