/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_alejandra;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class animal {
  
    String nombre;
    String color;
    
    public void caracteristica(){
   JOptionPane.showMessageDialog(null, "El perro se llama " + nombre, "Características del Animal", JOptionPane.INFORMATION_MESSAGE);
}
}