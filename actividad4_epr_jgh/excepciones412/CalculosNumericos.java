
package com.unal.poo.actividad4_epr_jgh.excepciones412;
public class CalculosNumericos {
    public static double calcularLogaritmo(double n){
        if(n<=0) throw new ArithmeticException("El número debe ser positivo.");
        return Math.log(n);
    }
    public static double calcularRaiz(double n){
        if(n<=0) throw new ArithmeticException("El número debe ser positivo.");
        return Math.sqrt(n);
    }
}
