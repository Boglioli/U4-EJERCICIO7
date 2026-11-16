public class Factura {
private Cliente cliente;
private double subtotal;
public Factura(Cliente cliente, double subtotal) {
    this.cliente = cliente;
    this.subtotal = subtotal;
}
public void mostrarFactura() {
    double descuento = cliente.aplicarDescuento(subtotal);
    double total = subtotal - descuento;
    System.out.println("cliente: " + cliente.nombre);
    System.out.println("subtotal: $ " + subtotal);
    System.out.println("descuento: $ " + descuento);
    System.out.println("total a pagar: $ " + total);
    System.out.println("-----------------------");
}
}
