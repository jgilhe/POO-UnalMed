package actividad6_poo_EjercicioPag132;
public class Main {
 public static void main(String[] args) {
  String[] palabras={"Teoría del caos","efecto mariposa","sistemas no lineales","física cuántica"};
  ArticuloCientifico articulo=new ArticuloCientifico("Caos: la creación de una ciencia (Chaos: Making a New Science)","James Gleick",palabras,"Viking Press",1987,"Este libro narra el nacimiento de la teoría del caos como una nueva rama de la ciencia moderna.");
  articulo.imprimir();
 }
}