package actividad6_poo_EjercicioPag127;
public class Main {
 public static void main(String[] args) {
  Pedido pedido = new Pedido();
  double p1=pedido.calcularPedido(12000,5000);
  System.out.println("PEDIDO 1\nTOTAL: $"+p1);
  double p2=pedido.calcularPedido(10000,22000,4000);
  System.out.println("\nPEDIDO 2\nTOTAL: $"+p2);
  double p3=pedido.calcularPedido(9000,18000,6000,7000);
  System.out.println("\nPEDIDO 3\nTOTAL: $"+p3);
 }
}