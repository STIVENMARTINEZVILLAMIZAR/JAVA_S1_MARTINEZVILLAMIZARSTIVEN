/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarritoOnline;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

public class CarritoOnline {
    
    static double suma(double n1, double n2) {
        double resultado = n1 + n2;
        return resultado;
    }

    static double resta(double n1, double n2) {
        double resultado = n1 - n2;
        return resultado;
    }

    static double multiplicacion(double n1, double n2) {
        double resultado = n1 * n2;
        return resultado;
    }

    static double division(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("No se puede dividir por 0");
        } 
        return n2 == 0 ? -1 : n1 / n2; 
    }

    static void menu(int n1, int n2) {
        System.out.println("""
                **********************************
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                """);
        int op = new Scanner(System.in).nextInt();
        switch (op) {
            case 1:
                System.out.println("Suma: "+ suma(n1, n2));
                break;
            case 2:
                System.out.println("Resta: "+ resta(n1, n2));
                break;
            case 3:
                System.out.println("Multiplicación: "+ multiplicacion(n1, n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Error, no se puede dividir por cero.");
                } else {
                    System.out.println("Division: "+ division(n1, n2));
                }
                break;
            default:
                System.out.println("Error, opcion no valida.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Ingrese numero 1: ");
        double n1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese numero 2: ");
        double n2 = new Scanner(System.in).nextDouble();
        menu();
    }
}