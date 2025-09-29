/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp02;

import java.util.Scanner;

/**
 * <h2>Clasificación de Edad.</h2>
 * <p>
 * Escribe un programa en Java que solicite al usuario su edad y clasifique
 * su etapa de vida según la siguiente tabla:<br>
 * Menor de 12 años: "Niño"<br>
 * Entre 12 y 17 años: "Adolescente"<br>
 * Entre 18 y 59 años: "Adulto"<br>
 * 60 años o más: "Adulto mayor"
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class TP02_E03_ClasificacionEdad {
    final static int NINIO = 12;
    final static int ADOLESCENTE = 17;
    final static int ADULTO = 59;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        if (edad < NINIO) {
            System.out.println("Usted es un niño.");
        } else if (edad >= NINIO && edad <= ADOLESCENTE ) {
            System.out.println("Usted es un adolescente.");
        } else if (edad > ADOLESCENTE && edad <= ADULTO) {
            System.out.println("Usted es un adulto.");
        } else {
            System.out.println("Usted es un adulto mayor.");
        }
        
    }

}
