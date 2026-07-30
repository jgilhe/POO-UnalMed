package actividad6_poo_EjercicioPag127;
public class Pedido {
 public double calcularPedido(double primerPlato,double bebida){return primerPlato+bebida;}
 public double calcularPedido(double primerPlato,double segundoPlato,double bebida){return primerPlato+segundoPlato+bebida;}
 public double calcularPedido(double primerPlato,double segundoPlato,double bebida,double postre){return primerPlato+segundoPlato+bebida+postre;}
}