/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Validación de Nota entre 0 y 10 (do-while).</h2>
 * <p>
 * Escribe un programa que solicite al usuario una nota entre 0 y 10.
 * Si el usuario ingresa un número fuera de este rango,
 * debe seguir pidiéndole la nota hasta que ingrese un valor válido.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E07_ValidacionNota {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0 - 10): ");
            nota = input.nextInt();            
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota guardada correctamente.");
            } else {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }            
        } while (nota < 0 || nota > 10);
    }

}
