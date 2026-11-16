public class Main {
    public static void main(String[] args) {
        Cliente regular = new ClienteRegular("gabriel", "12345678");
        Cliente premiun = new ClientePremiun("tomi", "567890123");
        Cliente corporativo = new ClienteCorporativo("pedro", "87654321");

        Factura factura1 = new Factura(regular, 100000);
        Factura factura2 = new Factura(premiun, 100000);
        Factura factura3 = new Factura(corporativo, 100000);
        factura1.mostrarFactura();
        factura2.mostrarFactura();
        factura3.mostrarFactura();
    }
}
