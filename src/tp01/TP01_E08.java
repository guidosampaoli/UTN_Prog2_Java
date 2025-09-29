/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp01;

import java.util.Scanner;

/**
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */
public class TP01_E08 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, division;        
        System.out.print("Ingrese el primer número entero: ");
        num1 = Integer.parseInt(input.nextLine());        
        System.out.print("Ingrese el segundo número entero: ");
        num2 = Integer.parseInt(input.nextLine());        
        division = num1 / num2;        
        System.out.println("División (double): " + num1 + " / " + num2 + " = " + division);
        
    }

}
