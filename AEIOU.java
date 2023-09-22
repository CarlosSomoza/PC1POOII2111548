/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aeiou;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class AEIOU {

    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(100) + 1; 
        int num2 = random.nextInt(100) + 1; 

        int sumaCorrecta = num1 + num2;

        System.out.println("¿Cuál es la respuesta al siguiente problema?");
        System.out.print(num1 + " + " + num2 + " = ");

        Scanner scanner = new Scanner(System.in);

        try {
            int respuestaUsuario = scanner.nextInt();

            if (respuestaUsuario == sumaCorrecta) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto, la respuesta correcta es " + sumaCorrecta);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
            System.exit(0);
        } finally {
            scanner.close();
        }
    }
}
