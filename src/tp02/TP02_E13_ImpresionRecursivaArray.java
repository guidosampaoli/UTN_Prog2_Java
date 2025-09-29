/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

/**
 * <h2>Impresión recursiva de arrays antes y después de modificar un elemento.</h2>
 * <p>
 * Crea un programa que:<br>
 * a. Declare e inicialice un array con los precios de algunos productos.<br>
 * b. Use una función recursiva para mostrar los precios originales.<br>
 * c. Modifique el precio de un producto específico.<br>
 * d. Use otra función recursiva para mostrar los valores modificados.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E13_ImpresionRecursivaArray {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        
        System.out.println("Precios originales:\n");
        recorrerArray(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:\n");
        recorrerArray(precios, 0);
    }
    
    static void recorrerArray(double[] array, int i) {
        if (i >= array.length) {
            return;
        }
        System.out.println("Precio: $" + array[i]);
        recorrerArray(array, i + 1);
    }

}
