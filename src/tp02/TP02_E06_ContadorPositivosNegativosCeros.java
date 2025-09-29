/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Contador de Positivos, Negativos y Ceros (for).</h2>
 * <p>
 * Escribe un programa que pida al usuario ingresar 10 números enteros y 
 * cuente cuántos son positivos, negativos y cuántos son ceros.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E06_ContadorPositivosNegativosCeros {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, positivos = 0, negativos = 0, ceros = 0;
        
        System.out.println("Contador de Positivos, Negativos y Ceros");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el " + i + "º número: ");
            num = input.nextInt();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }                   
        }
        
        System.out.println("Resultados:"
                + "\nPositivos: " + positivos
                + "\nNegativos: " + negativos
                + "\nCeros: " + ceros);
    }

}
