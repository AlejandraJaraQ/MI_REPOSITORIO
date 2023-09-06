/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_alejq;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class persona {
 String nombre;
 int edad;
 
 public void orden(){
             System.out.println(nombre + "levanto la mano");
    }
    
       public void preguntar() {
     System.out.println(nombre + "tiene" + edad + "años");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre (Persona): ");
        nombre = scanner.next();
        System.out.print("Ingrese una edad (Edad): ");
        edad = scanner.nextInt();
        scanner.close();
    }
    
}
