/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

/**
 * <h2>Modificación de un array de precios y visualización de resultados.</h2>
 * <p>
 * Crea un programa que:<br>
 * a. Declare e inicialice un array con los precios de algunos productos.<br>
 * b. Muestre los valores originales de los precios.<br>
 * c. Modifique el precio de un producto específico.<br>
 * d. Muestre los valores modificados.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E12_ModificacionArrayPrecios {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        
        System.out.println("Precios originales:\n");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
        
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:\n");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
        
        
    }

}
