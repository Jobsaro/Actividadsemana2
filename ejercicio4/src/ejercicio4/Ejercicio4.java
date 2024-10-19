/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el numero de partidos ganados: ");
        int ganados = input.nextInt();
       
        System.out.print("Ingrese el numero de partidos empatados: ");
        int empatados = input.nextInt();
        
        System.out.print("Ingrese el numero de partidos perdidos: ");
        int perdidos = input.nextInt();
        
        int puntajeTotal = (ganados * 3) + (empatados * 1) + (perdidos * 0);
        
        System.out.println("El puntaje total del equipo es: " + puntajeTotal);
    }
}