/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Verificación de Año Bisiesto.</h2>
 * <p>
 * Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto.<br>
 * Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E01_AnioBisiesto {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        anio = input.nextInt();
        
        if (anio % 4 != 0) {
            System.out.println(anio + " NO es bisiesto.");
        } else if (anio % 100 != 0) {
            System.out.println(anio + " es bisiesto.");
        } else if (anio % 400 == 0) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " NO es bisiesto.");
        }        
        
    }

}
