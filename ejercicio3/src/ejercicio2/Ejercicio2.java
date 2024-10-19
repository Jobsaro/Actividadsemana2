/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = input.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = input.nextDouble();
        
        double perimetro = 2 * (base + altura);
  
        double area = base * altura;

        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);
    }
}