public class ClientePremiun extends Cliente {
    public ClientePremiun(String nombre, String dni) {
        super(nombre, dni);
    }
    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * 0.20;
    }
}

