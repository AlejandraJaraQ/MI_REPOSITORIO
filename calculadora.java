/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_ale;

import java.util.Scanner;



/**
 *
 * @author aleja
 */
public class calculadora {
  int num1;
  int num2;
 int resultado;
 
public void sumar() {
        resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    public void restar() {
        resultado = num1 - num2;
        System.out.println("La resta es: " + resultado);
    }

    public void multiplicar() {
        resultado = num1 * num2;
        System.out.println("La multiplicación es: " + resultado);
    }
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        scanner.close();
    }
}

