
package com.unal.poo.actividad4_epr_jgh.excepciones427;
import java.io.*;
public class LeerArchivo{
    public static String leer(String ruta) throws Exception{
        StringBuilder sb=new StringBuilder();
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(ruta)));
        String linea;
        while((linea=br.readLine())!=null) sb.append(linea).append("\n");
        br.close();
        return sb.toString();
    }
}
