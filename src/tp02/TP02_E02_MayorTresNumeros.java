/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Determinar el Mayor de Tres Números.</h2>
 * <p>
 * Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E02_MayorTresNumeros {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, mayor = Integer.MIN_VALUE;
        
        System.out.print("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer número entero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        if (num1 > mayor) {
            mayor = num1;
        }
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
        
    }

}
