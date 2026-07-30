package actividad6_poo_EjercicioPag132;
public class ArticuloCientifico {
 private String titulo,autor,publicacion,resumen;
 private String[] palabrasClave;
 private int ano;
 public ArticuloCientifico(String titulo,String autor){this.titulo=titulo;this.autor=autor;}
 public ArticuloCientifico(String titulo,String autor,String[] palabrasClave,String publicacion,int ano){this(titulo,autor);this.palabrasClave=palabrasClave;this.publicacion=publicacion;this.ano=ano;}
 public ArticuloCientifico(String titulo,String autor,String[] palabrasClave,String publicacion,int ano,String resumen){this(titulo,autor,palabrasClave,publicacion,ano);this.resumen=resumen;}
 public void imprimir(){System.out.println("Título: "+titulo);System.out.println("Autor: "+autor);System.out.print("Palabras clave: ");if(palabrasClave!=null){for(int i=0;i<palabrasClave.length;i++){System.out.print(palabrasClave[i]);if(i<palabrasClave.length-1)System.out.print(", ");}}else System.out.print("No registradas");System.out.println();System.out.println("Publicación: "+publicacion);System.out.println("Año: "+ano);System.out.println("Resumen: "+resumen);}
}