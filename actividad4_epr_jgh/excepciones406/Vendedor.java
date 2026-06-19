
package com.unal.poo.actividad4_epr_jgh.excepciones406;
public class Vendedor {
    private String nombre, apellidos;
    private int edad;

    public Vendedor(String nombre, String apellidos, int edad){
        verificarEdad(edad);
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    public static void verificarEdad(int edad){
        if(edad<0 || edad>120)
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120");
        if(edad<18)
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
    }
}
