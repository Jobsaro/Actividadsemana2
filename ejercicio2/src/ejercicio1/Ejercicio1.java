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
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera calificacion parcial: ");
        double parcial1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificacion parcial: ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificacion parcial: ");
        double parcial3 = scanner.nextDouble();

        System.out.print("Ingrese la calificacion del examen final: ");
        double examenFinal = scanner.nextDouble();

        System.out.print("Ingrese la calificacion del trabajo final: ");
        double trabajoFinal = scanner.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.printf("La calificacion final es: %.2f\n", calificacionFinal);
    }
}

   
