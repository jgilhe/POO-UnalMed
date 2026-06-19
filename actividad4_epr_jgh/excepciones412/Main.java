
package com.unal.poo.actividad4_epr_jgh.excepciones412;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        try{
            double numero=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));
            JOptionPane.showMessageDialog(null,
                "Logaritmo: "+CalculosNumericos.calcularLogaritmo(numero)+
                "\nRaíz: "+CalculosNumericos.calcularRaiz(numero));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
