
package com.unal.poo.actividad4_epr_jgh.excepciones406;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        try{
            String nombre=JOptionPane.showInputDialog("Ingrese el nombre:");
            String apellidos=JOptionPane.showInputDialog("Ingrese los apellidos:");
            int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
            new Vendedor(nombre,apellidos,edad);
            JOptionPane.showMessageDialog(null,"Vendedor registrado correctamente");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"La edad debe ser un número entero.");
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
