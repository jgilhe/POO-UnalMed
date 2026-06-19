package com.unal.poo.actividad4_epr_jgh.excepciones; 

import java.util.*; 

public class EquipoMaratonProgramacion{
    
    private ArrayList<Programador> p=new ArrayList<>(); 
    private int tam; 
    public EquipoMaratonProgramacion(String n,String u,String l,int t){tam=t;} 
    public boolean estaCompleto(){return p.size()>=tam;} 
    public void agregarProgramador(Programador pr) throws Exception{
        if(estaCompleto()) throw new Exception("Equipo lleno"); 
        p.add(pr);} 
    public static String validarTexto(String d,String c) throws Exception{
         if(!d.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) throw new Exception(c+" debe contener solo letras.");
          if(d.length()>=20) throw new Exception(c+" no puede tener 20 o más caracteres."); return d;}}