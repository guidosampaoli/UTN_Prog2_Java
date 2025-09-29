/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Suma de Números Pares (while).</h2>
 * <p>
 * Escribe un programa que solicite números al usuario y sume solo los números pares.<br>
 * El ciclo debe continuar hasta que el usuario ingrese el número 0,
 * momento en el que se debe mostrar la suma total de los pares ingresados.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E05_SumaNumerosPares {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, suma = 0;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        num = input.nextInt();
        
        
        while (num != 0) {
            if (num % 2 == 0) {
                suma += num;          
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = input.nextInt();
        }
        
        System.out.println("La suma de los números pares es: " + suma);
            
        }        
        
    }
