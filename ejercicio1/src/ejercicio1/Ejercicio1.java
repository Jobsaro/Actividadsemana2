/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingresar la Temperatura en Fahrenheit: " );
        double fah = scanner.nextDouble();
        
        double cel = (fah-32)*5/9;
        
        System.out.printf("%.2f grandos fahrenheit son %.2f grados celcius. \n ",fah ,cel);
             
    }
    
}
